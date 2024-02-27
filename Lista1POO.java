import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Lista1POO {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option = -1;

            do {
                displayMenu();
                option = scanner.nextInt();

                runTask(option, scanner);

            } while (option != 0);
        }
    }

    private static void displayMenu() {
        System.out.println("GABIRU SOFTHOUSE");
        System.out.println("-----------------------");
        System.out.println("PARA NAVEGAR ENTRE OS EXERCICIOS");
        System.out.println("DIGITE UM NUMERO DE (1~15)");
        System.out.println("DIGITE (0 PARA SAIR");
        System.out.print("DIGITE 1337 PARA VER OS CREDITOS ");
    }

    private static void runTask(int option, Scanner scanner) {
        switch (option) {
            case 1:
                exercicio1(scanner);
                break;
            case 2:
            exercicio2(scanner);
                break;
            case 3:
                exercicio3(scanner);
                break;
            case 4:
                exercicio4(scanner);
                break;
            case 5:
            gabiruSoftCalculator(scanner);
                break;
            case 6:
                System.err.println("teste 6");
                break;
            case 7:
                System.err.println("teste 7");
                break;
            case 8:
                System.err.println("teste 8");
                break;
            case 9:
                System.err.println("teste 9");
                break;
            case 10:
                System.err.println("teste 10");
                break;
            case 11:
                System.err.println("teste 11");
                break;
            case 12:
                System.err.println("teste 12");
                break;
            case 13:
                System.err.println("teste 13");
            case 14:
                System.err.println("teste 14");
                break;
            case 15:
                System.err.println("teste 15");
                break;
            case 0:
                System.err.println("teste 0");
                break;
            case 1337:
                System.err.println("teste 1337");
                break;

            default:
                System.out.println("TÁ VIAJANDO? LE O MENU, TENTA ME CRASHAR NAO!");
        }
    }

    private static void exercicio1(Scanner teclado) {
        int diaNascimento, mesNascimento, anoNascimento;

        do {
            System.out.println("Digite o dia do seu nascimento: ");
            diaNascimento = teclado.nextInt();

            System.out.println("Digite o mes do seu nascimento: ");
            mesNascimento = teclado.nextInt();

            System.out.println("Digite o ano do seu nascimento: ");
            anoNascimento = teclado.nextInt();

            if (!isValidDate(diaNascimento, mesNascimento, anoNascimento)) {
                System.out.println("Informaçoes invlidas.");
            }
        } while (!isValidDate(diaNascimento, mesNascimento, anoNascimento));

        LocalDate agora = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        Period idade = Period.between(dataNascimento, agora);

        System.out.println(
                idade.getYears() + " anos, "
                        + idade.getMonths() + " meses, "
                        + idade.getDays() + " dias.");
    }

    private static boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void exercicio2(Scanner teclado) {
        System.out.println("Insira o primeiro numero: ");
        float num1 = teclado.nextFloat();

        System.out.println("Insira o segundo numero: ");
        float num2 = teclado.nextFloat();

        float resultado = num1 + num2;
        System.out.println("A soma dos numeros e: " + resultado);
    }
    private static void exercicio3(Scanner teclado) {
        System.out.println("Insira o primeira nota: ");
        float nota1 = teclado.nextFloat();

        System.out.println("Insira o segunda nota: ");
        float nota2 = teclado.nextFloat();

        System.out.println("Insira o terceira nota: ");
        float nota3 = teclado.nextFloat();

        System.out.println("Insira o quarta nota: ");
        float nota4 = teclado.nextFloat();

        float media = ((nota1 + nota2 + nota3 + nota4) / 4);
        System.out.println("A media das notas e: " + media);
    }
    private static void exercicio4(Scanner teclado) {
        System.out.println("Insira o valor em metros: ");
        double metrosV = teclado.nextDouble();

        double conversao = metrosV * 100;
        System.out.printf("A conversão de metros para centímetros é: %.2f%n", conversao);
    }
    private static void gabiruSoftCalculator(Scanner teclado) {
        System.out.println("Gabiru Softhouse - Ratao Calculator");
        System.out.println("1. Calcular Area");
        System.out.println("2. Calcular Perimetro");
        System.out.println("0. Sair");

        System.out.print("E ai, Nosferatu, qual e a jogada? ");
        int choice = teclado.nextInt();

        switch (choice) {
            case 1:
                Area.calculateArea();
                break;
            case 2:
                Perimeter.calculatePerimeter();
                break;
            case 0:
                System.out.println("Fechando o bagulho. Valeu, chupa cabra!");
                System.exit(0);
            default:
                System.out.println("Opcao invalida. Escolhe direito, bicho feio.");
        }
    }
    class Area {
        static void calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.println("Escolhe a parada pra calcular a area:");
            System.out.println("1. Triangulo\n2. Quadrado\n3. Retangulo\n4. Paralelogramo\n5. Losango\n6. Trapezio\n7. Circulo");
    
            System.out.print("Beleza, Nosfera, qual e o esquema? (1-7): ");
            int choice = inpt.nextInt();
    
            double result = 0.0;
    
            switch (choice) {
                case 1:
                    result = Triangle.calculateArea();
                    break;
                case 2:
                    result = Square.calculateArea();
                    break;
                case 3:
                    result = Rectangle.calculateArea();
                    break;
                case 4:
                    result = Parallelogram.calculateArea();
                    break;
                case 5:
                    result = Rhombus.calculateArea();
                    break;
                case 6:
                    result = Trapezoid.calculateArea();
                    break;
                case 7:
                    result = Circle.calculateArea();
                    break;
                default:
                    System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
            }
    
            System.out.println("A area e: " + result + " metros quadrados");
        }
    }
    
    class Perimeter {
        static void calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.println("Escolhe a parada pra calcular o perimetro:");
            System.out.println("1. Triangulo\n2. Quadrado\n3. Retangulo\n4. Paralelogramo\n5. Losango\n6. Trapezio\n7. Circulo");
    
            System.out.print("Beleza, Nosfera, qual e o esquema? (1-7): ");
            int choice = inpt.nextInt();
    
            double result = 0.0;
    
            switch (choice) {
                case 1:
                    result = Triangle.calculatePerimeter();
                    break;
                case 2:
                    result = Square.calculatePerimeter();
                    break;
                case 3:
                    result = Rectangle.calculatePerimeter();
                    break;
                case 4:
                    result = Parallelogram.calculatePerimeter();
                    break;
                case 5:
                    result = Rhombus.calculatePerimeter();
                    break;
                case 6:
                    result = Trapezoid.calculatePerimeter();
                    break;
                case 7:
                    result = Circle.calculatePerimeter();
                    break;
                default:
                    System.out.println("Opcao invalida. Tenta de novo, bicho feio.");
            }
    
            System.out.println("O perimetro e: " + result + " metros");
        }
    }
    
    class Triangle {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a base do triangulo em metros: ");
            double base = inpt.nextDouble();
    
            System.out.print("Agora, forneca a altura do triangulo em metros: ");
            double height = inpt.nextDouble();
    
            return (base * height) / 2;
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o comprimento do primeiro lado do triangulo em metros: ");
            double side1 = inpt.nextDouble();
    
            System.out.print("Digite o comprimento do segundo lado do triangulo em metros: ");
            double side2 = inpt.nextDouble();
    
            System.out.print("Digite o comprimento do terceiro lado do triangulo em metros: ");
            double side3 = inpt.nextDouble();
    
            return side1 + side2 + side3;
        }
    }
    
    class Square {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o lado do quadrado em metros: ");
            double side = inpt.nextDouble();
    
            return side * side;
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o lado do quadrado em metros: ");
            double side = inpt.nextDouble();
    
            return 4 * side;
        }
    }
    
    class Rectangle {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a base do retangulo em metros: ");
            double length = inpt.nextDouble();
    
            System.out.print("Agora, forneca a altura do retangulo em metros: ");
            double width = inpt.nextDouble();
    
            return length * width;
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a base do retangulo em metros: ");
            double length = inpt.nextDouble();
    
            System.out.print("Agora, forneca a altura do retangulo em metros: ");
            double width = inpt.nextDouble();
    
            return 2 * (length + width);
        }
    }
    
    class Parallelogram {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a base do paralelogramo em metros: ");
            double base = inpt.nextDouble();
    
            System.out.print("Agora, forneca a altura do paralelogramo em metros: ");
            double height = inpt.nextDouble();
    
            return base * height;
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a base do paralelogramo em metros: ");
            double base = inpt.nextDouble();
    
            System.out.print("Agora, forneca a altura do paralelogramo em metros: ");
            double height = inpt.nextDouble();
    
            return 2 * (base + height);
        }
    }
    
    class Rhombus {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a diagonal maior do losango em metros: ");
            double diagonal1 = inpt.nextDouble();
    
            System.out.print("Agora, forneca a diagonal menor do losango em metros: ");
            double diagonal2 = inpt.nextDouble();
    
            return (diagonal1 * diagonal2) / 2;
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o comprimento de um lado do losango em metros: ");
            double side = inpt.nextDouble();
    
            return 4 * side;
        }
    }
    
    class Trapezoid {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite a base maior do trapezio em metros: ");
            double base1 = inpt.nextDouble();
    
            System.out.print("Agora, forneca a base menor do trapezio em metros: ");
            double base2 = inpt.nextDouble();
    
            System.out.print("Digite a altura do trapezio em metros: ");
            double height = inpt.nextDouble();
    
            return ((base1 + base2) * height) / 2;
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o comprimento de um lado do trapezio em metros: ");
            double side1 = inpt.nextDouble();
    
            System.out.print("Agora, forneca o comprimento do lado oposto do trapezio em metros: ");
            double side2 = inpt.nextDouble();
    
            System.out.print("Digite a base maior do trapezio em metros: ");
            double base1 = inpt.nextDouble();
    
            System.out.print("Agora, forneca a base menor do trapezio em metros: ");
            double base2 = inpt.nextDouble();
    
            return side1 + side2 + base1 + base2;
        }
    }
    
    class Circle {
        static double calculateArea() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o raio do circulo em metros: ");
            double radius = inpt.nextDouble();
    
            return Math.PI * Math.pow(radius, 2);
        }
    
        static double calculatePerimeter() {
            Scanner inpt = new Scanner(System.in);
    
            System.out.print("Digite o raio do circulo em metros: ");
            double radius = inpt.nextDouble();
    
            return 2 * Math.PI * radius;
        }
}
}
