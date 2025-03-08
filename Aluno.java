public class Aluno extends Pessoa {
     private String nome;
     private int idade;
     private String escola;
     public Aluno ( String nome , int idade, double peso, String escola) {
          super(idade, nome, peso); //herda o construtor de pessoa
          this.escola = escola;
     }
     @Override
     public void definirNome ( String nome ) {
          this.nome = nome;
     }  
     @Override
     public void definirIdade ( int idade ) {
          this.idade = idade;
     }
     public void definirEscola(String escola){
          this.escola = escola;
     }
     public String recuperarNome () {
          return this.nome;
     }    
     public int recuperarIdade () {
          return this.idade;
     }   
     public String recuperarEscola(){
          return this.escola;
     }
 }
 

