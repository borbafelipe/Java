public abstract class Card {
// status
short id; // id do card, referencia universal. // vai ate 32k e usa 2 bytes, ta de bom tamanho.
String title; // Nome ou titulo da carta.
String text; // para armazenar as informaçoes da carta.
String archType;
// String imagePath; // para eventual implantação de imagens. nao implementado
// String code; // string para guardar codigo referente a carta. não implemetado

    // constructor
    public Card(short id, String title, String text, String archType) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.archType = archType;
    }

    
// behaviour

public Card(short id2, String title2, String text2) {
    
    }


public static void drawCard(){};
    // Código para sacar a carta do baralho

public abstract void displayCard();
    // Código para exibir a carta.

public static void placeCard(){};
    // código para posicionar a carta no campo de cabeça para cima.

public static void setCard(){};
    // código para posicionar a carta no campo de cabeça para para baixo.

public static void sendToGrave(){};
    // código para mandar a carta para o cemiterio

public static void banishCard(){};
    // código para mandar a carta para o banimento.

public static void flipCard(){};
    // código para virar uma carta, de maneira geral.


}
