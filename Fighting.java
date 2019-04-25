import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fighting extends JFrame{
     
    public Fighting(Player novice,Monster monsters){
        super("Fight");
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,4));

        JButton b1 = new JButton("Exit");
        JButton b2 = new JButton("Attack");
        JButton b4 = new JButton("Potion");
        JButton b5 = new JButton("Super Potion");
        JButton b6 = new JButton("Skill1"+novice.skillList.get(0));
        JButton b7 = new JButton("skill2"+novice.skillList.get(1));

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        JLabel status = new JLabel("                         STATUS");
        JLabel jobClass = new JLabel("         Class is --" + novice.getJobClass()+"--");
        JLabel level = new JLabel("        Level =" + novice.getlvl());
        JLabel Hp = new JLabel("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
        JLabel statusMonster = new JLabel("                         STATUS MONSTER");
        JLabel monsterName = new JLabel("         Monster name --"+ monsters.getNameMonster()+"--");
        JLabel HpMonster = new JLabel("         Hp =" + monsters.getHpMonster()+ "/" + monsters.getMaxHp());
        JLabel skill = new JLabel("         Skil");
        JLabel bag = new JLabel("         Bag");
        JLabel coin = new JLabel("         Coin = "+novice.getCoin());
        JLabel itemB = new JLabel("x"+(novice.bagB.getCountBagB()));
        JLabel itemC = new JLabel("x"+(novice.bagB.getCountBagC()));

        ImageIcon NoviceI = new ImageIcon(novice.getJobClass()+".png");
        JLabel NoviceIpic1 = new JLabel(NoviceI);
        
        
        ImageIcon NoviceII = new ImageIcon(monsters.getNameMonster()+".png");
        JLabel NoviceIpic2 = new JLabel(NoviceII);
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
			}
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monsters.dmgToMonster(novice.getDmg());
                novice.dmgToHp(-monsters.getDmgMonster());
                HpMonster.setText("         Hp =" + monsters.getHpMonster()+ "/" + monsters.getMaxHp());
                Hp.setText("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
                coin.setText("         Coin = "+novice.getCoin());
                if(monsters.getHpMonster()<=0){
                novice.expgain(monsters.getExpMonster());
                novice.lvlup();
                novice.setKillCount();
                novice.useCoin(monsters.getCoinDrop());
                     if(novice.getlvl()==10&&novice.getClassJop()==0){
                    novice.setClassJop(1);
                    new ChangeClass(novice);
                    }
                    else {
                    new RagnaGUI(novice);
                    }
                new Reward(1,monsters);
                dispose();
                }
                else if(novice.gethp()<=0){
                novice.resurrection(); 
                new RagnaGUI(novice);
                new Reward(2,monsters);
                dispose();
                }
			}
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monsters.dmgToMonster(novice.useSkill(1));
                novice.dmgToHp(-monsters.getDmgMonster());
                HpMonster.setText("         Hp =" + monsters.getHpMonster()+ "/" + monsters.getMaxHp());
                Hp.setText("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
                coin.setText("         Coin = "+novice.getCoin());
                if(monsters.getHpMonster()<=0){
                novice.expgain(monsters.getExpMonster());
                novice.lvlup();
                novice.setKillCount();
                novice.useCoin(monsters.getCoinDrop());
                    if(novice.getlvl()==10&&novice.getClassJop()==0){
                    novice.setClassJop(1);
                    new ChangeClass(novice);
                    }
                    else {
                    new RagnaGUI(novice);
                    }
                new Reward(1,monsters);
                dispose();
                }
                else if(novice.gethp()<=0){
                novice.resurrection(); 
                new RagnaGUI(novice);
                new Reward(2,monsters);
                dispose();
                }
			}
        });
        
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                novice.dmgToHp(novice.useSkill(2));
                novice.dmgToHp(-monsters.getDmgMonster());
                HpMonster.setText("         Hp =" + monsters.getHpMonster()+ "/" + monsters.getMaxHp());
                Hp.setText("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
                coin.setText("         Coin = "+novice.getCoin());
                if(monsters.getHpMonster()<=0){
                novice.expgain(monsters.getExpMonster());
                novice.lvlup();
                novice.setKillCount();
                novice.useCoin(monsters.getCoinDrop());
                    if(novice.getlvl()==10&&novice.getClassJop()==0){
                    novice.setClassJop(1);
                    new ChangeClass(novice);
                    }
                    else {
                    new RagnaGUI(novice);
                    }
                new Reward(1,monsters);
                dispose();
                }
                else if(novice.gethp()<=0){
                novice.resurrection(); 
                new RagnaGUI(novice);
                new Reward(2,monsters);
                dispose();
                }
			}
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(novice.bagB.getCountBagB()>0){
                novice.dmgToHp(100);
                novice.dmgToHp(-monsters.getDmgMonster());
                novice.bagB.usePotionB();
                }
                else {

                    novice.dmgToHp(-monsters.getDmgMonster());
                    if(novice.gethp()<=0){
                        novice.resurrection(); 
                        new RagnaGUI(novice);
                        new Reward(2,monsters);
                        dispose();
                }
            }
            itemB.setText("x"+novice.bagB.getCountBagB());
            Hp.setText("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
			}
        });
        
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(novice.bagB.getCountBagC()>0){
                novice.dmgToHp(150);
                novice.dmgToHp(-monsters.getDmgMonster());
                novice.bagB.usePotionC();
                }
                else{

                    novice.dmgToHp(-monsters.getDmgMonster());
                    if(novice.gethp()<=0){
                        novice.resurrection(); 
                        new RagnaGUI(novice);
                        new Reward(2,monsters);
                        dispose();
                }
            }
            itemC.setText("x"+novice.bagB.getCountBagC());
            Hp.setText("         Hp =" + novice.gethp()+ "/" + novice.getmaxHp());
			}
        });

        p3.add(NoviceIpic1);

        p4.add(NoviceIpic2);
        p4.add(b1);

        p1.add(status);
        p1.add(jobClass);
        p1.add(level);
        p1.add(Hp);
        p1.add(coin);
        p1.add(b2);
        p1.add(skill);
        p1.add(b6);
        p1.add(b7);
        p1.add(bag);
        p1.add(b4);
        p1.add(itemB);
        p1.add(b5);
        p1.add(itemC);

        p2.add(statusMonster);
        p2.add(monsterName);
        p2.add(HpMonster);

        c.add(p3);
        c.add(p1);
        c.add(p2);
        c.add(p4);
        setVisible(true);
        pack();
    }
}