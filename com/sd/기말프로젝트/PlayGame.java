import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Dice : 1 or yut : 2 exit : 3");
		int select =sc.nextInt();
		System.out.println(select+"���� �����ϼ̽��ϴ�.");
		
		if(select==1){
			DiceGame dice=new DiceGame();
			dice.startGame();

		}
		else if(select==2){
			YutGame yut=new YutGame();
			yut.startGame();

		}
		else if(select==3){
			System.out.println("���α׷��� �����մϴ�.");
		}
		
			}

}
