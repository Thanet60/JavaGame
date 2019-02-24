import java.io.*;
import java.util.*;

public class Merchant extends Player{
    

    public Merchant(Player lastPlayer){
        super.setClass("Merchant",lastPlayer.getmaxHp(),lastPlayer.getlvl(),lastPlayer.getDmg(),lastPlayer.getCoin(),lastPlayer.bag);
        super.skillList.add("Cart Attack Coin -10 DMG x 10");
    }
    public void showSkillList(){
        int i=0;
        for (String skill : skillList) {
            System.out.println((i+1)+". "+skill);
            i++;
        }
    }
    public int useSkill(int select){
        if(select==1){
            if(super.getCoin() >= 10){
                return super.getDmg()*10;
            }
            else{
                System.out.println("Not Enough COIN!!!!!");
            }
        }
        return 0;
    }    
}