package string;

public class Demo {
    public static void main(String[] args){
        String s="Java";
        String s1="Java";                      //if obj is created  with "" than it goes in String pool and goes to same memory location
        String s2= new String("Java");                 // if obj is created with new keyword than it goes to heap memory and created at new memory location
        if(s==s1){
            System.out.println("s and s1 are at same memory location");
        }
        if(s==s2){          //       '==' checks memory location
            System.out.println("s and s2 ae at same memory location");
        }
        else{
            System.out.println("No, s and s2 are not at same memory location");
        }

        if(s.equals(s1)){               // equals check content(data)
            System.out.println("s and s1 holding same data");
        }
    }
}
