package subpack;

public class Machine implements Info{
    private int id = 7;
    private String stat = "Mach is Neutral.";
    public void func(){
        stat ="Mach Started.";
        System.out.println("Mach Started.");
    }

    @Override
    public void showInfo(){
        System.out.println("id: " + id);
        System.out.println("status: " + stat);
    }

    @Override
    public String toString(){
        return String.format("Mach ID: %d, %s", id, stat);
    }
}
