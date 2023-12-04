import java.util.Scanner;

public class EsDivisibleMain {
    public static boolean esDivisible(int x, int y){
        return  (x % y == 0);
    }
    public static void main(String[] args) {
        int dividendo;
        int divisor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dividendo");
        dividendo = teclado.nextInt();
        divisor = teclado.nextInt();

        if (esDivisible(dividendo, divisor)){
            System.out.println("Es divisible");
        }else {
            System.out.println("NO Es divisible");
        }

    }
}
