package org.amarcel.tutorial_spring_cloud.hello;

//case class Person(name: String)

public class Person {

  public String name;

  @Override
  public String toString() {
    return String.format("Person{name='%s'}", name);
  }
}

