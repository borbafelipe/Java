public class RitualSpell extends Spell {

    //status
    static String spellType = "Ritual Spell";
    

    //constructor
    public RitualSpell(short id, String title, String text) {
        super(id, title, text);
    }

    //behaviour
    @Override
    public void displayCard(){
        System.out.println("=========================================");
        System.out.println("Card ID: " + id);
        System.out.println("Archtype: " + archType);
        System.err.println("Spell Type: " + spellType);
        System.out.println("Title: " + title);
        System.out.println("------------------------------");
        System.out.println("Text: " + text);
        System.out.println("------------------------------");


}
}
