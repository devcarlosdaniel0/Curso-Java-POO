package projetolivro;

public interface Publicacao {
        public void abrir();
        public void fechar();
        public void folhear(int p);
        public void avancarPag(int a);
        public void voltarPag(int v);
}