public class Dou_Di_Zhu{
	private Player first,second,third;
	private Deck cards;
	private Card[] lead;
	private boolean flag_startgame;

	public Dou_Di_Zhu(String first, String second, String third){
		this.first = new Player(first);
		this.second = new Player(second);
		this.third = new Player(third);
		cards = new Deck();
		flag_startgame = false;
	}

	public Dou_Di_Zhu(Player first, Player second, Player third){
		this.first = first;
		this.second = second;
		this.third = third;
		cards = new Deck();
		flag_startgame = false;
	}


	public void gameStart(){
		lead = cards.DDZdeal(first, second, third);
		flag_startgame = true;
	}



}
