import java.util.ArrayList;
class Thing {
    public String name;
    public String description;
    Thing (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void show () {
        System.out.println(this.name + ": " + this.description);
    }
}

class Things {
    public ArrayList<Thing> things = new ArrayList<>();

    public void add(Thing thing){
        things.add(thing);
    }

    public void show(){
        for (Thing thing : things) {
            System.out.println(thing.name + ": " + thing.description);
        }
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Thing thing1 = new Thing("Milk", "Comes from cows... or other animals.");
        Thing thing2 = new Thing("Water", "Essential for living.");

        Things things = new Things();
        
        things.add(thing1);
        things.add(thing2);
        
        things.show();
    }
}
