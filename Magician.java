import java.io.*;
import java.util.*;

public class Magician extends Player{
    
    public Magician(Player lastPlayer){
        super.setClass("Magician",lastPlayer.getmaxHp(),lastPlayer.getlvl(),lastPlayer.getDmg(),lastPlayer.getCoin(),lastPlayer.bag);
        super.skillList.add("Fire Ball DMG x 6");
        super.skillList.add("Meteo Strom DMG x 10");
        
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
                System.out.println("Fire Ball Active");
                return super.getDmg()*6;
        }
        if(select==2){
                System.out.println("Meteo Strom Active");
                return super.getDmg()*10;
        }
        return 0;
    }
}