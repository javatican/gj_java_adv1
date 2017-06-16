
public class MyMethodStack2 {

    public int first() {
        System.out.println("In first()");
        int result;
        result = second();
        System.out.println("Back to first()");
        System.out.println("in first: result="+result);
        System.out.println("leaving first()");
        return result;
    }

    public int second() {
        System.out.println("In second()");
        int result=0;
        if(true) throw new Error(); //or throw new RuntimeException()
        result = 100;
        System.out.println("in second: result="+result);
        System.out.println("leaving second()");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("In main()");
        MyMethodStack2 mms = new MyMethodStack2();
        int result = mms.first();
        System.out.println("Back to main()");
        System.out.println("in main: result="+result);
    }

}
