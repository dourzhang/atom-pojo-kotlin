package com.watent.kotlin

import feign.Contract
import feign.Logger
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Kotlin AutoConfiguration
 *
 *
 * Created by Atom on 2017/7/17.
 */
@Configuration
open class KotlinAutoConfiguration{

    @Bean
    open fun feignContract(): Contract {
        return feign.Contract.Default()
    }

    @Bean
    internal open fun feignLoggerLevel(): Logger.Level {
        return Logger.Level.BASIC
    }
}
