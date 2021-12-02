package class_and_object;

public class Calculator2 {
        public int add(int a , int b){
            return a+b;
        }
        public int sub(int a, int b){
            return a-b;
        }
        public int mul(int a, int b){
            return a*b;
        }
        public float div(float a, float b){
            return a/b;
        }

        public static void main(String[] args){

            Calculator2 obj=new Calculator2();

            int add=obj.add(7,13);
            System.out.println("Addition is: "+add);

            int sub=obj.sub(15,13);
            System.out.println("Subtraction is: "+sub);

            int mul=obj.mul(7,5);
            System.out.println("Multiplication is: "+mul);
            float div=obj.div(57,6);
            System.out.println("Division is: "+div);
        }

}
