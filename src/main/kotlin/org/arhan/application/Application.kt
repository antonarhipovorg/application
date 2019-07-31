package org.arhan.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    println("Start the application!")
    runApplication<Application>(*args)
}

fun zzz() = "zzz"
fun yyy() = "yyy"
fun zzz() = "xxx"

fun b(): String {
    println("This is a method!!!")
    return "method"
}
