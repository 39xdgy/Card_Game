
public class Main_class {
	public static void main(String[] args){
		Player Jason = new Player("Jason");
		Player Anthony = new Player("Anthony");
		Player Salem = new Player("Salem");
		Player list[] = {Jason, Anthony, Salem};
		Dou_Di_Zhu newgame = new Dou_Di_Zhu(list);
		newgame.gameStart();
		Jason.print();
		Salem.print();
		Anthony.print();
		//Card test1 = new Card("KING", 0);
		//Card test2 = new Card("king", 0);
		//System.out.println(newgame.canplay(test1, test2));
		
		while(true) {
			break;
		}
		
	}
}
