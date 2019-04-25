import java.io.*;
import java.util.*;

public class BagB {
    private ArrayList<Item> itemsB;
    private ArrayList<Item> itemsC;
    private int bagSize;

    public BagB(){
        itemsB = new ArrayList<Item>();
        itemsC = new ArrayList<Item>();
        bagSize = 10;
        itemsB.add(new Item("Potion",1));
        itemsB.add(new Item("Potion",1));
        itemsC.add(new Item("Potion",1));
        itemsC.add(new Item("Potion",1));
    }

    public void additemB(){
        itemsB.add(new Item("potion",1));
    }

    public void additemC(){
        itemsC.add(new Item("potion",1));
    }
    public String getItemB(int index){
        return  itemsC.get(index-1).getItemName();
    }

    public String getItemC(int index){
        return  itemsB.get(index-1).getItemName();
    }

    public int getCountBagB(){
        return itemsB.size();
    }

    public int getCountBagC(){
        return itemsC.size();
    }

    public void getNewItemB(String nameItem,int amount){
        if(isFull()){
            System.out.println("Bag is Full");
            return;
        }
        else if(isItHaveB(nameItem)){
            for (Item item : itemsB) {
                if(item.getItemName().equals(nameItem)){
                    item.setAmount(amount);
                    return;
                }
            }
        }
        else itemsB.add(new Item(nameItem,amount));
    }

    public void getNewItemC(String nameItem,int amount){
        if(isFull()){
            System.out.println("Bag is Full");
            return;
        }
        else if(isItHaveC(nameItem)){
            for (Item item : itemsC) {
                if(item.getItemName().equals(nameItem)){
                    item.setAmount(amount);
                    return;
                }
            }
        }
        else itemsC.add(new Item(nameItem,amount));

    }

    private boolean isItHaveB(String nameItem){
        for (Item item : itemsB) {
            if(item.getItemName().equals(nameItem)){
                return true;
            }
        }
        return false;
    }

    private boolean isItHaveC(String nameItem){
        for (Item item : itemsC) {
            if(item.getItemName().equals(nameItem)){
                return true;
            }
        }
        return false;
    }


    private boolean isFull(){
        if(itemsB.size()+itemsC.size() >= 10){
            return true;
        }
        return false;
    }


    public void usePotionB(){
        if(itemsB.size()>0)
        itemsB.remove(itemsB.size()-1);
    }

    public void usePotionC(){
        if(itemsC.size()>0)
        itemsC.remove(itemsC.size()-1);  
    }



    public int getHpFromPotionB(int index){
        return itemsB.get(index-1).getHealAmount();
    }

    public int getHpFromPotionC(int index){
        return itemsC.get(index-1).getHealAmount();
    }

}