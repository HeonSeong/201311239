
public class Player {
	   String name=null;
	    int num=0;
	    public Player(String _name) {
	        name=_name;
	    }
	    public void play() {
	        Dice d=new Dice();
	        d.roll();
	        System.out.println("played by: "+getName());
		this.num+=d.getNum();
	    }   
	    public String getName(){
		return this.name;
	    }
	    public int getNum(){
		return this.num;
	    }

}
