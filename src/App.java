public class App {
    public static void main(String[] args) throws Exception {
      //* [//*] -> are the actual steps that run while compiling
      //?   Memory Consuming
        
            String s = "";
            
      //*  String temp = "String 1.";
      //*  s = s + temp; 

            s += "String 1.";    
            
      //*  String temp2 = "String 2.";
      //*  s = s + temp2;

            s += "String 2.";
            
      //*  String temp3 = "String 3.";
      //*  s = s + temp3;
      
            s += "String 3."; 

        //? Not as memory consuming

        StringBuilder st = new StringBuilder("");

        st.append("String 1.");
        st.append("String 2.");
        st.append("String 3.");
        
        StringBuilder str = new StringBuilder("");
        str.append("String 1.")
           .append("String 2.")
           .append("String 3.");

        System.out.println(s);
        System.out.println(st);
        System.out.println(str);
        System.out.printf("formatted output: %20.0f, %.1f, %.2f", 1.2, 3.4, 5.6); // printf(formatted, args..);
    }
}
