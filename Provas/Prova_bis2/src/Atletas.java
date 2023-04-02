import java.util.Scanner;

public class Atletas {

    private String nome_atleta;
    private String curso_atleta;
    private int ano;
    private int data_nascimento;


    public Atletas() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do atleta?");
        nome_atleta = ler.nextLine();
        System.out.println("Qual o curso do atleta?");
        curso_atleta = ler.nextLine();
        System.out.println("Qual o ano do atleta?");
        ano = ler.nextInt();
        System.out.println("Qual o data do nascimento?");
        data_nascimento = ler.nextInt();
    }

    public String getNome_atleta() {
        return nome_atleta;
    }

    public void setNome_atleta(String nome_atleta) {
        this.nome_atleta = nome_atleta;
    }

    public String getCurso_atleta() {
        return curso_atleta;
    }

    public void setCurso_atleta(String curso_atleta) {
        this.curso_atleta = curso_atleta;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(int data_nascimento) {
        this.data_nascimento = data_nascimento;
    }


    public void exibir1(){

        System.out.println("O nome do atleta é: "+nome_atleta);
        System.out.println("O curso do atleta é: "+curso_atleta);
        System.out.println("O ano do atleta é: "+ano);
        System.out.println("A data de nascimento é: "+data_nascimento);

    }

    public void exibir2(){
        System.out.println("O nome do atleta é: "+nome_atleta);
    }

}
