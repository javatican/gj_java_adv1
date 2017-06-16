public class MethodStackExample2{

    public void doThis() {
        System.out.println("Arrived in doThis()");
        try {
            doThat();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Back in doThis()");
    }

    public void doThat() throws Exception {
        System.out.println("In doThat()");
        throw new Exception();
    }

    public static void main(String[] args) {
        System.out.println("In main()");
        MethodStackExample2 mse = new MethodStackExample2();
        mse.doThis();
        System.out.println("Back in main()");
    }

}
