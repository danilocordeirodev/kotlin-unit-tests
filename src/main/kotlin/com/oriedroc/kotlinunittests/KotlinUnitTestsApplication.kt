package com.oriedroc.kotlinunittests

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinUnitTestsApplication

fun main(args: Array<String>) {
    runApplication<KotlinUnitTestsApplication>(*args)
}
