import java.util.Scanner;

public class exer3 {

    public static void main(String[] args) {

        //Criando um objeto Scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Pede o primeiro valor para o usuário
        System.out.print("Insira um número: ");
        float numero1 = scanner.nextFloat();

        // Pede o segundo valor para o usuário
        System.out.print("Insira outro número: ");
        float numero2 = scanner.nextFloat();

        //Mostro o que o código tem a oferecer e recebe o desejo do user
        System.out.println("O que voçê que fazer com esses número:");
        System.out.println("1- Média entre os números digitados");
        System.out.println("2 – Diferença entre os números (primeiro número digitado - o segundo número digitado)");
        System.out.println("3 – Produtos entre os números digitados");
        System.out.println("4 – Divisão do primeiro pelo segundo");
        byte num = scanner.nextByte();

        //Criar a condicional Swich com os calculos
        switch (num) {
            case 1 :
                float media = (numero1 + numero2)/2;
                System.out.println("A média entre os números digitados é: " + media);
                break;
            case 2 :
                float diferença = (numero1 - numero2);
                System.out.println("A diferença entre os números digitados é: " + diferença);
                break;
            case 3 :
                float produto = (numero1*numero2);
                System.out.println("A multiplicação entre os números digitados é: " + produto);
                break;
            case 4 :
                float div = (numero1/numero2);
                System.out.println("A diferença entre os números digitados é: " + div);
                break;
            default:
                System.out.println("Erro");
        }

        // Fechando o scanner
        scanner.close();
    }
}
