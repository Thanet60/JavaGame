import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * RagnaGUI
 */
public class RagnaGUI extends JFrame{

    public RagnaGUI(Player novice){
        super("RagnaGameinDream");
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,2));
        Monster monster = new Monster();

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        ImageIcon logo = new ImageIcon("Icon.jpg");
        JLabel logopic = new JLabel(logo);
        ImageIcon NoviceI = new ImageIcon(novice.getJobClass()+".png");
        JLabel NoviceIpic = new JLabel(NoviceI);
        JLabel status = new JLabel("                         STATUS");
        JLabel jobClass = new JLabel("         Class is --" + novice.getJobClass()+"--");
        JLabel level = new JLabel("        Level =" + novice.getlvl());
        JLabel Hp = new JLabel("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
        JLabel exp = new JLabel("        EXP. =" + novice.getexp()+"/"+novice.getlvl()*10);
        JLabel coin = new JLabel("        Coin ="+ novice.getCoin());
        JLabel dmg = new JLabel("        Damage ="+ novice.getDmg());
        JLabel item1 = new JLabel("Potion -5 coin per unit x"+novice.bagB.getCountBagB());
        JLabel item2 = new JLabel("Super Potion -15 coin per unit x"+novice.bagB.getCountBagC());
        JLabel space1 = new JLabel("   ");
        JLabel space2 = new JLabel("   ");
        JLabel space3 = new JLabel("   ");
        JLabel space4 = new JLabel("   ");
        JLabel space5 = new JLabel("   ");
        JLabel space6 = new JLabel("   ");
        JLabel space7 = new JLabel("   ");
        JLabel space8 = new JLabel("   ");
        JLabel space9 = new JLabel("   ");
        JLabel shop = new JLabel("Shop (Bag"+(novice.bagB.getCountBagB()+novice.bagB.getCountBagC())+"/20)");
        JLabel killCount = new JLabel("          kill Count = "+novice.getKillCount());

        p1.add(logopic);
        p1.add(NoviceIpic);
        p1.add(status);
        p1.add(space1);
        p1.add(jobClass);
        p1.add(space2);
        p1.add(level);
        p1.add(space3);
        p1.add(Hp);
        p1.add(space4);
        p1.add(coin);
        p1.add(space5);
        p1.add(exp);
        p1.add(space6);
        p1.add(dmg);
        p1.add(space7);
        p1.add(killCount);
        c.add(p1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        JButton b1 = new JButton("Slime");
        JButton b2 = new JButton("Rocker");
        JButton b3 = new JButton("Pumpoi");
        JButton b4 = new JButton("Cheat");
        JButton b5 = new JButton("Exit");
        JButton buy1 = new JButton("+");
        JButton buy2 = new JButton("+");

        JLabel  list = new JLabel("Monster List");
        
        p2.add(list);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(space8);
        p2.add(space9);
        p2.add(shop);
        p2.add(item1);
        p2.add(buy1);
        p2.add(item2);
        p2.add(buy2);
        c.add(p2);
        setVisible(true);
        pack();

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monster.selectmonster(1);
                new Fighting(novice,monster);
                dispose();
			}
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monster.selectmonster(2);
                new Fighting(novice,monster);
                dispose();
			}
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monster.selectmonster(3);
                new Fighting(novice,monster);
                dispose();
			}
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monster.selectmonster(4);
                new Fighting(novice,monster);
                dispose();
			}
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
			}
        });
        
        buy1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(novice.getCoin()>=5&&(novice.bagB.getCountBagB()+novice.bagB.getCountBagC())<20 ){
                novice.useCoin(-5);
                novice.bagB.additemB();
                coin.setText("        Coin ="+ novice.getCoin());
                item1.setText("Potion -5 coin per unit x"+novice.bagB.getCountBagB());
                shop.setText("Shop (Bag"+(novice.bagB.getCountBagB()+novice.bagB.getCountBagC())+"/20)");
                }
			}
        });

        buy2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(novice.getCoin()>=15&&(novice.bagB.getCountBagB()+novice.bagB.getCountBagC())<20 ){
                    novice.useCoin(-15);
                    novice.bagB.additemC();
                    coin.setText("        Coin ="+ novice.getCoin());
                    item2.setText("Super Potion -15 coin per unit x"+novice.bagB.getCountBagC());
                    shop.setText("Shop (Bag"+(novice.bagB.getCountBagB()+novice.bagB.getCountBagC())+"/20)");
                    }
                }
        });

    }

}