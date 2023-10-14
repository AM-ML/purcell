package pack;
import subpack.Person;
import subpack.Machine;


public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Jaafar");
        System.out.println(p);
        p.showInfo();
        p.func();

        Machine mach = new Machine();
        System.out.println(mach);
        mach.showInfo();
    }
}
