
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
private String itemName;
// below method is used to retrieve a random item name
public Item(){
    itemName=GameData.getRandomItemName();
}
// below method is used to return the itemname
public String toString(){
    return itemName;
}
}
