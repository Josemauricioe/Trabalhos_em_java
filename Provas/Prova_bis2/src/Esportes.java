import java.util.Scanner;

public class Esportes {

    private String esporte_op;
    private String volei = "Vôlei";
    private String futebol = "Futebol";
    private String basquete = "Basquete";

    public Esportes() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual esporte a equipe participou nos jogos?");
        esporte_op = ler.nextLine();
        futebol = "Futebol";
        volei = "Vôlei";
        basquete = "Basquete";

        if (esporte_op.equalsIgnoreCase("volei")){
            esporte_op = volei;
        }
        if (esporte_op.equalsIgnoreCase("futebol")){
            esporte_op = futebol;
        }
        if (esporte_op.equalsIgnoreCase("basquete")){
            esporte_op = basquete;
        }
    }

    public String getEsporte_op() {
        return esporte_op;
    }

    public void setEsporte_op(String esporte_op) {
        this.esporte_op = esporte_op;
    }

    public String getVolei() {
        return volei;
    }

    public void setVolei(String volei) {
        this.volei = volei;
    }

    public String getFutebol() {
        return futebol;
    }

    public void setFutebol(String futebol) {
        this.futebol = futebol;
    }

    public String getBasquete() {
        return basquete;
    }

    public void setBasquete(String basquete) {
        this.basquete = basquete;
    }

    public void exibir_esportes(){
        System.out.println("Esporte que a equipe participou:"+esporte_op);
    }

}


