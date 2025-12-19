package collections.timbachuka.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArrays = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Suit.HEART,'A');
        Arrays.fill(cardArrays,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArrays),"Aces of Heart",1);

        List<Card> cards = new ArrayList<>(52);
        cards.add(new Card(Suit.HEART,"J", 1));

        System.out.println("Fill Method ...");
        Collections.fill(cards,aceOfHearts);
        System.out.println(cards);
        System.out.println(cards.size());
        System.out.println("``````");


        List<Card> acesOfHearts = Collections.nCopies(13,aceOfHearts);
        System.out.println(acesOfHearts);

        Card kingOfClud = Card.getFaceCard(Suit.CLUB,'K') ;

        List<Card> kingsOfClub = Collections.nCopies(13,kingOfClud);
        Card.printDeck(kingsOfClub,"Kings of Club",1);

        Collections.addAll(cards,cardArrays);
        Card.printDeck(cards,"Card Collection with Aces added ",1);


        //Collections.shuffle(deck);
        //Card.printDeck(deck,"Shuffled Deck",4);

        Card.printDeck(deck);
        //Collections.reverse(deck);


        //Card tensOfHearts = Card.getNumericCard(Suit.HEART,10) ;
        //System.out.println("tens of Heart " + tensOfHearts);

    }
}
