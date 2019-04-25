import java.io.*;
import java.util.*;

public class Novice extends Player{

    public Novice(){
        super.skillList.add("Trump");
        super.skillList.add("Heal");
    }

    public int useSkill(int select){
        if(select==1){
            return super.getDmg()*2;
        }
        if(select==2){
            return 20;
        }
        return 0;
    }    
}