package com.hao.chapter12.config;

import org.springframework.context.annotation.Configuration;
/**
 * RabbitMQ配置
 *
 * @author Hercules
 * @since 2019年3月5日15:53:50
 */
@Configuration
public class RabbitConfig {
    public static final String DEFAULT_BOOK_QUEUE = "dev.book.register.default.queue";
    public static final String MANUAL_BOOK_QUEUE = "dev.book.register.manual.queue";
}
