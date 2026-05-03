package ErrorHandling;
interface greeter {
    void sayHello(String name);
}

public class LambdaDemo {
    public static void main(String[] args) {
        greeter g = (name) -> System.out.println("Hello " + name + "!");
        greeter g1 = (name) -> System.out.println("Good Morning " + name + "!");
        greeter g2 = (name) -> System.out.println("Good Evening " + name + "!");
        g.sayHello("Mach");
        g1.sayHello("Mach");
        g2.sayHello("Mach");
    }
}
