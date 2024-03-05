import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        Scanner scanner = new Scanner(System.in);

        do {
            DisplayMenu displayMenuInstance = new DisplayMenu();
            double weight = displayMenuInstance.displayMenu();

            // Display weight on each planet
            System.out.println("o peso em mercurio: " + PlanetWeight.mercury(weight));
            System.out.println("o peso em venus: " + PlanetWeight.venus(weight));
            System.out.println("o peso em marte: " + PlanetWeight.mars(weight));
            System.out.println("o peso em jupter: " + PlanetWeight.jupiter(weight));
            System.out.println("o peso em saturno: " + PlanetWeight.saturn(weight));
            System.out.println("o peso em urano: " + PlanetWeight.uranus(weight));

            System.out.println("Quer calcular o peso novamente? (Digite 1 para 'sim' ou 0 para 'sair'): ");
            int resposta = scanner.nextInt();

            if (resposta != 1) {
                System.out.println("Programa encerrado. Tchau!");
                break;
            }
        } while (true);


    }
}
//presta atençao que aqui o metodo display menu e um double, e portanto ira retornar um numero que esse sim sera acessivel para a classe planetweight.
class DisplayMenu {
    public double displayMenu() {
        Scanner inpt = new Scanner(System.in);

        System.out.println("LEIA O COMENTARIO VEI, E MAIS IMPORTANTE QUE O CODIGO");
        System.out.println("Coloca o peso que tu quer aqui?:");
        double weight = inpt.nextDouble();
        System.out.println("Vamos usar o peso " + weight);

        return weight;
    }
}
// repara no alcance da variavel , "graviy " existe em todos os metodos da classe abaixo, porem ele e restringido de maneira que, "gravity" de mercurym nao e o mesmo de venus.
class PlanetWeight {
    public static double mercury(double weight) {
        double gravity = 0.37;
        return weight * gravity;
    }

    public static double venus(double weight) {
        double gravity = 0.88;
        return weight * gravity;
    }

    public static double mars(double weight) {
        double gravity = 0.38;
        return weight * gravity;
    }

    public static double jupiter(double weight) {
        double gravity = 2.64;
        return weight * gravity;
    }git s

    public static double saturn(double weight) {
        double gravity = 1.15;
        return weight * gravity;
    }

    public static double uranus(double weight) {
        double gravity = 1.17;
        return weight * gravity;
    }
}
