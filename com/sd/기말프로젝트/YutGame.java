import java.util.Scanner;

public class YutGame extends Dice implements Game{

	public String yut;

	@Override
	public void roll() {
		// TODO Auto-generated method stub
	
		number = (int) (Math.random() * 5)+1;
		switch(number){
		case 1:
			yut="��";
			System.out.println("turns on " + "��");
				break;
		case 2:
			yut="��";
			System.out.println("turns on " + "��");
				break;
		case 3: 
			yut="��";
			System.out.println("turns on " + "��");
				break;
		case 4: 
			yut="��";
			System.out.println("turns on " + "��");
				break;
		case 5: 
			yut="��";
			System.out.println("turns on " + "��");
				break;
		default: System.out.println("������ �߻��Ͽ����ϴ�.");
		 		break;
		}
		
	   
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
		        
		GameGUI test=new GameGUI(player1,player2);
		
	}
}
	
			
	//	if(p1.getNum()>p2.getNum()){
			//  System.out.println(p1.getName()+" ���� �� �� : "+p1.getNum()+ "//"+p2.getName()+" ���� �� �� : "+p2.getNum());
		//	  System.out.println(p1.getName()+ " won");
		//	}
		//	else if(p1.getNum()==p2.getNum()){
		//	  System.out.println(p1.getName()+" ���� �� �� : "+p1.getNum()+"//"+p2.getName()+" ���� �� �� : "+p2.getNum());
		//	  System.out.println(" draw");
		//	}
		//	else
		//      System.out.println(p1.getName()+" ���� �� �� : "+p1.getNum()+"// "+p2.getName()+" ���� �� �� : "+p2.getNum());
		//	  System.out.println(p2.getName()+ " won");
		//    }


	