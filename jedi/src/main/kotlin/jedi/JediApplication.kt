package jedi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JediApplication

fun main(args: Array<String>) {
    runApplication<JediApplication>(*args)
}
