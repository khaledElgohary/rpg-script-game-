
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
Item treasure=null;
private String locationName;
private int difficulty;
Monsters monster;
GameController game=new GameController();
/* below method is used to give location name and difficulty this each location
is unique and also gives 50% chance to find item at location*/
public Location(int difficulty){
    this.difficulty=difficulty;
    locationName=GameData.getRandomLocationName();
    int x=GameData.randomRoll(0,2);
    monster=new Monsters(difficulty);
    if(treasure==null){
        if(x==1){
            treasure=new Item();
        }
        else{
            treasure=null;
        }
}
}
// below method is to return location name and difficulty and monster name
public String toString(){
    return locationName+ " (D:"+difficulty+")";
}
//below method is used to check if there is a treasure
public boolean hasTreasure(){
if(treasure!=null){
    return true;    
}
else{
    return false;    
}
}
//below method returns treasure name
public Item stealTreasure(){
    return treasure;
}
// below method returns a statement for 2 cases if treasure found or not
public String treasureString(){
if(hasTreasure()==true){
    return "you have found a treasure "+treasure;
}
else{
    return "no treasure found";
}
}
}
