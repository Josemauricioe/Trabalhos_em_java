import java.util.*;

public class Pessoa {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(){
        System.out.println("Digite o seu nome por favor:");
        nome = ler.nextLine();
        System.out.println("Digite seu CPF por favor:");
        cpf = ler.nextLine();
    }
    public void exibir(){
        System.out.println("==================================");
        System.out.println("CPF:\n"+cpf);
    }
}
