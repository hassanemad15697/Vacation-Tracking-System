package com.coworks.vacationtrackingsystem.vts.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationRabbitMQConfig {

    public static final String QUEUE = "notificationQueue";
    public static final String EXCHANGE = "notificationExchange";

    @Bean
    Queue notificationQueue() {
        return new Queue(QUEUE, false);
    }

    @Bean
    DirectExchange notificationExchange() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    Binding notificationBinding(@Qualifier("notificationQueue") Queue notificationQueue, @Qualifier("notificationExchange") DirectExchange notificationExchange) {
        return BindingBuilder.bind(notificationQueue).to(notificationExchange).with("notificationKey");
    }

    @Bean
    public RabbitTemplate notificationRabbitTemplate(final ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(notificationMessageConverter());
        return rabbitTemplate;
    }

    @Bean
    public Jackson2JsonMessageConverter notificationMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}

