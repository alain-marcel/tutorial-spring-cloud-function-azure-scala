package org.amarcel.tutorial_spring_cloud.hello

import org.springframework.stereotype.Component

import java.util.function.Function

@Component(HelloFunction.FUNCTION_NAME)
class HelloFunction extends Function[Person, WelcomeMessage] {

  @Override
  def apply(person: Person): WelcomeMessage = {
    val message = s"Welcome ${person.name}"
    WelcomeMessage(message)
  }
}


object HelloFunction {
  final val FUNCTION_NAME = "hello"  
}
