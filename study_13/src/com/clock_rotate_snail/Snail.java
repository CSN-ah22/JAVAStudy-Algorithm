package com.clock_rotate_snail;

public class Snail {
    public int m;
    public int n;
    public int loc[][];

    public Snail(int m, int n) {
        this.m = m;
        this.n = n;
        loc = new int[m][n];//행과 열의 개수로 생성함
    }

    public void make() {
        int x = 0; //[x][]
        int y = 0; //[][y]
        int d = 0; //방향

        for (int i = 0; i < m; i++) { //ex) 7*7이라면 6번째 줄까지 반복문 실행, m과 n이 바뀌어도 상관없다
            for (int j = 0; j < n; j++) { // ex) 7*7이라면 인덱스 6번까지 실행,
                loc[x][y] = i * n + j + 1; //해당 인덱스에 순서대로 값 넣기 ex) (0x7)+0+1=1 (0x7)+1+1=2 (1x7)+0+1=8

                if (d == 0) { //오른쪽으로 이동
                    if (y + 1 < n && loc[x][y + 1] == 0) { // 열의 끝이 아니고 앞의 숫자가 0인 경우
                        y++; //열 증가
                    } else { //오른쪽 벽이나 숫자
                        d = 1; //아래로
                        x++; //아랫줄로
                    }

                } else if (d == 1) {
                    if (x + 1 < n && loc[x + 1][y] == 0) { //행의 끝이 아니고 앞의 숫자가 0일 경우
                        x++; //행 증가
                    } else { //아래 벽이나 숫자
                        d = 2; //왼쪽으로
                        y--; // 왼쪽인덱스로
                    }
                } else if (d == 2) {
                    if (y - 1 >= 0 && loc[x][y - 1] == 0) { //열의 0번째 까지 , 왼쪽에 숫자가 0일 경우에만
                        y--;
                    } else { // 왼쪽 벽이나 숫자
                        d = 3; //위로
                        x--; // 위쪽줄로
                    }
                } else if (d == 3) {
                    if (x - 1 >= 0 && loc[x - 1][y] == 0) { // 행의 0번째 까지, 위에 숫자가 0일 경우에만
                        x--;//위로 이동
                    } else { //위쪽 벽이나 숫자
                        d = 0; //오른쪽으로
                        y++; //오른쪽 인덱스로
                    }
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              /*  System.out.printf("(%2d:[%d,%d])", loc[i][j], i, j);
                System.out.printf("(%2d)", loc[i][j]);*/

                if (loc[i][j] < 10) {
                    System.out.print("0" + loc[i][j] + " ");
                } else {
                    System.out.print(loc[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Snail snail = new Snail(7, 7);
        snail.make();
        snail.print();
    }
}
