import java.util.Calendar;
public class Empregado extends PF {
    //Atributos
    protected String matricula;
    private final Calendar data_admissao;
    private Calendar data_demissao;

    //Métodos
    public Empregado(String matricula, String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
        this.matricula = null;
        data_admissao = Calendar.getInstance();
        data_demissao = null;
    }
    public void demitirEmpregado () {
        data_demissao = Calendar.getInstance();
    }
    protected void gerarMatricula () {
        this.matricula = null;
    }
    protected String recuperarMatricula () {
        return this.matricula;
    }
    protected Calendar recuperAdmissao () {
        return this.data_admissao;
    }
    protected Calendar recuperDemissao () {
        return this.data_demissao;
    }
}
