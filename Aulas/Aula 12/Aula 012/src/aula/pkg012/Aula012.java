package aula.pkg012;

public class Aula012 {

    public static void main(String[] args) {
        // Animal a = new Animal(); abstrato
        Mamifero ma = new Mamifero();
        Reptil re = new Reptil();
        Peixes pe = new Peixes();
        Ave av = new Ave();
        
        Canguru can = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra cob = new Cobra();
        Tartaruga tar = new Tartaruga();
        Goldfish gol = new Goldfish();
        Arara ara = new Arara();
        
        can.emitirSom();
        cac.emitirSom();
    }

}