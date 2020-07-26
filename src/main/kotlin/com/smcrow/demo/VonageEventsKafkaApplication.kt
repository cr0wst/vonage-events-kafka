package com.smcrow.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VonageEventsKafkaApplication

fun main(args: Array<String>) {
    runApplication<VonageEventsKafkaApplication>(*args)
}
