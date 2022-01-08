package important_concepts;

public final class Final_Demo {         // this class can't be inherit bcoz it is final

    public final void demo(){       //we cannot override this method bcoz this is final
        System.out.println("This is demo method");
    }

    public static void main(String[] args){
        final String name="Java";       // we can't further change the value of 'name'

    }
}
