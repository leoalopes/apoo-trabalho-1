import java.util.Date;

public class Funcionario {
    private String nome;
    private Double salario;
    private Date admissao;
    
    public Funcionario(String nome, Double salario, Date admissao) {
        this.nome = nome;
        this.salario = salario;
        this.admissao = admissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\n" +
               "Salário: " + this.salario + "\n" +
               "Data da admissão: " + this.admissao.toString();
    }
}
