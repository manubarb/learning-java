import java.util.Scanner;

public class PrincipalFib {
    private static Fibonacci fib;
    private static Scanner entrada;
     
    public static void main(String args[]) {
        double num = 0;
        entrada = new Scanner(System.in);
        fib = new Fibonacci();
        
        do {
            System.out.println("Entre com um numero nao negativo ou \"-1\" para sair: ");
            num = entrada.nextDouble();
            
            if (num == -1) {
                System.exit(0);
            }
            
            if (num >= 0) {
                fib.resetContador();
                System.out.println("O " + num + "-esimo termo de Fibonacci eh: " + fib.CalcularFibonacci(num));
            } else {
                System.out.println("Insira um numero nao negativo.");
            }
        } while (true);
    }
}
