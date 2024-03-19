package banco;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Conta conta1 = new Conta("Vinicius", 500.50);
        Conta conta2 = new Conta("Marcelo", 300.75);
        Conta conta3 = new Conta("Fernando", 1700.60);
        Conta conta4 = new Conta("Henrique", 23700.7);
        Conta conta5 = new Conta("Yasmim", 570.8);

        CadastrarConta c = new CadastrarConta();
        c.adicionarConta(conta1);
        c.adicionarConta(conta2);
        c.adicionarConta(conta3);
        c.adicionarConta(conta4);
        c.adicionarConta(conta5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual conta deseja procurar?:");
        String nomeBusca = scanner.nextLine();

       Conta procurarConta = c.procurarConta(nomeBusca);
        if (procurarConta != null) {
            System.out.println(procurarConta);
        } else {
            System.out.println("Conta não encontrada.");
        }

        System.out.println(Arrays.toString(c.listarConta()));

        CadastrarConta cad = new CadastrarConta();
        cad.adicionarContaPosicao();
    
}
}

    

