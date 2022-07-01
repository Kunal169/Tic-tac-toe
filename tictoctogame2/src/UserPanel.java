import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPanel implements ActionListener
{
    JFrame jf;
    JTextField jt1, jt2;
    JLabel jl1, jl2;
    JButton jb;

    UserPanel()
    {
        jf = new JFrame("TicTacToe Game By Mr Kunal");

        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);

        jl1 = new JLabel("Enter player 1 Name");
        jl1.setBounds(50,50,120,40);
        jf.add(jl1);

        jt1 = new JTextField();
        jt1.setBounds(180,50,300,40);
        jf.add(jt1);

        jl2 = new JLabel("Enter player 2 Name");
        jl2.setBounds(50,130,120,40);
        jf.add(jl2);

        jt2 = new JTextField();
        jt2.setBounds(180,130,300,40);
        jf.add(jt2);

        jb = new JButton("Start Game");
        jb.addActionListener(this);
        jb.setBounds(250,220,100,40);
        jf.add(jb);

        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jb)
        {
            String player1 = jt1.getText();
            String plater2 = jt2.getText();

            GamePanel obj = new GamePanel(player1, plater2);
            obj.openGamePanel();
            jf.setVisible(false);
        }
    }
}
