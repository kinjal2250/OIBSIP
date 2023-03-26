import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
public class atm_interface extends JFrame implements ActionListener {
    JOptionPane p;
    JButton b1,b2,b3,b4,b5,b6;
    int balance=5000;
    UIManager UI=new UIManager();
    atm_interface()
    {

        setLayout(new FlowLayout());
        p=new JOptionPane();
        
        UI.put("Panel.background", new ColorUIResource(234, 249, 189));
        UI.put("OptionPane.background", new ColorUIResource(196, 237, 148));

        b6=new JButton("Login");
        b1=new JButton("Transaction History");
        b2=new JButton("Withdraw");
        b3=new JButton("Deposit");
        b4=new JButton("Transfer");
        b5=new JButton("Quit");
        add(b1);add(b2);add(b3);add(b4);add(b6);add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        setSize(400,150);
        b6.setPreferredSize(new Dimension(80, 40));
        b1.setBackground(new Color(233, 249, 182));
        b2.setBackground(new Color(227, 244, 184));
        b3.setBackground(new Color(227, 244, 184));
        b4.setBackground(new Color(227, 244, 184));
        b5.setBackground(new Color(227, 244, 184));
        b6.setBackground(new Color(234, 252, 178));
        b6.setOpaque(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==b6)
         {
             String m1 = p.showInputDialog(this, "Enter your name", "Login", JOptionPane.INFORMATION_MESSAGE);
             String m2 = p.showInputDialog(this, "Enter your atm no.", "Login", JOptionPane.INFORMATION_MESSAGE);
                if (m1.equals("Richard"))
                  {
                      if (m2.equals("3723"))
                         {
                             p.showMessageDialog(this, "User ID Approved", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                         }
                  }
                else
                  {
                      p.showMessageDialog(this, "User ID Denied", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                  }
         }
         if(e.getSource()==b2)
          {
              String m1=p.showInputDialog(this,"Enter the amount to be withdrawn","Withdraw",JOptionPane.INFORMATION_MESSAGE);
              int d=Integer.parseInt(m1);
              balance=balance-d;
              p.showMessageDialog(this,"Withdrawal Complete\nCurrent Balance: "+String.valueOf(balance),"Withdraw Done",JOptionPane.INFORMATION_MESSAGE);
          }
        if(e.getSource()==b3)
        {
            String m1=p.showInputDialog(this,"Enter the amount to be Deposited","Deposit",JOptionPane.INFORMATION_MESSAGE);
            int d=Integer.parseInt(m1);
            balance=balance+d;
            p.showMessageDialog(this,"Deposit Complete\nCurrent Balance: "+String.valueOf(balance),"Deposit Done",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==b4)
        {
            String m1=p.showInputDialog(this,"Enter the name of the person","Transfer",JOptionPane.INFORMATION_MESSAGE);
            String m2=p.showInputDialog(this,"Enter the amount to be transferred","Transfer",JOptionPane.INFORMATION_MESSAGE);
            int d=Integer.parseInt(m2);
            balance=balance-d;
            p.showMessageDialog(this,m2+" transferred to "+m1+"\nCurrent Balance: "+String.valueOf(balance),"Withdraw Done",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==b1)
        {
            p.showMessageDialog(this,"Current Amount in your account : "+balance,"Transaction History",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==b5)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        new atm_interface();

    }
}
