import java.io.*;
import java.util.*;

public class Novice extends Player{

    public Novice(){
        super.skillList.add("Trump Damagex2");
        super.skillList.add("Heal Coin -10 HP+50");
    }

    public int useSkill(int select){
        if(select==1){
            System.out.println("Use Trump");
            return super.getDmg()*2;
        }
        if(select==2){
            System.out.println("Heal Active HP+20");
            super.dmgToHp(20);
            return 0;
        }
        return 0;
    }    
}