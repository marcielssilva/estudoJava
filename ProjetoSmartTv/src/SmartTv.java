public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void aumentarVolume()
    {
        System.out.println("Aumentando Volume . . .");
        volume++;
    }
    public void diminuirVolume()
    {
        System.out.println("Diminuindo Volume . . .");
        volume--;
    }
    public void mudarCanal(int novoCanal)
    {
        canal = novoCanal;
    }
    public void aumentarCanal(){
        System.out.println("Aumentando Canal . . .");
        canal++;
    }
    public void diminuirCanal()
    {
        System.out.println("Diminuindo Canal . . .");
       canal--;
    }
    public void ligar()
    {
        ligada = true;
    }
    public void desligar()
    {
        ligada = false;
    }


}
