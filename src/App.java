class Ob1 {
    static String name = "Name";
    static Integer age = 20;

     
}


class Ob2 {
    static String name = "Name";
    static Integer age = 20;


    public String toString(){
        return String.format("%s: %3d", name, age);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Ob1 obj1 = new Ob1();

        System.out.println(obj1); // prints memory location address of the object
        
        Ob2 obj2 = new Ob2();

        System.out.println(obj2); // uses the toString() method to represent the object
    }
}
