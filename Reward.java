import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reward extends JFrame{
     
    public Reward(int a,Monster m){
        super("Reward");
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,1));
        JLabel reward = new JLabel();
        JLabel rewardExp = new JLabel();
        JLabel rewardCoin = new JLabel();
        if(a==1){
        reward.setText("******************YOU WIN******************");
        rewardCoin.setText("Coin +"+m.getCoinDrop());
        rewardExp.setText("Exp +"+m.getExpMonster());
        }
        else if(a==2){
        reward.setText("******************YOU DIE******************");
        }
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("OK");
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        p1.add(reward);
        p1.add(rewardCoin);
        p1.add(rewardExp);
        p1.add(b1);
        c.add(p1);
        setVisible(true);
        pack();


         b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
			}
        });
    }
}