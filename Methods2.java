import java.util.Scanner;

class Operation {

    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }
}

public class Methods2 {

    public static void main(String[] args) {

        System.out.println("Enter a and b values");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = Operation.sum(a, b); 

        System.out.println("Sum is: " + result);

        sc.close();
    }
}