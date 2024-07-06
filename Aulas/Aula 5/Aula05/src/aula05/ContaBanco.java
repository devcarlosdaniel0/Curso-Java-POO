package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo; // CC ou CP
    private String dono;
    private float saldo;
    private boolean status;
            
    // Construtor
    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }
                
    // Métodos
    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        if (tipo == "CC") {
            this.setSaldo(50);
            this.setStatus(true);
            System.out.println("Conta aberta com sucesso!");
        } else if (tipo == "CP"){
            this.setSaldo(150);
            this.setStatus(true);
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("ERRO! A conta deve ser CC ou CP");
        }
        
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Tem dinheiro na conta! R$" + this.getSaldo() + " Você precisa sacar primeiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Você está devendo! R$" + this.getSaldo() + " Precisa pagar primeiro");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float deposito) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito de R$" + deposito + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar, a conta está fechada");
        }
    }
        
    public void sacar(float saque) {
        if ((this.getStatus() == true) && (this.getSaldo() >= saque)) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saldo de R$" + saque + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("Saldo insuficiente ou a conta está fechada!");
        }
    }
    
    public void pagarMensal() {
        float taxaCC = 12;
        float taxaCP = 20;
        if ((this.getTipo() == "CC") && (this.getStatus() == true) && (this.getSaldo() > taxaCC)) {
            this.setSaldo(getSaldo() - taxaCC);
            System.out.println("Mensalidade de R$" + taxaCC + " paga no nome de " + this.getDono());
        } else if ((this.getTipo() == "CP") && (this.getStatus() == true) && (this.getSaldo() > taxaCP)) {
            this.setSaldo(getSaldo() - taxaCP);
            System.out.println("Mensalidade de R$" + taxaCP + " paga no nome de " + this.getDono());
        } else {
            System.out.println("Impossível pagar a mensalidade");
        }
    }
        
    // Getter e Setters
    public int getNumConta() {
        return this.numConta;
    }   
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}