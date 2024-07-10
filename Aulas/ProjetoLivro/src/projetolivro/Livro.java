package projetolivro;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" 
                + autor + "\n, totPag=" + totPag + ", pagAtual=" 
                + pagAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() + '}';
    }
    
    // Construtor
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Métodos Abstratos
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (this.getAberto() && p <= this.getTotPag()) {
            this.setPagAtual(p);
        } else {
            System.out.println("ERRO");
        }
    }

    @Override
    public void avancarPag(int a) {
        if (a + this.getPagAtual() <= this.getTotPag()) {
            this.setPagAtual(getPagAtual() + a);
        } else {
            System.out.println("ERRO!");
        }
    }

    @Override
    public void voltarPag(int v) {
        if (v <= this.getPagAtual()) {
            this.setPagAtual(this.getPagAtual() - v);
        } else {
            System.out.println("ERRO!");
        }
    }
}