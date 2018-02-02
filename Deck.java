import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private int number_of_each_type = 13;
	private ArrayList<Card> deck_of_card = new ArrayList<Card>();
	private Random rand;
	
	public Deck(){
		Create();
		Shuffle();
	} //Deck()
	
	private void Create() {
		for(int i = 1; i < number_of_each_type + 1; i++){
			deck_of_card.add(new Card("Heart", i));
			deck_of_card.add(new Card("spades", i));
			deck_of_card.add(new Card("diamonds", i));
			deck_of_card.add(new Card("clubs", i));
		} //for
		deck_of_card.add(new Card("KING", 0));
		deck_of_card.add(new Card("king", 0));
	} //Create()
	
	
	private void Shuffle(){
		rand = new Random();
		for(int i = 0; i < 216;i++){ //216 = 54 * 4
			int a = rand.nextInt(54);
			int b = rand.nextInt(54);
			//System.out.println(a);
			Card savea = deck_of_card.get(a);
			Card saveb = deck_of_card.get(b);
			deck_of_card.set(a, saveb);
			deck_of_card.set(b, savea);
		} //for
	} //Shuffle()
	
	public boolean isEmpty() {
		return deck_of_card.size() == 0;
	} //isEmpty()
	
	public boolean full() {
		return deck_of_card.size() == 54;
	}
	
	
	public void print(){
		for(int i = 0; i < deck_of_card.size(); i++){
			deck_of_card.get(i).print();
		}
	}
	
	
	
	public void fulldeal(Player first,Player second, Player third){
		for(int i = 0;i < 54; i++){
			int givecard = i % 3;
			if(givecard == 0){
				first.getCard(deck_of_card.get(i));
			}
			if(givecard == 1){
				second.getCard(deck_of_card.get(i));
			}
			if(givecard == 2){
				third.getCard(deck_of_card.get(i));
			}
		}
	}
	
	
	
	
	
	public void fulldeal(Player first,Player second, Player third, Player forth){
		for(int i = 0;i < 54; i++){
			int givecard = i % 4;
			if(givecard == 0){
				first.getCard(deck_of_card.get(i));
			}
			if(givecard == 1){
				second.getCard(deck_of_card.get(i));
			}
			if(givecard == 2){
				third.getCard(deck_of_card.get(i));
			}
			if(givecard == 3){
				forth.getCard(deck_of_card.get(i));
			}
		}
	}
	
	
	public Card[] DDZdeal(Player first, Player second, Player third){
		for(int i = 0; i < 50; i++){
			int givecard = i % 3;
			if(givecard == 0){
				first.getCard(deck_of_card.get(i));
			}
			if(givecard == 1){
				second.getCard(deck_of_card.get(i));
			}
			if(givecard == 2){
				third.getCard(deck_of_card.get(i));
			}
		}
		
		Card[] fin = new Card[4];
		for(int i = 0; i < 4; i++){
			fin[i] = deck_of_card.get(i + 50);
		}
		return fin;
	}
	
	
	
	public static void main(String[] argc){
//		Random testcase = new Random();
//		for(int i = 0; i < 20; i++){
//			int one = testcase.nextInt(53)+1;
//			int two = testcase.nextInt(53)+1;
//			System.out.println(one);
//			System.out.println(two);
//		}
		Deck test = new Deck();
		
	} //main
} //class
