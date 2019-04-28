You can run this sample locally :
 * SpringBoot : POST http://localhost:8080/hello       body : { "name: "bob" }
 * Azure      : POST http://localhost:7071/api/hello   body : { "name: "bob" }

NOTE: 
    Azure application DOES NOT WORK if Person and WelcomeMessage are case class
    This version defines Person.java and WelcomeMessage.java, and it is ok.