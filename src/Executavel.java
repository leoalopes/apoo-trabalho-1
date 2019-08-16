import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Executavel {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insira o nome da empresa");
        String nomeEmpresa = in.nextLine();
        System.out.println("Insira o cnpj da empresa");
        String cnpjEmpresa = in.nextLine();
        System.out.println("Insira a quantidade de funcionários da empresa");
        int quantidadeFuncionarios = in.nextInt();
        
        Empresa empresa = new Empresa(nomeEmpresa, cnpjEmpresa, quantidadeFuncionarios);
        
        while(empresa.getFuncionarios().size() != quantidadeFuncionarios) {
            in.nextLine();
            int indice = empresa.getFuncionarios().size() + 1;
            System.out.println("Insira o nome do " + indice + "º funcionário");
            String nome = in.nextLine();
            System.out.println("Insira o salario do " + indice + "º funcionário");
            Double salario = in.nextDouble();
            System.out.println("Insira a data de admissão do " + indice + "º funcionário (dd/mm/yyyy)");
            String data = in.next();
            try {
                Date admissao = new SimpleDateFormat("dd/MM/yyyy").parse(data);
                Funcionario funcionario = new Funcionario(nome, salario, admissao);
                empresa.getFuncionarios().add(funcionario);
            } catch(Exception e) {
                System.out.println("Insira a data em format dd/mm/yyyy");
            }
        }
        in.nextLine();
        
        System.out.println("Realizando aumento nos salários...");
        in.nextLine();
        
        System.out.println("Mostrando funcionários");
        
        for(int i = 0; i < quantidadeFuncionarios; i++) {
            Funcionario funcionario = empresa.getFuncionarios().get(i);
            funcionario.setSalario(funcionario.getSalario() * 1.10);
            System.out.println(funcionario.toString());
        }
    }
}
