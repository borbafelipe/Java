public class FusionMonster extends Monster{

    //status
    String fixedType = "Fusion";
    Boolean  specialSummonOnly = true; // padrao 0
    String [] requirements;

//constructor
    public FusionMonster(short id, String title, String text, int atk, int def, byte level,
            String attribute, String type, Boolean isDefending, Boolean isFaceDown, String [] requirements) {
        super(id, title, text, atk, def, level, attribute, type, isDefending, isFaceDown);
        this.requirements = requirements;

        
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
        for (int i = 0; i < requirements.length; i++) {
            System.out.print(" + " + requirements[i]);
        }
        System.out.println("\n------------------------------");
        System.out.println("Is Defending: " + isDefending);
        System.out.println("Is Face Down: " + isFaceDown);
        System.out.println("Is Special summon only: " + specialSummonOnly);
        System.out.println("=========================================");
    }

}