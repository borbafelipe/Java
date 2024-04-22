public class Spell extends Card{

    //status
 static String archType = "Spell Card";


    //constructor
    public Spell(short id, String title, String text){
        super(id, title, text, archType);
        
    }

    //behaviour
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
    public void spellActivate(){};

    
}
