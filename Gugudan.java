

public class Gugudan {
    //            ↓반환   ←입력값(매개체)으로 계산을 하고
//                ↓반환형 ↓메서드이름
    public static  int[] calculate(int times){
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }

        return  result;
    }
    public static  void print(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        int[] beyarv = new int[10];
        for(int i=2; i<beyarv.length; i++){
            int[] result = calculate(i);
            print(result);
        }


        //****** 중첩 if문 혼자 힘으로 성공! ********
       /* for(int c = 0; c < 1; c++) {

            int[] times3 = new int[9];
            for (int j = 0; j < times3.length; j++) {
                times3[j] = 3 * (j + 1);

                System.out.println(times3[j]);
            }


            int[] times4 = new int[9];
            for (int j = 0; j < times4.length; j++) {
                times4[j] = 4 * (j * 1);


                System.out.println(times4[j]);
                   }
        }*/







    }
}
