package aula011;

public class Aula011 {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); classe abstrata não pode ser instanciada 
        /*Visitante v1 = new Visitante();
        v1.setNome("Cleber");
        v1.setIdade(30);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Claúdio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(495);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Anderson");
        b1.setIdade(18);
        b1.setSexo("M");
        b1.setMatricula(333);
        b1.setCurso("Eng. da Computação");
        b1.setBolsa(12.4f);
        b1.pagarMensalidade();
        b1.renvoarBolsa();
        System.out.println(b1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Isaque");
        t1.setRegistroProfissional(40);
        t1.praticar();
        System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Ricardo");
        p1.setSalario(500);
        p1.setEspecialidade("Física");
        p1.receberAumento(50);
        System.out.println(p1.toString());
        System.out.println(p1.getSalario());
    }

}