public class EffectMonster extends Monster {

    //status
    String fixedType = "Effect";
    Boolean  specialSummonOnly; // padrao 0

    //constructor
    public EffectMonster(short id, String title, String text, int atk, int def, byte level,
            String attribute, String type, Boolean isDefending, Boolean isFaceDown, Boolean specialSummonOnly) {
        super(id, title, text,atk, def, level, attribute, type, isDefending, isFaceDown);
        this.specialSummonOnly = specialSummonOnly;
         }
        //behaviour
    @Override
    public void displayCard() {
            System.out.println("=========================================");
            System.out.println("Card ID: " + id);
            System.out.println("Archtype: " + archType);
            System.out.println("Title: " + title);
            System.out.println("------------------------------");
            System.out.println("Text: " + text);
            System.out.println("------------------------------");
            System.out.println("Attack: " + atk);
            System.out.println("Defense: " + def);
            System.out.println("Level: " + level);
            System.out.println("Attribute: " + attribute);
            System.out.println("Type: " + type + "/" + fixedType);
            System.out.println("------------------------------");
            System.out.println("Is Defending: " + isDefending);
            System.out.println("Is Face Down: " + isFaceDown);
            System.out.println("Is Special summon only: " + specialSummonOnly);
            System.out.println("=========================================");
    }

    public void useEffect(){};
    
}
