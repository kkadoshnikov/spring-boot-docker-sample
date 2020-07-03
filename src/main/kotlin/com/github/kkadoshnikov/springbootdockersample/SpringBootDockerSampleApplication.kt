package com.github.kkadoshnikov.springbootdockersample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootDockerSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootDockerSampleApplication>(*args)
}
