public class ContinousTrap  extends Trap{

    //status
    static String trapType = "Continous Trap";
    
        //constructor
        public ContinousTrap(short id, String title, String text) {
            super(id, title, text);
           
        }
        //behaviour
        @Override
        public void displayCard(){
            System.out.println("=========================================");
            System.out.println("Card ID: " + id);
            System.out.println("Archtype: " + archType);
            System.out.println("Trap Type: " + trapType);
            System.out.println("Title: " + title);
            System.out.println("------------------------------");
            System.out.println("Text: " + text);
            System.out.println("------------------------------");
    
        };
    
    }
    