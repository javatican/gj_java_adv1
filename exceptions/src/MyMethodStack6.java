
public class MyMethodStack6 {

    public int first() throws Exception {
        System.out.println("In first()");
        int result; 
        result = second();
        System.out.println("Back to first()");
        System.out.println("in first: result="+result);
        System.out.println("leaving first()");
        return result;
    }

    public int second() throws Exception {
        System.out.println("In second()");
        int result;
        if(true) throw new Exception();
        result = 100;
        System.out.println("in second: result="+result);
        System.out.println("leaving second()");
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("In main()");
        MyMethodStack6 mms = new MyMethodStack6();
        int result;
        result = mms.first();
        System.out.println("Back to main()");
        System.out.println("in main: result="+result);
    }

}
