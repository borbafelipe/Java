import java.util.Scanner;

public class Task4 {

    public static void loginGen(){

        Scanner inpt = new Scanner(System.in);
        System.out.println("bota teu nome");
        String nomeCompleto = inpt.nextLine();

        String login =  nomeCompleto.substring(0,1) + nomeCompleto.substring(nomeCompleto.lastIndexOf("")+ 1)+ "@estudante.edu.br" ;
        String passwort = nomeCompleto.substring(0,1) + nomeCompleto.substring(nomeCompleto.lastIndexOf("",1));

        System.out.println("login " + login);
        System.out.println("login " + passwort);

    }
}
