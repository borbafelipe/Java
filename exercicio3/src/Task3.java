import java.util.Scanner;



public class Task3 {

    public static void nome(){
        Scanner inpt = new Scanner(System.in);
        System.out.println("bota teu nome");
       String nomeCompleto = inpt.nextLine();
       String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(""));
        String ultimoNome =  nomeCompleto.substring(nomeCompleto.lastIndexOf("")+ 1);
        System.out.println("primeiro nome : " + primeiroNome);
        System.out.println("ultimo nome : " + ultimoNome);
    }
}
