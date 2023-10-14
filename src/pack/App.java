package pack;
import subpack.Plant;
import subpack.Tree;

public class App {
    public static void main(String[] args) throws Exception {
        Plant plant1 = new Plant();
        Tree tree = new Tree();
        
        // Polymorphism: changing / morphing into extensions of the root class of the object during runtime
        //! note: polymorphism morphs a root object's functions that are referenced in the object extension only
        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();
        
    //! error:
    //? plant2.shedLeaves();

    }
}
