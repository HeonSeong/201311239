import java.util.Scanner;

public class DiceGame extends Dice implements Game{
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		number = (int) (Math.random() * 6)+1;

	    System.out.println("turns on " + number);

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
		        
		DicePlayer p1=new DicePlayer(player1);
		DicePlayer p2=new DicePlayer(player2);
			
		System.out.println();
		
		p1.play();
			
		p1.play();
			
		p2.play();
			
		p2.play();

			if(p1.getNum()>p2.getNum()){
			  System.out.println(p1.getName()+" 선수 총 점 : "+p1.getNum()+"|| "+p2.getName()+" 선수 총 점 : "+p2.getNum());
			  System.out.println(p1.getName()+ " won");
			}
			else if(p1.getNum()==p2.getNum()){
			  System.out.println(p1.getName()+" 선수 총 점 : "+p1.getNum()+"|| "+p2.getName()+" 선수 총 점 : "+p2.getNum());
			  System.out.println(" draw");
			}
			else
			System.out.println(p1.getName()+" 선수 총 점 : "+p1.getNum()+"  VS "+p2.getName()+" 선수 총 점 : "+p2.getNum());
			  System.out.println(p2.getName()+ " won");
		    }


	
	}
   
