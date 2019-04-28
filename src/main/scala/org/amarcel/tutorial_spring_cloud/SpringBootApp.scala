package org.amarcel.tutorial_spring_cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(lazyInit = true)
class SpringBootApp

object SpringBootApp {

    def main(args: Array[String]) {
        val bootstrapClasses: Array[Class[_]] = Array(classOf[SpringBootApp])
        SpringApplication.run(bootstrapClasses, args)
    }
}
