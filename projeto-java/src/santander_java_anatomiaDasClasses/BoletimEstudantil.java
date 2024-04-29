package santander_java_anatomiaDasClasses;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;

        if(mediaFinal < 6)
            System.out.println("Reprovado");
            else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
            else
            System.out.println("Aprovado");
    }
}
