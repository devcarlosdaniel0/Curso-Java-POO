package aula04;

public class Aula04 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Faber", "Vermelha", 0.4f);
        c1.status();
        
        System.out.println("--------------");
        
        Caneta c2 = new Caneta("Bic", "Azul", 0.8f);
        c2.status();
    }

}
