package or.nonstaticmembers;

public class NonStaticMembersDemo {

    int num;

    public void method(){

        System.out.println("method");

    }

    {

        System.out.println("non static block");
    }

    public static void main(String[] args) {

        NonStaticMembersDemo nonStatic = new NonStaticMembersDemo();

        new NonStaticMembersDemo();
        new NonStaticMembersDemo();

        nonStatic.method();

        System.out.println(nonStatic.num);

    }
}
