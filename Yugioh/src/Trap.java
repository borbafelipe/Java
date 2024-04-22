public class Trap extends Card {
    static String archType = "Trap Card";

    public Trap(short id, String title, String text) {
        super(id, title, text, archType);
        
    }
    @Override
    public void displayCard(){
        System.out.println("=========================================");
        System.out.println("Card ID: " + id);
        System.out.println("Archtype: " + archType);
        System.out.println("Title: " + title);
        System.out.println("------------------------------");
        System.out.println("Text: " + text);
        System.out.println("------------------------------");

    };

    public void setTrap(){};

    public void triggerTrap(){};
}
