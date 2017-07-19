package com.watent.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

/**
 * Kotlin WebApplication
 *
 * Created by Atom on 2017/7/18.
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
open class KotlinWebApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(KotlinWebApplication::class.java, *args)
        }
    }

}