import java.util.Calendar;
import java.util.UUID;
public class Diretor extends Empregado {
    //Método construtor   
    public Diretor(String matricula, String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
         super(matricula, nome, data_nascimento, CPF, endereco);    
    } 
    @Override
    protected void gerarMatricula(){
         matricula = "E-" + UUID.randomUUID( ).toString( );  
    }
 }
