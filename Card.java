public class Card {
	
	private String type;
	private int number;
	
	public Card(String type, int number){
		this.type = type;
		this.number = number;
	}
	
	public void print(){
		System.out.println(this.type + "\t" + this.number);
	}
	
	public String toString(){
		String fin = this.type + "\t" + this.number;
		return fin;
	}
	
	public String getType(){
		return this.type;
	}
	
	public int getNumber(){
		return this.number;
	}
}
