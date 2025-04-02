public class Fibonacci {
    // Atributos
    private static int conta_chamada = 0; 
    public void resetContador() {
      conta_chamada = 0;
  }
    public double CalcularFibonacci(double num) {
        conta_chamada++;
        System.out.println("Chamada recursiva nr: " + conta_chamada);
        
        if (num <= 1) {
            return num;
        }
        return CalcularFibonacci(num - 1) + CalcularFibonacci(num - 2);
    }
}
