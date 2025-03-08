// criação de classe
public class Pessoa {
    //atributos
    private int idade;
    private String nome;
    private double peso;
    
    public Pessoa (int idade, String nome, double peso){ // método construtor
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    public void definirNome(String n){ //método set
        this.nome = n;
    }
    public void definirIdade(int i){ 
        this.idade = i;
    }
    public void definirPeso(double p){ 
        this.peso = p;
    }
    public String retornaNome(){ //método get
        return nome;
    }
    public int retornaIdade(){
        return idade;
    }
    public double retornaPeso(){
        return peso;
    }
    public static void main(String[] args){
    Pessoa objPessoa = new Pessoa(25, "Pedro", 50); // criação de instância/objeto
    objPessoa.definirNome ("Maria");
    objPessoa.definirIdade(18);
    objPessoa.definirPeso (60.8);
    System.out.println("nome: "+objPessoa.retornaNome()+" idade: "+objPessoa.retornaIdade()+" peso:"+objPessoa.retornaPeso());
}
}