
public class DicePlayer {
	   	String name=null;
	    int num=0;
	    public DicePlayer(String _name) {
	        name=_name;
	    }
	    public String getName(){
		return this.name;
	    }
	    public int getNum(){
		return this.num;
	    }

		public void play() {
			// TODO Auto-generated method stub
			 Dice d=new DiceGame();
			 System.out.println(getName()+" ���� : �ֻ��� ������ ���Դϴ�.....");
		    ((DiceGame) d).roll();
		    this.num+=d.getNum();
		    System.out.println("--------------------------------");
		}
		
}
