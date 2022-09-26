package LamdasUsage;

import java.util.Scanner;

public class Calculator {

    // code made to practice using lambdas and interface

    public static void main(String[] args) {

        String op = " ";
        int out = 0;

        Scanner scan = new Scanner(System.in);

        Functional sum = (x, y) -> {return x + y;};
        Functional sub = (x, y) -> {return x - y;};
        Functional mult = (x, y) -> {return x * y;};
        Functional div = (x, y) -> {return x / y;};

        while (out != 1) {
            double result = 0;
            System.out.println("\nCalculator\n");

            System.out.print("Type a number: ");
            double a = scan.nextDouble();
            System.out.print("\nType the operator: ");
            op = scan.next();
            System.out.print("\nType a number: ");
            double b = scan.nextDouble();

            if (op.equals("+")) {
                result = sum.execute(a, b);
                System.out.printf("%nResult: %15.2f%n%12s%11.2f%n             %s%n%23.2f%n", a, op, b, "----------", result);
            } else if (op.equals("-")) {
                result = sub.execute(a, b);
                System.out.printf("%nResult: %15.2f%n%12s%11.2f%n             %s%n%23.2f%n", a, op, b, "----------", result);
            } else if (op.equals("*")) {
                result = mult.execute(a, b);
                System.out.printf("%nResult: %15.2f%n%12s%11.2f%n             %s%n%23.2f%n", a, op, b, "----------", result);
            } else if (op.equals("/")) {
                result = div.execute(a, b);
                System.out.printf("%nResult: %15.2f%n%12s%11.2f%n             %s%n%23.2f%n", a, op, b, "----------", result);
            }

            System.out.print("\n[1] - Go out\n[2] - Calculate again\n\nInput: ");
            out = scan.nextInt();

        }
        System.out.println("\nend\n");
        scan.close();

    }
  
}