import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame{
     
    public Welcome(){
        super("WELCOME");
        Player novice = new Novice();
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,1));

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JLabel welcome = new JLabel("WELCOME");
        JButton b1 = new JButton("Start");
        p1.add(welcome);
        p1.add(b1);
        c.add(p1);
        setVisible(true);
        pack();


         b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RagnaGUI(novice);
                dispose();
			}
        });
    }
    public static void main(String[] args) {
        new Welcome();
    }
}