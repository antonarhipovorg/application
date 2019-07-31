package org.arhan.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    println("Start the application!")
    runApplication<Application>(*args)
}

fun aaa() = "aaa"
fun bbb() = "bbb"
fun ccc() = "ccc"

fun blah() = "asdaSD"
