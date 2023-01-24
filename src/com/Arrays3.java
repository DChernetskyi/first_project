package com;

public class Arrays3 {
    public static void main(String[] args){
        int[][] mas = {{2,3,4,0,5},{1,9,8,7,6},{2,2,4,5,9}};
        System.out.println(mas[2][3]);
        for (int i = 0; i< mas.length; i++){
            for (int j=0;j< mas[i].length; j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }


        String[][] x = new String[2][4];


    }
}
