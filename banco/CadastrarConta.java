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
        scanner.nextLine(); 
        System.out.print("Digite a posição para adicionar a conta: ");
        int posicao = scanner.nextInt();

        if (posicao >= 0 && posicao < this.contas.length && this.contas[posicao] == null) {
            this.contas[posicao] = new Conta(nome, saldo);
           
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Posição inválida.");
        }
    }
}
      
      
