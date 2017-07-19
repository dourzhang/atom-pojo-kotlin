package com.watent.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Kotlin Application
 *
 * Created by Atom on 2017/7/17.
 */
@EnableDiscoveryClient
@SpringBootApplication
open class KotlinServerApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(KotlinServerApplication::class.java, *args)
        }
    }
}