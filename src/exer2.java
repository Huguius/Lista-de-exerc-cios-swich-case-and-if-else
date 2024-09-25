import java.util.Scanner;

public class exer2 {

    public static void main(String[] args) {

        //Criando um objeto Scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Pede o primeiro valor para o usuário
        System.out.print("Insira a sua primeira nota: ");
        float numero1 = scanner.nextFloat();

        // Pede o segundo valor para o usuário
        System.out.print("Insira a sua segunda nota: ");
        float numero2 = scanner.nextFloat();

        //Calculando a média
        float media = (numero1 + numero2) / 2;
        String conceito;

        // Definindo o conceito com base na média
        if (media > 0 && media <= 4) {
            System.out.println("Reprovado");
        } else if (media >= 4.1 && media < 7) {
            System.out.println("Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Tente novamente");
        }

        // Fechando o scanner
        scanner.close();
    }
}
