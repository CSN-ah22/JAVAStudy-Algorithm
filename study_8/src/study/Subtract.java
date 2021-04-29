package study;

public class Subtract extends Calculator {
    public Subtract(int left, int right) {
        super(left, right);
    }

    public void Subtract() {
       int sub = left-right;
        System.out.println("sub의 값: "+sub);
    }

    public static void main(String[] args) {
        Calculator cc = new Calculator(10,20);
        Subtract ss = new Subtract(10,20);
        ss.sum();
        ss.avg();
        ss.Subtract();
    }
}
