import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Corrida corrida = new Corrida();

        System.out.println("Bem vindo ao Sistema feito para você, motorista!");

        System.out.println("Qual fator de demanda no momento? R$ (1,0 = normal, 1,5 = pico)");
        corrida.setFatDemanda(sc.nextDouble());

        System.out.println("Digite a tarifa base:");
        corrida.setTarifaBase(sc.nextDouble());

        System.out.println("Qual a distância em Km que será percorrida");
        corrida.setDistancia(sc.nextDouble());

        System.out.println("Qual tempo de espera estimado?");
        corrida.setTempoEspera(sc.nextInt());

        int x,p;

        do {
            System.out.println("Escolha uma das opções abaixo\n1 - Ver valor final da corrida\n2 - Ver detalhes da corrida");
            x = sc.nextInt();
            switch (x){
                case 1:
                    corrida.calcularValorCorrida();
                    System.out.printf("O valor da corrida é de R$%.2f\n", corrida.valorFinal);
                    break;
                case 2:
                    corrida.exibirDetalhes();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }System.out.println("Para ver o menu novamente digite 0");
            p = sc.nextInt();
        }while (p==0);
    }
}