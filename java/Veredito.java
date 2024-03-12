public class Veredito {

    public static void exibirResultado() {
        System.out.println("Numero de respostas 'sim': " + Pergunta.guilty_count);
        if (Pergunta.guilty_count == 5) {
        	System.out.println("Classificacao: Assassino");
        } else if (Pergunta.guilty_count >= 3 && Pergunta.guilty_count <= 4) {
            System.out.println("Classificacao: Cumplice");
        }else if (Pergunta.guilty_count == 2) {
        	System.out.println("Classificacao: Cumplice");
        }else {
        	System.out.println("Classificacao : Inocente");
        }
     }
}