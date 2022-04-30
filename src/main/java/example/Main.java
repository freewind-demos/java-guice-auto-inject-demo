package example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector();
    MyService myService = injector.getInstance(MyService.class);
    String message = myService.sayHello("Freewind");
    System.out.println(message);
  }
}
