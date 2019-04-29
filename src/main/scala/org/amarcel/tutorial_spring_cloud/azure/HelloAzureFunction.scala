package org.amarcel.tutorial_spring_cloud.azure

import java.util.Optional
import scala.compat.java8.OptionConverters._

import org.amarcel.tutorial_spring_cloud.hello.{HelloFunction, Person, WelcomeMessage}
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler

import com.microsoft.azure.functions.annotation.{AuthorizationLevel, FunctionName, HttpTrigger}
import com.microsoft.azure.functions.{ExecutionContext, HttpMethod, HttpRequestMessage}

/**
  * SpringBoot : POST http://localhost:8080/hello       { "name: "bob" }
  * Azure   DO NOT WORK   : POST http://localhost:7071/api/hello   { "name: "bob" }
  */
@SuppressWarnings(Array("unused"))
class HelloAzureFunction
  extends AzureSpringBootRequestHandler[Person, WelcomeMessage] {

  @FunctionName(HelloFunction.FUNCTION_NAME)
  def execute(
               @HttpTrigger(
                 name = "req",
                 methods = Array(HttpMethod.GET, HttpMethod.POST),
                 authLevel = AuthorizationLevel.ANONYMOUS)
               request: HttpRequestMessage[Optional[Person]],
               context: ExecutionContext
             ): WelcomeMessage = {

    request.getBody.asScala
      .map(person => handleRequest(person, context))
      .getOrElse(WelcomeMessage("HTTP Body missing, e.g. { \"name\": \"Bob\" }"))
  }

}
