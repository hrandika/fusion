package com.hrandika.spring.school

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchoolApplication

fun main(args: Array<String>) {
    runApplication<SchoolApplication>(*args)
}