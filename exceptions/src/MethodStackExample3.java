
public class MethodStackExample3 {

    public void doThis() throws Exception {
        System.out.println("Arrived in doThis()");
        doThat();
        System.out.println("Back in doThis()");
    }

    public void doThat() throws Exception {
        System.out.println("In doThat()");
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("In main()");
        MethodStackExample3 mse = new MethodStackExample3();
        mse.doThis();
        System.out.println("Back in main()");
    }

}
