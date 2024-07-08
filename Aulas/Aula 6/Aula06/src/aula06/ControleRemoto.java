package aula06;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Método Construtor
    public ControleRemoto() { 
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Métodos especiais
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=10) {
                System.out.print("|");
            }
        } else {
            System.out.println("Ligue a TV primeiro");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() + 5);
        } else {
            System.out.println("Ligue a TV para aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Ligue a TV para diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Impossível ligar mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("Impossível desligar mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Impossível dar play");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar");
        }
    }
}