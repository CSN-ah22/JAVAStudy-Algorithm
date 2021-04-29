package com.study_14;

public class Diagonal {
    public int array_2_D [][];
    int x ;
    int y ;
    int num = 0;
    public Diagonal(int x, int y){
        this.x = x;
        this.y = y;
        array_2_D = new int [x][y];
    }
    public void print(){
        for (int i=0; i<array_2_D.length; i++){
            for (int j=0; j< array_2_D.length; j++){
                if (j+1==y-i){ //j 는 최대 4까지 증가되므로 +1하여 비교 // 줄이 바뀔때마다 한칸씩 들어감
                    num = num+1; //숫자값 부여 0+1 num=1 , 1+1 num=2, 2+1 num=3
                    array_2_D[i][j] = num; //해당하는 줄, 인덱스에 넣음
                }
            }
        }
        //🌟출력문
        for (int k=0; k<x; k++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array_2_D[k][j]);
            }
            System.out.print("\t"+k+"번째 줄 "+((y-1)-k)+"번 인덱스");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Diagonal d_d = new Diagonal(6,6);
        d_d.print();
    }
}
