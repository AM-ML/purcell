package subpack;

public class Person implements Info{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void func(){
        System.out.println("Greets.");
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
    }

    public String toString(){
        return String.format("Name: %s", name);
    }
}
