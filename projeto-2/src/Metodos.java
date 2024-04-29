public class Metodos {
    public double somar(int n1, int n2) {
        return n1 + n2;
    }
    public void imprimir(String texto){
        System.out.println(texto);
    }
    public double dividir(int dividendo, int divisor)throws Exception{
        return dividendo/divisor;
    }
    private void metodoPrivado(){
    }
    public void validar(){
        // metodo deveria retornar algum valor no caso boolean true or false EQUIVOCO ESTRUTURAL
    }
    // QUANDO RECEBER UM METODO QUE NECESSITA MUITOS PARAMETROS UTILIZAR POO OU A ORIENTACAO A OBJETOS

    public static void main(String[] args) {

    int n1 = 3;
    int n2 = 4;

    }
}
