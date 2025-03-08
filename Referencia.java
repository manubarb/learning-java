public class Referencia {
    private final Aluno a1; //uma constante
    private Aluno a2;
    public Referencia  ( ) {
     a1 = new Aluno ( "Carlos" , 20, 56.7,"Centro de Educação");
     a2 = new Aluno ( "Ana" , 23, 45.3,"Instituto Educacional" );

     System.out.println(" Antes de alterar a1 e a2");
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome());

     a2 = a1;
     System.out.println(" Depois de alterar a2 = a1");
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome());

     a2.definirNome("Flávia");
     System.out.println(" Depois de alterar a2 para Flávia");
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome());

     manipulaAluno ( a1 );
     System.out.println(" Depois do método manipulaAluno definir nome de a1 como Márcia");
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome());

     a1.definirNome("Pedro");
     a2.definirNome("Maria");
     System.out.println(" o que acontece se eu mudo a1 e a2");
     System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
     System.out.println("O nome do aluno a2 é " + a2.recuperarNome());
    }
    public static void manipulaAluno ( Aluno aluno ) {
     aluno.definirNome("Márcia");
    }
    public static void main(String args[]) {
        //Referencia r = new Referencia ();
        System.out.println("Fim da Execução ");
 }

}
