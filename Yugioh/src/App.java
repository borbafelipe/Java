public class App {
    public static void main(String[] args) {
        // Criando uma carta de campo
        ContinousTrap rageki = new ContinousTrap(
            (short) 3," Rageki", "Choraboy." 
        );

        // Exibindo a carta de campo
        rageki.displayCard();
    }
}
