class hello{
    public void greet(){
        System.out.println("Good morning");
    }

    static void prints(){
        System.out.println("What is your name ?");
    }
}

class hii extends hello{
    public void greet(){                     // method overriding
        System.out.println("Hello Good Evening");
    }

    static void prints(){
        System.out.println("My name is this");
    }
}


public class test {
    public static void main(String[] args) {
        // hello h1 = new hii();  // dynamic dispatch for runtime polymorphism
        hii h2 = new hii();
        h2.greet();
        // h1.greet();      This line of code is giving an error of NoSuchMethodError

        // h2.prints();
    }
}
