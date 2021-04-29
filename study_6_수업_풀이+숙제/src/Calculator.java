
//(❁´◡`❁) 서연이 문제 풀이 (❁´◡`❁)

public class Calculator {
    int left, right;
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;

    }
    public void sum(int left,int right){
        System.out.println( "더한 값: "+(left+right) );
    }
    public void avg(int left,int right){
        System.out.println("평균 값: "+((left+right)/2));
    }

    public static void main(String[] args) {
        Calculator c_c = new Calculator(10,20);
        c_c.sum(c_c.left, c_c.right);
        c_c.avg(c_c.left, c_c.right);
        System.out.println("===========================");
        Calculator c_c2 = new Calculator(20,40);
        c_c.sum(c_c2.left, c_c2.right);
        c_c.avg(c_c2.left, c_c2.right);
    }

}
