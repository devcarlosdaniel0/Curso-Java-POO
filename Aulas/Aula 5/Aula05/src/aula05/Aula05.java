package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(130);
        p1.setDono("Maria");
        p1.abrirConta("CP");
        p1.depositar(110);
        p1.sacar(31.45f);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(400);
        p2.setDono("Carlos");
        p2.abrirConta("CC");
        p2.depositar(200);
        p2.sacar(40.5f);
        p2.estadoAtual();
        
    }

}
