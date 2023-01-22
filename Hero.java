
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero
{
private String heroName;
private int currentHP;
private final int startingHP=8;
ItemList inventory;
//below method is used to assign a name to the hero of the game
public String getName(){
    return heroName;
}
//below method is used to assign HP to the hero
public int getHP(){
    return currentHP;
}
public int changeHP(int damage){
    return currentHP=currentHP-damage;
}
//below method is used to get the name and hp of the hero
public Hero(){
    heroName=GameData.getRandomName();
    currentHP=startingHP;
    inventory=new ItemList();
}
//below method is used to return a block of string of hero name and hp
public String toString(){
    return "---------\n"+"current Hero:"+heroName+"\ncurrent HP:"+currentHP+"\n"+"---------";
}
// below method is used to add item to the inventory array
public void collectItem(Item m){
    inventory.addItem(m);
}
// below method is used to return the items in the inventory array
public String getItemsCollected(){
    return inventory.toString();
}
}
