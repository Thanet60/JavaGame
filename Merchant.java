import java.io.*;
import java.util.*;

public class Merchant extends Player{
    

    public Merchant(Player lastPlayer){
        super.setClass("Merchant",lastPlayer.getmaxHp(),lastPlayer.getlvl(),lastPlayer.getDmg(),lastPlayer.getCoin(),lastPlayer.bag,lastPlayer.getClassJop(),lastPlayer.bagB,lastPlayer.getKillCount());
        super.skillList.add("Cart Attack -10 coin");
        super.skillList.add("Coin Heal -10 coin");
    }
    public int useSkill(int select){
        if(select==1){
            if(super.getCoin() >= 10){
            super.useCoin(-10);
            return super.getDmg()*10;
            }
        }
        if(select==2){
            if(super.getCoin() >= 5){
            super.useCoin(-10);
            return super.getDmg()*3;
            }
        }
        return 0;
    }
}