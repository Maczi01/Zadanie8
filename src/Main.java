import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();
        System.out.println(calc.calculation(a,b));
    }
}
