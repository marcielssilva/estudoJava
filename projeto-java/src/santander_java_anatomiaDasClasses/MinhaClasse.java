package santander_java_anatomiaDasClasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Marciel";
        String segundoNome = "S. Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return primeiroNome.concat(" ").concat(segundoNome); // utilizando metodo .concat()
    }
}
