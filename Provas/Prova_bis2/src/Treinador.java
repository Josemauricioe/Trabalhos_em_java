import java.util.Scanner;

public class Treinador {

    private String nome;
    private String cursp_treinador;
    private String telefone;

    public Treinador() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do treinador?");
        nome = ler.nextLine();
        System.out.println("Qual o curso do treinador?");
        cursp_treinador = ler.nextLine();
        System.out.println("Qual o telefone do treinador?");
        telefone = ler.nextLine();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursp_treinador() {
        return cursp_treinador;
    }

    public void setCursp_treinador(String cursp_treinador) {
        this.cursp_treinador = cursp_treinador;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibir_treinnador(){
        System.out.println("Nome do treinador: "+nome);
        System.out.println("Curso do treinador: "+cursp_treinador);
        System.out.println("Telefone do treinador: "+telefone);
    }

}
