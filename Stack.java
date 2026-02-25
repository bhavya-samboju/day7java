class CallStackExample {

    public static void D() {
        System.out.println("In method D");
    }

    public static void C() {
        D();
        System.out.println("In method C");
    }

    public static void B() {
        C();
        System.out.println("In method B");
    }

    public static void A() {
        B();
        System.out.println("In method A");
    }

    public static void main(String[] args) {
        System.out.println("In main method");

        A(); 

        String name = "World";
        Greetings greet = new Greetings();
        greet.hello(name);

        System.out.println("End of main");
    }
}

class Greetings {
    public void hello(String name) {
        System.out.println("Hello " + name);
    }
}