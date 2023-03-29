import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class NumberGuessingGame extends JFrame implements ActionListener
{
    JButton b1,b2;
    JOptionPane p;
    int count=0,attempt=0;
    Random r=new Random();
    int n;

    NumberGuessingGame()
    {
        setLayout(new FlowLayout());
        p=new JOptionPane();
        b1=new JButton("Play");
        b2=new JButton("Exit");
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(300,150);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)

        {
            n= r.nextInt(1,100);
            attempt++;
            if(attempt<=3)
            {
                String cnum=p.showInputDialog(this,"Enter number between 1-100","Number Guessing Game",JOptionPane.INFORMATION_MESSAGE);

                if(Integer.parseInt(cnum)==n)
                {
                    p.showMessageDialog(this,"Your Guessing is correct","Result",JOptionPane.INFORMATION_MESSAGE);
                    count++;
                }
                if(Integer.parseInt(cnum)<n)
                {
                    p.showMessageDialog(this,"Your Guessing is incorrect\nIt is lower than the generated number\nGenerated Number: "+n,"Result",JOptionPane.INFORMATION_MESSAGE);
                }
                if(Integer.parseInt(cnum)>n)
                {
                    p.showMessageDialog(this,"Your Guessing is incorrect\nIt is higher than the generated number\nGenerated Number : "+n,"Result",JOptionPane.INFORMATION_MESSAGE);
                }
                if(attempt==5)
                {
                    p.showMessageDialog(this,"Attempts: "+attempt+"\nScore: "+count+"\n----Thank you for Playing the game----","Score Card",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                p.showMessageDialog(this, "Your have used all your chances","Attention",JOptionPane.INFORMATION_MESSAGE);
            }

        }
        if(e.getSource()==b2)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        // new NumberGuessingGame("Number Guessing Game");

        new NumberGuessingGame();
    }
}

