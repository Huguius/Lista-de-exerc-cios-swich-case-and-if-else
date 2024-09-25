import java.util.Scanner;

public class exer4 {

    public static void main(String[] args) {

        // Criando um objeto Scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Pede o que o usuário deseja comprar
        System.out.println("100 – Cachorro quente – R$ 1,70");
        System.out.println("101 – Bauru Simples – R$ 2,30");
        System.out.println("102 – Bauru com bacon – R$ 2,60");
        System.out.println("103 – Hamburguer – R$ 2,40");
        System.out.println("104 – Cheeseburguer – R$ 2,50");
        System.out.println("105 – Refrigerante – R$ 1,00");
        System.out.print("Digite o número do seu pedido: ");
        int num = scanner.nextInt();

        // Pede a quantidade que o usuário vai querer dessa mercadoria
        System.out.print("Insira a quantidade que você deseja comprar: ");
        int quantidade = scanner.nextInt();

        // Declara variável para armazenar o valor total
        double valorTotal = 0;

        // Criar a condicional switch com os cálculos
        switch (num) {
            case 100:
                valorTotal = 1.70 * quantidade;
                break;
            case 101:
                valorTotal = 2.30 * quantidade;
                break;
            case 102:
                valorTotal = 2.60 * quantidade;
                break;
            case 103:
                valorTotal = 2.40 * quantidade;
                break;
            case 104:
                valorTotal = 2.50 * quantidade;
                break;
            case 105:
                valorTotal = 1.00 * quantidade;
                break;
            default:
                System.out.println("Erro: Produto não encontrado.");

        }

        // Exibe o valor a ser pago com duas casas decimais
        System.out.printf("O valor a ser pago é: R$ %.2f%n", valorTotal);

        // Fechando o scanner
        scanner.close();
    }
}

