class RspGame{
	String p1;
	String p2;
	
	RspGame(String a,String b){
		p1=a;
		p2=b;
		
	}
	
	void play(){
		if(p1.equals("r")){
			if(p2.equals("r")){
				System.out.println("�����ϴ�.");
			}
			else if(p2.equals("s")){
				System.out.println("player 1�� �̰���ϴ�.");
			}
			else if(p2.equals("p")){
				System.out.println("player 2�� �̰���ϴ�. ");
			}
		}
		else if(p1.equals("s")){
			if(p2.equals("r")){
				System.out.println("player 2�� �̰���ϴ�.");
			}
			else if(p2.equals("s")){
				System.out.println("�����ϴ�.");
			}
			else if(p2.equals("p")){
				System.out.println("player 1�� �̰���ϴ�.");
			}
		}
		else if(p1.equals("p")){
			if(p2.equals("r")){
				System.out.println("player 1�� �̰���ϴ�.");
			}
			else if(p2.equals("s")){
				System.out.println("player 2�� �̰���ϴ�.");
			}
			else if(p2.equals("p")){
				System.out.println("�����ϴ�.");
			}
		}
		else{
			System.out.println("�߸����Է��Դϴ�. �ٽ� �Է����ּ���.");
		}
	}
	
	public static void main(String[] args) {
		RspGame p=new RspGame("r", "s");
		p.play();
	}
}
