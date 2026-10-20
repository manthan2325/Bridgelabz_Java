import java.util.ArrayList;
import java.util.List;


class Storage<T extends WareHouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
        System.out.println("item added to storage : " + item.name);
    }
    T getItem(int index){
        return items.get(index);
    }
    public List<T> getItems(){
        return items;
    }
    public void displayStorage(){
        for(T item : items){
            item.display();
        }
    }
}
    abstract class WareHouseItem{
        String name;

        WareHouseItem(String name) {
            this.name = name;
        }
        abstract void display();
    }
    class Electronics extends WareHouseItem{

       public Electronics(String name) {
          super(name);
       }    
       public void display(){
        System.out.println("Electronic goods");
       }
    }
    class Groceries extends WareHouseItem{

    public Groceries(String name) {
        super(name);
    }
    public void display(){
        System.out.println("Groceries display");
    }
    }
    class Furniture extends WareHouseItem{
        
        Furniture(String name){
            super(name);
        }
        public void display(){
            System.out.println("Furniture display");
        }
    }
public class WarehouseManagement {
    public static void displayAll(List<? extends WareHouseItem> values){

        for(WareHouseItem item : values){
            item.display();
        }
    }
    public static void main(String[] args) {

        Storage<Electronics> st = new Storage<>();
        Storage<Groceries> gs = new Storage<>();
        Storage<Furniture> fs = new Storage<>();

        st.addItem(new Electronics("Laptop"));
        st.addItem(new Electronics("Mobile"));

        gs.addItem(new Groceries("Wheat"));
        gs.addItem(new Groceries("barley"));

        fs.addItem(new Furniture("Table"));
        fs.addItem(new Furniture("chair"));

        st.displayStorage();

        displayAll(st.getItems());
        displayAll(gs.getItems());
        displayAll(fs.getItems());
        
    }
}