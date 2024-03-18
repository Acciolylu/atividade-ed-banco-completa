package banco;

import java.util.Scanner;

public class CadastrarConta {
    
     Conta[] contas = new Conta[10];
    int p = 0;
    
      
        public void adicionarConta(Conta conta) {
            if (p < contas.length) {
                contas[p++] = conta;
            }
        }
      
        public Conta procurarConta(String nome) {
            for (int i = 0; i < p; i++) {
                if (contas[i].getNome().equalsIgnoreCase(nome)) {
                    return contas[i];
                }
            }
            return null;
        }
      
        public Conta[] listarConta() {
            return contas;
        }
      
 public void adicionarContaPosicao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da conta: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // consume newline character

        System.out.print("Digite a posição para adicionar a conta: ");
        int posicao = scanner.nextInt();

        if (posicao >= 0 && posicao < this.contas.length && this.contas[posicao] == null) {
            this.contas[posicao] = new Conta(nome, saldo);
            this.p = Math.max(posicao, this.p);
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Posição inválida.");
        }
    }
}
      
      
/* 
public void adicionarConta(String nome, double valor, int posicao) {
    if (posicao < 0 || posicao >= p) {
        System.out.println("Posição inválida.");
        return;
    }

    if (contas[posicao] == null) {
        contas[posicao] = new Conta(nome, valor);
        p++;
    } else {
        System.out.println("Limite de contas atingido!");
        for (int i = p; i > posicao; i--) {
            contas[i] = contas[i - 1];
        }
        contas[posicao] = new Conta(nome, valor);
        p++;
    }*/