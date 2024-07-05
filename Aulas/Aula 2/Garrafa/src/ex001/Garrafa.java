package ex001;

import java.util.Scanner;

public class Garrafa {
    int capacidade;
    int quantidade;
    boolean tampada;
    
    void beber() {
        int agua = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual é a capacidade da garrafa em ml? ");
        capacidade = teclado.nextInt();
        
        System.out.print("Qual é a quantidade de água dentro da garrafa em ml? ");
        quantidade = teclado.nextInt();
        
        System.out.print("A garrafa está tampada? [true / false] ");
        tampada = teclado.nextBoolean();
        
        if ((capacidade > 0) && (quantidade <= capacidade) && (tampada == false)) {
            System.out.print("Quantos ml de água você deseja beber? ");
            agua = teclado.nextInt();
            if (agua <= quantidade) {
                quantidade -= agua;
                System.out.println("Você bebeu " + agua + "ml e sobraram " + quantidade + "ml na garrafa");
            } else {
                System.out.println("Erro! Você deseja beber mais água do que a quantidade disponível");
            }
        } else {
            System.out.println("As especificações são inválidas.");
        }
        
    }
}
