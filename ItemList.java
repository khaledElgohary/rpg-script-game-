
/**
 * Write a description of class ItemList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemList
{
private int currentItemCount;
Item items[];
// returns currentitemcount variable value
public int itemCount(){
    return currentItemCount;
}
//below method is used to initialize the array items and currentItemCount var
public ItemList(){
    currentItemCount=0;
    items=new Item[100];
}
// below method add treasure to the items array
public void addItem(Item treasure){
    items[currentItemCount]=treasure;
    currentItemCount=currentItemCount+1;
}
// below method returns items in the arrays and returns it
public String toString(){
String m="";
    for(int i=0;i<100;i++){
        if(items[i]!=null){
            m=""+m+items[i]+" ";
        }
        else{
             continue;
        }
}
return m;
}
}