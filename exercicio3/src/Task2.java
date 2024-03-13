import java.util.Scanner;

public class Task2 {

    int cachorroquente, refrigerante;
    static double precoCachorro = 1.50;
    double precoRefri = 2.00;

    public static void gabiruMercadinho(){

        Scanner input = new Scanner(System.in);
        int escolha = Integer.parseInt(input.nextLine());


        System.out.println("escolha seu produto:");
        System.out.println("(1)cachorro quente");
        System.out.println("(2)refrigerante");
        switch (escolha){
            case 1:
                System.out.println("cachorro quente");
                System.out.println("quantos?");
                System.out.println("o valor total é :");
                int qtdRedog = Integer.parseInt(input.nextLine());
                break;
            case 2:
                System.out.println("refrigerante");
                System.out.println("quantos?");
                int qtdRefri = Integer.parseInt(input.nextLine());
                System.out.println("o valor total é :");
                System.out.println(precoCachorro * qtdRefri);
                break;
            case 3:
                System.out.println("sair");
                break;

            default:
                System.out.println("op invalida");
                input.close();
        }

    }

}