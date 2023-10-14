package subpack;

public class Tree extends Plant {

    @Override
    public void grow() {
        System.out.println("Tree is growing.");
    }

    public void shedLeaves() {
        System.out.println("The Tree is shedding its leaves.");
    }
}
