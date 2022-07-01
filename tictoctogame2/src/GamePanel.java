import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel implements ActionListener
{
    JFrame jf;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    String str = "";
    int count = 0;
    boolean win = false;
    Color colour1 ;

    String player1, player2;
    String playername;
    GamePanel(String player1, String player2)
    {
       this.player1 = player1;
       this.player2 = player2;
    }
    void openGamePanel()
    {
        System.out.println(player1);
        System.out.println(player2);
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.piaf.windows.WindowsLookAndFell");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        jf = new JFrame();
        jf.setSize(500,500);
        jf.setTitle(player1+" Turns");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        GridLayout gd = new GridLayout(3,3);
        jf.setBackground(Color.RED);
        jf.setLayout(gd);

        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);

        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);

        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);

        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);

        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);

        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);

        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);

        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);

        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);

        jf.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        count = count + 1;
        if (count % 2 == 0)
        {
            str = "0";
            colour1 = Color.BLACK;
            jf.setTitle(player1+" Turns");
        }
        else
        {
            str = "X";
            colour1 = Color.CYAN;
            jf.setTitle(player2+" Turns");
        }
        if (e.getSource() == jb1)
        {
            Font f = new Font("Arial",1,100);
//            jb1.setBackground( Color.BLACK);
            jb1.setBackground(colour1);
            jb1.setForeground(Color.RED);
            jb1.setFont(f);
            jb1.setText(str);
            jb1.setEnabled(false);

        }
        if (e.getSource() == jb2)
        {
            Font f = new Font("Arial",1,100);
//            jb2.setBackground( Color.BLACK);
            jb2.setBackground(colour1);
            jb2.setForeground(colour1);
            jb2.setFont(f);
            jb2.setText(str);
            jb2.setEnabled(false);

        }
        if (e.getSource() == jb3)
        {
            Font f = new Font("Arial",1,100);
//            jb3.setBackground( Color.BLACK);
            jb3.setBackground(colour1);
            jb3.setForeground(colour1);
            jb3.setFont(f);
            jb3.setText(str);
            jb3.setEnabled(false);
        }
        if (e.getSource() == jb4)
        {
            jb4.setFont(new Font("Arial",1,100));
//            jb4.setBackground( Color.BLACK);
            jb4.setBackground( colour1);
            jb4.setText(str);
            jb4.setEnabled(false);
        }
        if (e.getSource() == jb5)
        {
            jb5.setFont(new Font("Arial",1,100));
//            jb5.setBackground( Color.BLACK);
            jb5.setBackground(colour1);
            jb5.setText(str);
            jb5.setEnabled(false);
        }
        if (e.getSource() == jb6)
        {
            jb6.setFont(new Font("Arial",1,100));
//            jb6.setBackground( Color.BLACK);
            jb6.setBackground(colour1);
            jb6.setText(str);
            jb6.setEnabled(false);
        }
        if (e.getSource() == jb7)
        {
            jb7.setFont(new Font("Arial",1,100));
//            jb7.setBackground( Color.BLACK);
            jb7.setBackground( colour1);
            jb7.setText(str);
            jb7.setEnabled(false);
        }
        if (e.getSource() == jb8)
        {
            jb8.setFont(new Font("Arial",1,100));
//            jb8.setBackground( Color.BLACK);
            jb8.setBackground( colour1);
            jb8.setText(str);
            jb8.setEnabled(false);
        }
        if (e.getSource() == jb9)
        {
            jb9.setFont(new Font("Arial",1,100));
//            jb9.setBackground( Color.BLACK);
            jb9.setBackground( colour1);
            jb9.setText(str);
            jb9.setEnabled(false);

        }
        winningPossiblelitys();
        whoWin();
    }

    void winningPossiblelitys()
    {
        // if a==b and b==c then a==c this is transitive property
        // for rows win check
        if (jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() && jb1.getText() != "")
        {
            win = true;
        }
        else if (jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb4.getText() != "")
        {
            win = true;
        }
        else if (jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb7.getText() != "")
        {
            win = true;
        }
        // for coloumn win check
        else if (jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb1.getText() != "")
        {
            win = true;
        }
        else if (jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb2.getText() != "")
        {
            win = true;
        }
        else if (jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb3.getText() != "")
        {
            win = true;
        }
        // diagonal win possibilities
        else if (jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb1.getText() != "")
        {
            win = true;
        }
        else if (jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb3.getText() != "")
        {
            win = true;
        }
        // draw possibilities
        else
        {
            win = false;
        }

    }

    void whoWin()
    {
        if (win == true )
        {
            if (str.equals("0"))
            {
                playername = player2;
            }
            else
            {
                playername = player1;
            }
            String win_titile = playername +"  ("+str+")"+" Wins";
            JOptionPane.showMessageDialog(jf,win_titile);
            jf.setTitle(win_titile);
            restartGame();
        }
        else if (win == false && count == 9)
        {
            JOptionPane.showMessageDialog(jf,str+" Match Draw");
            restartGame();
        }
    }
    void restartGame()
    {
        int i = JOptionPane.showConfirmDialog(jf,"Do you wan to restart the game ?");
        if (i == 0)
        {
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");

            jb1.setBackground(null);
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);

            btnSetEnabling(true);

            str = "";
            count = 0;
            win = false;

        }
        else if (i== 1)
        {
            System.exit(0);
        }
        else
        {
            btnSetEnabling(false);

        }

    }
    void btnSetEnabling(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}


