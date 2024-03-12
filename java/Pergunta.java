import java.util.Scanner;

public class Pergunta{

	static int guilty_count;
	static Scanner inpt = new Scanner(System.in);
	
	 public static void pergunta1() {
		 int opt;
	       System.out.println("Telefonou para a vítima?");
	       System.out.println("(1) sim, (2)Não.");
	       opt = inpt.nextInt();
	       switch (opt) {
	       case 1:
	    	   System.out.println("voce escolheu sim");
	    	   guilty_count++;
	    	   break;
	       case 2:
	    	   System.out.println("voce escolheu nao");
	    	   break;
	       default:
               System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
	       } 
	    }
	 
	 public static void pergunta2() {
		 int opt;
	       System.out.println("Esteve no local do crime?");
	       System.out.println("(1) sim, (2)Não.");
	       opt = inpt.nextInt();
	       switch (opt) {
	       case 1:
	    	   System.out.println("voce escolheu sim");
	    	   guilty_count++;
	    	   break;
	       case 2:
	    	   System.out.println("voce escolheu nao");
	    	   break;
	       default:
               System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
	       } 
	    }
	 
	 public static void pergunta3() {
		 int opt;
	       System.out.println("Mora perto da vítima?");
	       System.out.println("(1) sim, (2)Não.");
	       opt = inpt.nextInt();
	       switch (opt) {
	       case 1:
	    	   System.out.println("voce escolheu sim");
	    	   guilty_count++;
	    	   break;
	       case 2:
	    	   System.out.println("voce escolheu nao");
	    	   break;
	       default:
               System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
	       } 
	    }
	 
	 public static void pergunta4() {
		 int opt;
	       System.out.println("Devia para a vítima?");
	       System.out.println("(1) sim, (2)Não.");
	       opt = inpt.nextInt();
	       switch (opt) {
	       case 1:
	    	   System.out.println("voce escolheu sim");
	    	   guilty_count++;
	    	   break;
	       case 2:
	    	   System.out.println("voce escolheu nao");
	    	   break;
	       default:
               System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
	       } 
	    }
	 
	 public static void pergunta5() {
		 int opt;
	       System.out.println("Já trabalhou com a vítima?");
	       System.out.println("(1) sim, (2)Não.");
	       opt = inpt.nextInt();
	       switch (opt) {
	       case 1:
	    	   System.out.println("voce escolheu sim");
	    	   guilty_count++;
	    	   break;
	       case 2:
	    	   System.out.println("voce escolheu nao");
	    	   break;
	       default:
               System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
	       } 
	    }
}
