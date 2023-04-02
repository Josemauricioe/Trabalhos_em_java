import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private ArrayList <Pessoa> pessoas = new ArrayList<>();
    Scanner ler = new Scanner(System.in);
    Scanner ler1 = new Scanner(System.in);
    public void menu(){


        int op = 0;


        do {

            System.out.println("=============================Menu===========================");
            System.out.println("1 - Castradar pessoa:");
            System.out.println("2 - Devolução:");
            System.out.println("3 - Remove um usuário:");
            System.out.println("4 - SAIR");
            System.out.println("=============================================================");
            op = ler.nextInt();

            switch (op){
                case 1:
                    Castradar();
                    break;
                case 2:
                    devolucao();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Por favor digite um número valido!!!!!");
            }

        }while (op != 4);

        }

        public void Castradar(){
            int op = 0;
            System.out.println("O que você deseja castradar?");
            System.out.println("1 - Estudante\n2 - Professor\n3 - Tecnicos admistrativos");
            op = ler.nextInt();
            switch (op){
                case 1:
                    pessoas.add(new Estudante());
                    break;
                case 2:
                    pessoas.add(new Professor());
                    break;
                case 3:
                    pessoas.add(new Tecnicos_admistrativos());
                    break;
                default:
                    System.out.println("Por favor digite um número valido!!!!!");
            }

        }

        public void devolucao(){
            String cpf;
            System.out.println("Por favor digite o cpf para retreio do usuário:");
            for (Pessoa pessoa: pessoas){
                pessoa.exibir();
            }
            cpf = ler1.nextLine();
            System.out.println("Agora digite quantos dias ele ficou com o livro:");
            int dias = ler.nextInt();

            for (int i = 0; i < pessoas.size(); i++) {
                if (cpf.equalsIgnoreCase(pessoas.get(i).getCpf()) && pessoas.get(i) instanceof Estudante) {
                    if (dias > 5) {
                        int dias_atrs = 5;
                        double valor;

                        int dia_to = dias - dias_atrs;

                        valor = dia_to * 0.50;
                        System.out.println("Passou a de 5 dias vai ter que pagar exatamente:\n" + valor);
                    }
                }
            }
                     for (int i1 = 0; i1 < pessoas.size(); i1++) {
                         if (cpf.equalsIgnoreCase(pessoas.get(i1).getCpf()) && pessoas.get(i1) instanceof Professor) {
                             if (dias > 10) {
                                 int dias_atrs = 10;
                                 double valor;

                                 int dia_to = dias - dias_atrs;

                                 valor = dia_to * 0.50;
                                 System.out.println("Passou a de 10 dias vai ter que pagar exatamente:\n" + valor);
                             }
                         }
                     }
                        for (int i2 = 0; i2 < pessoas.size(); i2++) {
                            if (cpf.equalsIgnoreCase(pessoas.get(i2).getCpf()) && pessoas.get(i2) instanceof Tecnicos_admistrativos) {
                                if (dias > 8) {
                                    int dias_atrs = 8;
                                    double valor;

                                    int dia_to = dias - dias_atrs;

                                    valor = dia_to * 0.50;
                                    System.out.println("Passou a de 8 dias vai ter que pagar exatamente:\n" + valor);
                                }
                            }
                        }
                    }



    public void remove(){

        String cpf;
        System.out.println("Por favor digite o cpf para retreio do usuário:");
        for (Pessoa pessoa: pessoas){
            pessoa.exibir();
        }
        cpf = ler1.nextLine();

        for (int i = 0; i < pessoas.size(); i++) {
            if (cpf.equalsIgnoreCase(pessoas.get(i).getCpf()) && pessoas.get(i) instanceof Estudante) {
                    pessoas.remove(i);
                    System.out.println("Usuario removindo com Sucesso!!!!!");

            }
        }
        for (int i1 = 0; i1 < pessoas.size(); i1++) {
            if (cpf.equalsIgnoreCase(pessoas.get(i1).getCpf()) && pessoas.get(i1) instanceof Professor) {
                    pessoas.remove(i1);
                    System.out.println("Usuario removindo com Sucesso!!!!!");

            }
        }
        for (int i2 = 0; i2 < pessoas.size(); i2++) {
            if (cpf.equalsIgnoreCase(pessoas.get(i2).getCpf()) && pessoas.get(i2) instanceof Tecnicos_admistrativos) {
                pessoas.remove(i2);
                    System.out.println("Usuario removindo com Sucesso!!!!!");

            }
        }
    }

    }





