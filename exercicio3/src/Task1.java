import java.util.Scanner;

public class Task1 {

    public static void exSwitch(){
    Scanner inpt = new Scanner(System.in);
    System.out.println("informe o codigo do pedido");
    int escolha =Integer.parseInt(inpt.nextLine());
    switch (escolha){
        case 1:
            System.out.println("pizza");
            break;
        case 2:
            System.out.println("hamburger");
            break;
        case 3:
            System.out.println("refrigerante");
            break;
        case 4:
            System.out.println("batatihha frita 123");
            break;
        default:
            System.out.println("op invalida");
    }

    }
}
