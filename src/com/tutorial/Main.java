package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array2d = {
                {2,4,6},
                {1,3,5,7,9,11,13},
                {0},
                {1,2,3,4,5,6,7,8,9,10}
        };

        for (int i = 0; i < array2d.length; i++){
            for (int j = 0; j < array2d[i].length; j++){
                System.out.print(array2d[i][j]);
            }
            System.out.println("");
        }
    }
}
