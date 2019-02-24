import java.io.*;
import java.util.*;


public class Monster {
    private String monsterName;
    private int hpMonster;
    private int maxHp;
    private int expMonster;
    private int monsterDmg;
    private int coinDrop;
    private String itemMonster;
    public Monster(){
        monsterName = "";
        maxHp = 0;
        hpMonster = maxHp;
        expMonster = 0;
        monsterDmg = 0;
        itemMonster = "";
        coinDrop = 0;
    }
    public void selectmonster(int idMonster){
        if(idMonster == 1){
            monsterName = "Dark Lord";
            maxHp = 30;
            hpMonster = maxHp;
            expMonster = 10;
            monsterDmg = 10;
            itemMonster = "Potion";
            coinDrop = 5;
        }
        if(idMonster == 2){
            monsterName = "Baphomet";
            maxHp = 60;
            hpMonster = maxHp;
            expMonster = 20;
            monsterDmg = 20;
            itemMonster = "Super Potion";
            coinDrop = 10;
        }
        if(idMonster == 3){
            monsterName = "FaceMeKak";
            maxHp = 150;
            hpMonster = maxHp;
            expMonster = 50;
            monsterDmg = 40;
            itemMonster = "Hyper Potion";
            coinDrop = 15;
        }
        if(idMonster == 6){
            monsterName = "Test Class Job";
            maxHp = 10;
            hpMonster = maxHp;
            expMonster = 450;
            monsterDmg = 10;
            itemMonster = "Restoration";
            coinDrop = 100000;
        }
    }
    public String getNameMonster(){
        return monsterName;
    }
    public int getHpMonster(){
        return hpMonster;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public int getExpMonster(){
        return expMonster;
    }
    public int getDmgMonster(){
        return monsterDmg;
    }
    public int getCoinDrop(){
        return coinDrop;
    }
    public String getItem(){
        return itemMonster;
    }
    public void dmgToMonster(int dmg){
        hpMonster = hpMonster-dmg;
    }
}