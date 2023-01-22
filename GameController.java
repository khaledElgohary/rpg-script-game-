import static java.lang.System.out;
// Stage0
public class GameController{
    // Phase 0
    private static final int MAP_LOCATIONS = 6;
    public Hero currentHero;
    final private int maxdmg=4;
    final private int mindmg=1;
    private int damageCounter;
    public static void main(String[] args){
        GameController run=new GameController();
        run.runGame();
    }
    public void initializeMap(int numberOfLocations){
        //Create hero object
        currentHero=new Hero();
        System.out.println(currentHero.toString());
        // Create the Location Array
        Location loc[]=new Location[numberOfLocations];
        // Initialize The Map
        for(int i=0;i<numberOfLocations;i++){
            loc[i]=new Location(i);
        }
        // Print out the map
        /*below loop is responsible for printing the map and also
          managing the encounter and determines if player will win encounter
          and take the treasure or not*/
        for(int i=0;i<numberOfLocations;i++){
            int dmgRoll=damageDealt();
            int dmgBonus=damageBonus();
            System.out.println("\n\nour hero enters "+loc[i].toString()+" containing "+loc[i].monster.getName());
            System.out.println(loc[i].treasureString());
                     if(loc[i].hasTreasure()==true){
                        if(dmgRoll+dmgBonus>i){
                            currentHero.collectItem(loc[i].stealTreasure());
                            System.out.print("our hero has rolled "+dmgRoll+" damage "+"with "+dmgBonus+" extra damage");
                            System.out.println("\nour hero "+currentHero.getName()+" has defeated "+loc[i].monster.getName()+" and retrieved "+loc[i].treasure.toString());
                        }
                        else{
                            takeDamage(i);
                            System.out.println(currentHero.getName()+" can't handle the "+loc[i].monster.getName()+" and has taken "+i+" damage");
                        }
            }
                    if(loc[i].hasTreasure()==false){
                    System.out.println("our hero "+currentHero.getName()+" has bravely avoided fighting "+loc[i].monster.getName());        
            }
                if(currentHero.getHP()<=0){
                    break;
            }
        }
    }
    // below method is used to return a random damage roll 
    public int damageDealt(){
        return GameData.randomRoll(mindmg,maxdmg);
    }
    // below method is used to return the damageBonus in encounter
    public int damageBonus(){
        return currentHero.inventory.itemCount();
    }
    // below method is used to calculate the damage taken by hero
    public int takeDamage(int damageAmount){
        return currentHero.changeHP(damageAmount);
    }
    // below method is used to run the game 
        public void runGame(){
        initializeMap(6);
        if(currentHero.getHP()>0){
            System.out.println("\n\nour hero have survived with "+currentHero.getHP()+"! in your loot bag:\n"+currentHero.getItemsCollected());
        }
        else{
            System.out.println("\n\nour hero have died");
        }
        out.println(" --- The End --- \n\n");
    }
}