
public class MethodStackExample {

    public void doThis() {
        System.out.println("Arrived in doThis()");
        doThat();
        System.out.println("Back in doThis()");
    }

    public void doThat() {
        System.out.println("In doThat()");
    }

    public static void main(String[] args) {
        System.out.println("In main()");
        MethodStackExample mse = new MethodStackExample();
        mse.doThis();
        System.out.println("Back in main()");
    }

}
