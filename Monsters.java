
/**
 * Write a description of class Monsters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monsters
{
private String name;
private int difficulty;
// below method returns name of the monster
public String getName(){
return name;
}
// below method returns the difficulty of the monster
public int getDifficulty(){
return difficulty;
}
// below method gets name of the monster according to its difficulty
public Monsters(int newDifficulty){
name=GameData.getMonsterNameByDifficulty(newDifficulty);
}
}
