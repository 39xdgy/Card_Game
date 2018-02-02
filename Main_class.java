
public class Main_class {
	public static void main(String[] args){
		Player Jason = new Player("Jason");
		Player Anthony = new Player("Anthony");
		Player Salem = new Player("Salem");
		Dou_Di_Zhu newgame = new Dou_Di_Zhu(Jason, Anthony, Salem);
		newgame.gameStart();
		Jason.print();
		Salem.print();
		Anthony.print();
	}
}
