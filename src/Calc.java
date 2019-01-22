import java.util.Scanner;

public class Calc {

    Scanner scanner = new Scanner(System.in);

    int calculation(){
        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();
        if (a>b){
            return a+b;
        }
        if (a<b){
            return a*b;
        }
        return a*a;
    }
}

