import java.util.ArrayList;

public class Player {
	public String name;
	private ArrayList<Card> hands;
	
	
	public Player(String name){
		this.name = name;
		hands = new ArrayList<Card>();
	}
	
	public void getCard(Card card) {
		hands.add(card);
	}
	
	public Card playCard(int index){
		Card fin = hands.get(index);
		hands.remove(index);
		return fin;
	}
	
	
	public void print(){
		for(int i = 0; i < hands.size(); i++){
			hands.get(i).print();
		}
	}
}
