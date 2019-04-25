import java.io.*;
import java.util.*;


public class Item {
    private String itemName;
    private int itemAmount;
    private int healAmount;
    private int mpAmount;

    public Item(String name,int number){
        itemName  = name;
        itemAmount = number;
        if(name.equals("Potion")){
            healAmount = 50;
        }
        else if(name.equals("Super Potion")){
            healAmount = 100;
        }
        else if(name.equals("Hyper Potion")){
            healAmount = 150;}
    }

    public String getItemName(){
        return itemName;
    }

    public String getItemNameAndValue(){
        return itemName + " HP+" + healAmount ;
    }

    public int getAmount(){
        return itemAmount;
    }

    public void setAmount(int amount){
        itemAmount += amount;
    }

    public int getHealAmount(){
        return healAmount;
    }

    public int getMpAmount(){
        return mpAmount;
    }

}