package com.hrandika.spring.school

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SchoolApplication

fun main(args: Array<String>) {
    runApplication<SchoolApplication>(*args)
}

@RestController
@RequestMapping("/")
class HelloController() {

    @GetMapping
    fun sayHello(): Any {
        return object {
            var message = "Hello,world !!"
        }
    }
}