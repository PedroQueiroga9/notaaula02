import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PoupancaBancaria poupBanc = new PoupancaBancaria();
        ContaCorrente contCorre = new ContaCorrente();

        System.out.println("Seja bem vindo ao seu banco!");

        int x,b,y,d;

        do {
            System.out.println("Escolha o tipo de conta\n1 - Conta Corrente\n2 - Conta Poupança");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite seu nome:");
                    contCorre.setNome(sc.next());
                    do {
                        System.out.println("O que você deseja fazer hoje? \n1 - Depositar\n2 - Saque\n3 - cheque especial\n4 - Exibir detalhes da conta");
                        y = sc.nextInt();
                        switch (y){
                            case 1:
                                System.out.println("Qual o valor a ser depositado?");
                                contCorre.setAporte(sc.nextDouble());
                                contCorre.depositar();
                                System.out.println("Depósito realizado com sucesso!");
                                System.out.printf("saldo: R$%.2f\n", contCorre.saldoAtual);
                                break;
                        }System.out.println("Para ver o menu novamente digite 0");
                        d = sc.nextInt();
                    }while (d==0);
                    break;
            }System.out.println("Para ver o menu novamente digite 0");
            b = sc.nextInt();
        } while (b==0);
    }
}