package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Clauser", 30, "M");
        p[1] = new Pessoa("Maria", 23, "F");
        
        l[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 300, p[0]);
        l[1] = new Livro("Java POO para iniciantes", "Pedro de Souza", 500, p[1]);
        l[2] = new Livro("Java avançado", "José de Alencar", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(250);
        l[0].voltarPag(250);
        l[0].avancarPag(20);
        
        p[0].fazerAniver();
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(400);
        l[1].avancarPag(50);
        l[1].voltarPag(25);
        
        p[1].fazerAniver();
        System.out.println(l[1].detalhes());
    }

}