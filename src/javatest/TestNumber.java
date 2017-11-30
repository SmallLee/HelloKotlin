package javatest;

public class TestNumber {
    public static void main(String[] args) {
        Long l1 = 128L;
        Long l2 = 128L;
        System.out.println(l1==l2);//false
        Double d1 = 123d;
        Double d2 = 123d;
        System.out.println(d1==d2);
        Boolean b1 = true;
        Boolean b2  = true;
        System.out.println(b1==b2);//true
        //=============================
        System.out.println(1<<2);
        Object[] arr = {2,3,4};
        Integer[] brr = {1,2,3,4};
        arr = brr;
    }
}
