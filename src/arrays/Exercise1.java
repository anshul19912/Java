package arrays;

public class Exercise1 {

    public void DemoDouble(){

        double [] salary={56000,65434,85500,69000,78900};

        System.out.println(salary[0]);
        System.out.println(salary[1]);
        System.out.println(salary[2]);
        System.out.println(salary[3]);
        System.out.println(salary[4]);

        for(int i=0;i< salary.length;i++){
            System.out.println("Inside for loop, salary is: Rs."+salary[i]);
        }

        for(double var:salary){
            System.out.println("Inside advance for loop, salary is: Rs."+var);
        }
    }

    public static void main(String[] args){

        Exercise1 obj=new Exercise1();
        obj.DemoDouble();
    }
}
