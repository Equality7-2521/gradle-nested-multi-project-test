package foobarbaz.server;

import foobarbaz.service.one.impl.OneService;
import foobarbaz.service.two.impl.TwoService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from foorbarbaz.server.Main");
        OneService.doSomething();
        TwoService.doSomething();
    }
}
