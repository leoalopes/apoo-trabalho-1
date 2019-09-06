import java.text.SimpleDateFormat;
import java.util.Date;

public class Tecnico extends Funcionario {
    private String cargo = "TECNICO";
    
    public Tecnico(String nome, Double salario, Date admissao) {
        super(nome, salario, admissao);
    }
    
    @Override
    public String getNome() {
        return this.cargo + " - " + this.nome;
    }
    
    @Override
    public String getSalario() {
        return this.cargo + " - " + new Double(this.salario).toString();
    }
    
    @Override
    public String getAdmissao() {
        return this.cargo + " - " + new SimpleDateFormat("dd/MM/yyyy").format(this.admissao);
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
               "Cargo: " + this.cargo + "\n" +
               "Salário: " + this.salario + "\n" +
               "Data da admissão: " + new SimpleDateFormat("dd/MM/yyyy").format(this.admissao);
    }
}