package aula06;
public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.pause();
        c.menosVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }

}