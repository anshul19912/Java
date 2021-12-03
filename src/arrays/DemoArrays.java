package arrays;

public class DemoArrays {

    public void demoIntArray(){

        //Syntax of Array:  Datatype [] variable_name={,,,,};

        int [] marksArray={43,55,33,87,98,67,78,32,41};

        //index: 0,1,2,3,4,5,6

        for(int i=0;i< marksArray.length;i++){
            System.out.println("Inside for loop "+marksArray[i]);
        }

        //advance for loop
        //syntax: for (Datatype var_name : array){}
        for(int var:marksArray){
            System.out.println("Inside advanced for loop "+var);
        }
    }

    public void demoStringArray(){

        String [] nameArray={"Java","Java8","Spring","Spring Boot","Cloud"};

        for(String var:nameArray){
            System.out.println("Inside advance for loop Name Array: " +var);
        }


    }
    public static void main(String[] args){

        DemoArrays obj=new DemoArrays();

        obj.demoIntArray();
        obj.demoStringArray();

    }
}
