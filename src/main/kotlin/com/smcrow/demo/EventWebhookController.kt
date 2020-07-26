package com.smcrow.demo

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EventWebhookController {
    @PostMapping("/webhooks/events")
    fun incomingEvents(@RequestBody body: String) {
        // Handle the Event Here
        log.info(body)
    }

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }
}