public abstract class Monster extends Card {
    // status
    int atk;
    int def;
    byte level;
    String attribute;
    String type;
    Boolean isDefending; // false é o padrao quando é criado.
    Boolean isFaceDown; // false é o padrao.
    static String archType= "Monster"; 
    
    //constructor
    public Monster(short id, String title, String text, int atk, int def, byte level, String attribute,
     String type, Boolean isDefending, Boolean isFaceDown) {
        super(id, title, text, archType);
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.attribute = attribute;
        this.type = type;
        this.isDefending = isDefending;
        this.isFaceDown = isFaceDown;
      
    }

    // behaviour 

    public static void battle(){};

    public static void changeStance(){};

    public static void normalSummon (){};

    public static void tributeSummon(){};

    public void flip(){};

}