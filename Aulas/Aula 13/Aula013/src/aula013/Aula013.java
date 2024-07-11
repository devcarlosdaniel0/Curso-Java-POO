package aula013;

public class Aula013 {

    public static void main(String[] args) {
        //Animal a = new Animal();
        /*Mamifero m = new Mamifero();
        m.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        c.emitirSom();*/
        Cachorro c = new Cachorro();
        
        System.out.println("---------");
        c.reagir("oi");
        c.reagir("comer?");
        c.reagir("Não!");
        
        System.out.println("---------");
        c.reagir(true);
        c.reagir(false);
        
        System.out.println("---------");
        c.reagir(11,10);
        c.reagir(12,30);
        c.reagir(18,30);
        
        System.out.println("---------");
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}