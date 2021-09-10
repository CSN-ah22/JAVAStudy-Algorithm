package com.clock_rotate_snail;

public class Tnail {
    public int m;
    public int n;
    public int loc[][];
    public Tnail(int m,int n){
        this.m = m;
        this.n = n;
        loc=new int [m][n];
    }
    public void make(){
        int x=0;
        int y=0;
        int d=1;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                loc[x][y] = i * n + j + 1;
                if (d==0){ // 오른쪽으로
                    if (y+1<n&&loc[x][y+1]==0){
                        y++;
                    } else {
                        d=3; //오른쪽에서 위로
                        x--;
                    }
                }else if (d==1){ //아래로
                    if (x+1<n&&loc[x+1][y]==0){
                        x++;
                    }else {
                        d=0; //밑에서 오른쪽으로
                        y++;
                    }
                }else if (d==2){//왼쪽으로
                    if (y-1>=0&&loc[x][y-1]==0){
                        y--;
                    }else {
                        d=1; //왼쪽에서 아래로
                        x++;
                    }
                }else if (d==3){
                    if (x-1>=0 && loc[x-1][y]==0){
                        x--;
                    }else {
                        d=2;
                        y--;
                    }
                }
            }
        }
    }
    public void print(){
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
               if (loc[i][j]<10){
                    System.out.print("0"+loc[i][j]+" ");
                }else {
                    System.out.print(loc[i][j]+" ");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Tnail t_t = new Tnail(7,7);
        t_t.make();
        t_t.print();
    }
}
