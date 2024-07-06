package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1357);
        p1.setDono("Carlos");
        p1.abrirConta("CC");
        

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2024);
        p2.setDono("Maria");
        p2.abrirConta("CP");        

        p1.estadoAtual();
        p2.estadoAtual();
        
    }

}
