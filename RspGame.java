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
				System.out.println("비겼습니다.");
			}
			else if(p2.equals("s")){
				System.out.println("player 1이 이겼습니다.");
			}
			else if(p2.equals("p")){
				System.out.println("player 2이 이겼습니다. ");
			}
		}
		else if(p1.equals("s")){
			if(p2.equals("r")){
				System.out.println("player 2이 이겼습니다.");
			}
			else if(p2.equals("s")){
				System.out.println("비겼습니다.");
			}
			else if(p2.equals("p")){
				System.out.println("player 1이 이겼습니다.");
			}
		}
		else if(p1.equals("p")){
			if(p2.equals("r")){
				System.out.println("player 1이 이겼습니다.");
			}
			else if(p2.equals("s")){
				System.out.println("player 2이 이겼습니다.");
			}
			else if(p2.equals("p")){
				System.out.println("비겼습니다.");
			}
		}
		else{
			System.out.println("잘못된입력입니다. 다시 입력해주세요.");
		}
	}
	
	public static void main(String[] args) {
		RspGame p=new RspGame("r", "s");
		p.play();
	}
}
