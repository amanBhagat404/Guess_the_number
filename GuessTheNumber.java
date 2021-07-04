import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.bind.ParseConversionEvent;

public class GuessTheNumber {
  public static void main(String[] args) {
	  Random r=new Random();
	   int n=r.nextInt(100);
	   JFrame f=new JFrame("Guess my number");
	   JLabel t1=new JLabel("enter your number(1-99)");
	   t1.setBounds(100, 50, 150, 50);
	   f.add(t1);
	   JTextField jt=new JTextField();
	   jt.setBounds(100, 100, 100, 50);
	   f.add(jt);
	   
	   JButton b1=new JButton("quit");
	   JButton b2=new JButton("guess");
	   b2.setBounds(300, 100,80, 40);
	   b1.setBounds(210, 200,80, 40);
	   b1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
		}
	  });
	   
	   b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s=jt.getText();
//			   System.out.println(s);
			 int g=Integer.parseInt(s);
				guess(g,n);
		}
	});
	   
	   f.add(b1);
	   f.add(b2);
	   f.setSize(500, 400);
	   f.setLocation(400, 300);
	   f.setLayout(null);
	   f.setVisible(true);
	   
  }
   public static void guess(int g,int n) {
	   JFrame res;
	   JLabel ans;
	   if(g>n) {
		   ans=new JLabel("your guess is greater than actual number...Try again!");
	   }
	   else if(g<n) {
		 ans=new JLabel("your guess is less than actual number...Try again!");   
	   }
	   else {
		   ans=new JLabel("your guess is correct...you won!"); 
	   }
	  res=new JFrame("Result");
	   res.setSize(400,200);
	   res.setLocation(500, 400);
	   res.add(ans,BorderLayout.CENTER);
//	   res.setLayout(BorderLayout);
	   res.setVisible(true);
   }
}
