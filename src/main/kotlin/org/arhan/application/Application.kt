package org.arhan.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    println("Start the application!!128376128376213")
    runApplication<Application>(*args)
}

fun a(): String {
    println("This is a method")
    return "method"
}


fun b(): String {
    println("This is a method!!!")
    return "method"
}
