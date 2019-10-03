import java.util.Random;

public class Deck {
    private static final int NUMBER_OF_CARD = 52;
    private static Card[] deck = new Card[NUMBER_OF_CARD];
    private int cCard;
    private static final Random rn = new Random();

    public  Deck(){
        int i = 0;
        for (Suit s:Suit.values() ){
            for(Face f:Face.values()){
                deck[i++] = new Card(f,s);

            }
        }
    }
    public void shuffle(){
        cCard= 0;
        for(int first = 0 ; first < deck.length ; first++){
            int second = rn.nextInt(NUMBER_OF_CARD);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public void printDeck(){
        for(int i = 0 ; i < NUMBER_OF_CARD ; i++){
            if(i%4 == 0)
                System.out.println();
            System.out.print(dealCard());
        }
    }

    public Card dealCard(){
        if(cCard < deck.length){
            return deck[cCard++];
        }
        else
            return null;
    }
}
