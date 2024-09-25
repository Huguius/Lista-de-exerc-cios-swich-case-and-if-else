import java.util.Scanner;

public class exer {

    public static void main (String[]args){

        //Criando um objeto Scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);

        //Pede ao usuario para identificar a classificacao do produto
        System.out.print("Insira a classificação do seu produto: ");
        int num = scanner.nextInt();

        //Cria a condicional Swich para classificar o produto
        switch (num){
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestúario");
                break;
            case 7:
                System.out.println("Higiene pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Limpeza e utensílios domésticos");
                break;
            default:
                System.out.println("Código inválido");

                //Fechando o Scanner
                scanner.close();
        }
    }
}
