package org.amarcel.tutorial_spring_cloud.hello;

//case class WelcomeMessage(welcomeMessage: String)

public class WelcomeMessage {

  public String welcomeMessage;

  @Override
  public String toString() {
    return String.format("WelcomeMessage{welcomeMessage='%s'}", welcomeMessage);
  }
}
