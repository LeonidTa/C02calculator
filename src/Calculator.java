import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,ergebnis;

        System.out.println("Bitte die erste Zahl eingeben: ");
        Scanner scanA = new Scanner(System.in);
        a = scanA.nextInt();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        Scanner scanB = new Scanner(System.in);
        b = scanB.nextInt();

        System.out.println("Möchten Sie addieren, subtrahieren, multiplizieren oder addieren? ");
        Scanner scanCmd = new Scanner(System.in);
        String cmd = scanCmd.next();


            switch (cmd) {
                case "+":
                    ergebnis = a + b;
                    System.out.println(a + " + " + b + " = " + ergebnis);
                    break;
                case "-":
                    ergebnis = a + b;
                    System.out.println(a + " + " + b + " = " + ergebnis);
                    break;
                case "*":
                    ergebnis = a + b;
                    System.out.println(a + " + " + b + " = " + ergebnis);
                    break;
                case "%":
                    ergebnis = a + b;
                    System.out.println(a + " + " + b + " = " + ergebnis);
                    break;
                default:
                    break;
            }
    }
}
