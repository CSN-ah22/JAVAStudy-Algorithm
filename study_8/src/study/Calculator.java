package study;

public class Calculator {
    int left;
    int right;

    public Calculator(int left,int right){
        this.left = left;
        this.right = right;

    }
    public void sum(){
        System.out.println("sum의 값: "+(this.left+this.right));
    }
    public void avg(){
        System.out.println("avg의 값:  "+(this.left+this.right)/2);
    }
}
