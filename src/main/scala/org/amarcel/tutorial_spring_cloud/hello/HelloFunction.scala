package org.amarcel.tutorial_spring_cloud.hello

import java.util.function.Function

import org.springframework.stereotype.Component

@Component(HelloFunction.FUNCTION_NAME)
class HelloFunction extends Function[Person, WelcomeMessage] {

  @Override
  def apply(person: Person): WelcomeMessage = {
    WelcomeMessage(s"Welcome ${person.name}")
  }
}


object HelloFunction {
  final val FUNCTION_NAME = "hello"
}
