package orgg.accesmodifiers;

public class A {

    private int a = 23;
    int b = 30;

    protected  int c = 40;

    public  int d = 5;

    public static void main(String[] args) {

        A obj = new A();

        System.out.println(obj.a);

        System.out.println(obj.b);

        System.out.println(obj.c);

        System.out.println(obj.d);


    }

}
