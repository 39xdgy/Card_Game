import java.util.ArrayList;
import java.util.Scanner;

public class Dou_Di_Zhu {
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
	
	public Dou_Di_Zhu(Player player[]) {
		this.first = player[0];
		this.second = player[1];
		this.third = player[2];
		cards = new Deck();
		flag_startgame = false;
	}
	
	
	
	public void gameStart(){
		lead = cards.DDZdeal(first, second, third);
		pick_lord();
		flag_startgame = true;

		
		
		
		
		
	}
	
	
	public boolean canplay(Card org, Card check_card) {
		boolean fin = false;
		int org_num = org.getNumber();
		int check_num = check_card.getNumber();
		if(org_num == 0) {
			if(check_card.getType().equals("KING")) fin = true;
		}
		else if(3 <= org_num && org_num <= 13) {
			if( !(check_num >= 3 && check_num <= org_num )) fin = true;
		}
		else if (org_num == 2){
			if(check_num == 0) fin = true;
		}
		else if (org_num == 1) {
			if(check_num == 2 || check_num == 0) fin = true;
		}
		
		return fin;
	}
	
	public void pick_lord() {
		int call_num[] = new int[3];
		Scanner read = new Scanner(System.in);
		System.out.println(first.name + " Call for land lord: ");
		call_num[0] = read.nextInt();
		while(call_num[0] < 0 || call_num[0] > 3) {
			System.out.println("Please pick a number between 0 - 3");
			call_num[0] = read.nextInt();
		}
		System.out.println(second.name + " Call for land lord: ");
		call_num[1] = read.nextInt();
		while(call_num[1] < 0 || call_num[1] > 3) {
			System.out.println("Please pick a number between 0 - 3");
			call_num[1] = read.nextInt();
		}
		System.out.println(third.name + " Call for land lord: ");
		call_num[2] = read.nextInt();
		while(call_num[2] < 0 || call_num[2] > 3) {
			System.out.println("Please pick a number between 0 - 3");
			call_num[2] = read.nextInt();
		}
		
		if(call_num[0] == 3) become_lord(lead, first);
		
		else if(call_num[0] == 2) {
			if(call_num[1] == 3) become_lord(lead, second);
			else if(call_num[2] == 3) become_lord(lead, third);
			else become_lord(lead, first);
		}
		
		else if(call_num[0] == 1) {
			if(call_num[1] == 3) become_lord(lead, second);
			else if(call_num[1] == 2) {
				if(call_num[2] == 3) become_lord(lead, third);
				else become_lord(lead, second);
			}
			else if(call_num[2] >= 2) become_lord(lead, third);
			else become_lord(lead, first);
		}
		
		else if(call_num[0] == 0) {
			if(call_num[1] == 3) become_lord(lead, second);
			else if(call_num[1] == 2) {
				if(call_num[2] == 3) become_lord(lead, third);
				else become_lord(lead, second);
			}
			else if(call_num[1] == 1) {
				if(call_num[2] >= 2) become_lord(lead, third);
				else become_lord(lead, second);
			}
			else {
				if(call_num[2] >= 1) become_lord(lead, third);
				else {
					System.out.println("You guys gotta pick, you know!");
					pick_lord();
				}
			}
		}
	}
	
	
	
	
	public void become_lord(Card list[], Player lord) {
		for(int i = 0; i < 4; i++) {
			lord.getCard(list[i]);
		}
		System.out.println(lord.name + " become the land lord");
	}
	
	
	
	
}
