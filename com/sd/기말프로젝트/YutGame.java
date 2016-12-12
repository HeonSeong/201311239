import java.util.Scanner;

public class YutGame extends Dice implements Game{

	public String yut;

	@Override
	public void roll() {
		// TODO Auto-generated method stub
	
		number = (int) (Math.random() * 5)+1;
		switch(number){
		case 1:
			yut="도";
			System.out.println("turns on " + "도");
				break;
		case 2:
			yut="개";
			System.out.println("turns on " + "개");
				break;
		case 3: 
			yut="걸";
			System.out.println("turns on " + "걸");
				break;
		case 4: 
			yut="윷";
			System.out.println("turns on " + "윷");
				break;
		case 5: 
			yut="모";
			System.out.println("turns on " + "모");
				break;
		default: System.out.println("오류가 발생하였습니다.");
		 		break;
		}
		
	   
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		System.out.println("*****게임을 시작합니다*******");
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 선수의 이름을 입력하세요: ");
		player1=sc.next();
		System.out.print("두번째 선수의 이름을 입력하세요: ");
		player2=sc.next();
		        
		GameGUI test=new GameGUI(player1,player2);
		
	}
}
	
			
	//	if(p1.getNum()>p2.getNum()){
			//  System.out.println(p1.getName()+" 선수 총 점 : "+p1.getNum()+ "//"+p2.getName()+" 선수 총 점 : "+p2.getNum());
		//	  System.out.println(p1.getName()+ " won");
		//	}
		//	else if(p1.getNum()==p2.getNum()){
		//	  System.out.println(p1.getName()+" 선수 총 점 : "+p1.getNum()+"//"+p2.getName()+" 선수 총 점 : "+p2.getNum());
		//	  System.out.println(" draw");
		//	}
		//	else
		//      System.out.println(p1.getName()+" 선수 총 점 : "+p1.getNum()+"// "+p2.getName()+" 선수 총 점 : "+p2.getNum());
		//	  System.out.println(p2.getName()+ " won");
		//    }


	