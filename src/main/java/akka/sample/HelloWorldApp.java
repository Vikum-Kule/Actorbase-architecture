package akka.sample;

import akka.actor.typed.ActorSystem;

public class HelloWorldApp {
    public static  void  main(String[] args){
         ActorSystem<HelloWorld.Command> mySystem =ActorSystem.create(HelloWorld.create(),"mySystem");
         mySystem.tell(HelloWorld.SayHello.INSTANCE);
         mySystem.tell(HelloWorld.SayHello.INSTANCE);
        mySystem.tell(new HelloWorld.ChangeMessage("Hello Actro world"));
        mySystem.tell(HelloWorld.SayHello.INSTANCE);
        mySystem.tell(HelloWorld.SayHello.INSTANCE);
    }
}
