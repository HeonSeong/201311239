
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame implements ActionListener {

	   
		
		JLabel player1Name;
		JLabel player2Name;
		
		JButton play1;
		JButton play2;
		
		JTextField player1Score;
		JTextField player2Score;
		
		JTextField player1Result;
		JTextField player2Result;
		
	
		JTextField GameResult;
		
		int score1=0;
		int score2=0;
		
		YutPlayer player1,player2;
		
		public GameGUI(String p1,String p2){
			
			
			this.player1=new YutPlayer(p1);
			this.player2=new YutPlayer(p2);
			
			
		JPanel panel1=new JPanel(new GridLayout(1,2));
		JPanel panel2=new JPanel(new GridLayout(2,2));
		JPanel panel3=new JPanel(new GridLayout(1,3));

		player1Name=new JLabel(p1);
		player2Name=new JLabel(p2);
		
		player1Score=new JTextField("");
		player2Score=new JTextField("");
		
		play1=new JButton("�� ������");
		play2=new JButton("�� ������");
		
		player1Result=new JTextField("");
		player2Result=new JTextField("");
		
		GameResult=new JTextField("20���� ���� ����ϸ� �¸�!");
		
		panel1.add(player1Name);
		panel1.add(player2Name);
		
		panel2.add(player1Score);
		panel2.add(player2Score);
		
		panel2.add(player1Result);
		panel2.add(player2Result);
		
		panel3.add(play1);
		panel3.add(GameResult);
		panel3.add(play2);
		
		play1.addActionListener(this);
		play2.addActionListener(this);
		
		add(panel1,BorderLayout.PAGE_START);
		add(panel2,BorderLayout.CENTER);
		add(panel3,BorderLayout.PAGE_END);
	
		
		
		setSize(1000,1000);
		setTitle("�� ���� ���� ");
		pack();
		setVisible(true);
		
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==play1){
				YutGame d1=new YutGame();
				d1.roll();
				score1+=d1.getNum();
				
				if(d1.getNum()==1){
					player1Score.setText("player1 ���: '��' ");
					player1Result.setText("player1 ���� ���ھ�: ");
				}
				else if(d1.getNum()==2){
					player1Score.setText("player1 ���: '��' ");
				}
				else if(d1.getNum()==3){
					player1Score.setText("player1 ���: '��' ");
				}
				else if(d1.getNum()==4){
					player1Score.setText("player1 ���: '�U' �ѹ���! ");
				}
				else if(d1.getNum()==5){
					player1Score.setText("player1 ���: '��' �ѹ���! ");
				}
				if(score1>=20){
					GameResult.setText(player1.getName()+" ���� �¸��ϼ̽��ϴ�.!  ");
				}
				player1Result.setText("player1 ���� ���ھ� : "+score1);
		
			}
			
			
			else if(e.getSource()==play2){
				YutGame d2=new YutGame();
				d2.roll();
				score2+=d2.getNum();
				
				if(d2.getNum()==1){
					player2Score.setText("player2 ���: '��' ");
				
				}
				else if(d2.getNum()==2){
					player2Score.setText("player2 ���: '��' ");
				}
				else if(d2.getNum()==3){
					player2Score.setText("player2 ���: '��' ");
				}
				else if(d2.getNum()==4){
					player2Score.setText("player2 ���: '�U' �ѹ���! ");
				}
				else if(d2.getNum()==5){
					player2Score.setText("player2 ���: '��' �ѹ���! ");
				}
				if(score2>=20){
					GameResult.setText(player2.getName()+" ���� �¸��ϼ̽��ϴ�.! ");
				}
				player2Result.setText("player2 ���� ���ھ� : "+score2);
			
			}
		}
		
		
	}
