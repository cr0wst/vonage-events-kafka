package com.smcrow.demo

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EventWebhookController(private val kafkaTemplate: KafkaTemplate<String, String>) {
    @PostMapping("/webhooks/events")
    fun incomingEvents(@RequestBody body: String) {
        // Handle the Event Here
        kafkaTemplate.send("vonage.webhook.events", body)
    }

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }
}