class greetings{
    public void hello(String name){// its a instance method in this we use class and call the method
        System.out.println("Hello" +name);
    }
}

public class methods {
    public static void main(String[] args) {
        System.out.println("in a main method");
        String name = "world";
        greetings greet = new greetings();
        greet.hello(name);
        System.out.println("end");
    }
}