package or.nonstaticmembers;

public class ThisKeyWordDemo {

    int id;

    ThisKeyWordDemo() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        ThisKeyWordDemo obj1 = new ThisKeyWordDemo();

        ThisKeyWordDemo obj2 = new ThisKeyWordDemo();
    }
}
