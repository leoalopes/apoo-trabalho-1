import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    protected String nome;
    protected Double salario;
    protected Date admissao;
    
    public Funcionario(String nome, Double salario, Date admissao) {
        this.nome = nome;
        this.salario = salario;
        this.admissao = admissao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return new Double(this.salario).toString();
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getAdmissao() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.admissao);
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\n" +
               "Salário: " + this.salario + "\n" +
               "Data da admissão: " + new SimpleDateFormat("dd/MM/yyyy").format(this.admissao);
    }
}
