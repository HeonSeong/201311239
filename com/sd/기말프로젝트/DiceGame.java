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
		System.out.println("*****������ �����մϴ�*******");
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ������ �̸��� �Է��ϼ���: ");
		player1=sc.next();
		System.out.print("�ι�° ������ �̸��� �Է��ϼ���: ");
		player2=sc.next();
		        
		DicePlayer p1=new DicePlayer(player1);
		DicePlayer p2=new DicePlayer(player2);
			
		System.out.println();
		
		p1.play();
			
		p1.play();
			
		p2.play();
			
		p2.play();

			if(p1.getNum()>p2.getNum()){
			  System.out.println(p1.getName()+" ���� �� �� : "+p1.getNum()+"|| "+p2.getName()+" ���� �� �� : "+p2.getNum());
			  System.out.println(p1.getName()+ " won");
			}
			else if(p1.getNum()==p2.getNum()){
			  System.out.println(p1.getName()+" ���� �� �� : "+p1.getNum()+"|| "+p2.getName()+" ���� �� �� : "+p2.getNum());
			  System.out.println(" draw");
			}
			else
			System.out.println(p1.getName()+" ���� �� �� : "+p1.getNum()+"  VS "+p2.getName()+" ���� �� �� : "+p2.getNum());
			  System.out.println(p2.getName()+ " won");
		    }


	
	}
   
