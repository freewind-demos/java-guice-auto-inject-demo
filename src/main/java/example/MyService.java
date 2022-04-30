package example;


import javax.inject.Inject;

public class MyService {

  private final MyHello1 hello1;

  private final MyHello2 myHello2;

  @Inject
  public MyService(MyHello1 hello1, MyHello2 hello2) {
    this.hello1 = hello1;
    this.myHello2 = hello2;
  }

  public String sayHello(String user) {
    return this.hello1.hello(user) + "\n" + this.myHello2.hello(user);
  }
}
