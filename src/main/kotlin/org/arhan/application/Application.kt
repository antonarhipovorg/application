package org.arhan.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application
//hello
fun main(args: Array<String>) {
    println("Start the application!")
    runApplication<Application>(*args)
}
