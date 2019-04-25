import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeClass extends JFrame{
    Player novicePlayer = new Novice();
     
    public ChangeClass(Player novice){
        super("Change Class");
        novicePlayer = novice;
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,1));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JLabel classJob = new JLabel("*******************Choose Class Job*******************");
        JButton b1 = new JButton("Merchart");
        JButton b2 = new JButton("Magician");
        p1.add(classJob);
        p1.add(b1);
        p1.add(b2);
        c.add(p1);
        setVisible(true);
        pack();

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                novicePlayer = new Merchant(novicePlayer);
                new RagnaGUI(novicePlayer);
                dispose();
			}
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                novicePlayer = new Magician(novicePlayer);
                new RagnaGUI(novicePlayer);
                dispose();
			}
        });
    }
}