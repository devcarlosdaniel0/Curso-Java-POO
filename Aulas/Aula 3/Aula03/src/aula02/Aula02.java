package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 60f;
        c1.carga = 40;
        // c1.tampada = true;
        c1.tampar(); 
        c1.status();
    }

}
