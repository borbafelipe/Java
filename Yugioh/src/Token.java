
    public class Token {

        //status
        short id;
        String title;
        String archType;
        String text;
        Boolean isDefending;
    
        // constructor
        public Token() {
            this.id = 0;
            this.title = "Token";
            this.archType = "Token";
            this.text = "token";
            this.isDefending = true;
        }
 
    //behaviour
    public void displayToken() {
        System.out.println("=========================================");
        System.out.println("Card ID: " + id);
        System.out.println("Archtype: " + archType);
        System.out.println("Title: " + title);
        System.out.println("------------------------------");
        System.out.println("Text: " + text);
        System.out.println("------------------------------");
        System.out.println("Is defending: "+ isDefending);
        
    }

    public void removeToken(){
        // tokens sao especiais, nao sao eviados para o cemiterio, nem 
    }

    public void setToken(){
        // os tokens nao vem nem da mao nem do baralho, portanto nao herdam de Carta, pois nao sao
        //cartas e sim tokens
    }

}
