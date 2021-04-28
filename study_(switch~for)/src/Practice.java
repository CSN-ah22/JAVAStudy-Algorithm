public class Practice {
    public static void main(String[] args) {
        int i ;
        int j = 9 ; //1~9단
        int k ; //곱하는값연산자
        for (i = 1; i<=j; i++ ){
            System.out.println(i+"단=============");
            for (k = 1; k<=j; k++){
                System.out.println(i*k);
            }

        }
    }

}
