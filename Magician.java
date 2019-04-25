import java.io.*;
import java.util.*;

public class Magician extends Player{
    
    public Magician(Player lastPlayer){
        super.setClass("Magician",lastPlayer.getmaxHp(),lastPlayer.getlvl(),lastPlayer.getDmg(),lastPlayer.getCoin(),lastPlayer.bag,lastPlayer.getClassJop(),lastPlayer.bagB,lastPlayer.getKillCount());
        super.skillList.add("Fire Ball");
        super.skillList.add("Mana Heal");
        
    }
    public int useSkill(int select){
        if(select==1){
                return super.getDmg()*6;
        }
        if(select==2){
                return super.getmaxHp()/3;
        }
        return 0;
    }
}