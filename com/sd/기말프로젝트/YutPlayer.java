
public class YutPlayer {
   	String name=null;
    int num=0;
    public YutPlayer(String _name) {
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
		 Dice d=new YutGame();
		 System.out.println(getName()+" ���� : ���� ������ ���Դϴ�......");
	    ((YutGame) d).roll();
	    this.num+=d.getNum();
	    System.out.println("--------------------------------");
	}
}
