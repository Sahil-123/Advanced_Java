package org.xworkz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZigZag {


    public static String result(String data, int n){

        int i=0;
        int j=n-1;
        int dataCount = 0;
        int lengthOfString=data.length();
        int rows = (lengthOfString/n)+2;
        Character[][] array= new Character[rows][n];

        while(dataCount < lengthOfString  ){

            if(j==n-1){
                int c = 0;
                for ( c = j; c >=0; c--) {
                    array[i][c] = data.charAt(dataCount++);

                    if(dataCount >= lengthOfString){
                        break;
                    }
                }

                j=c+1;
            }else{
                array[i][j] = data.charAt(dataCount++);
            }

            i++;
            j++;
        }

//        for (int k = 0;k<rows;k++){
//            for (int l=0;l<n;l++){
//                System.out.print(" "+array[k][l]);
//            }
//            System.out.println();
//        }


        String result="";

        for(int col=0;col<n;col++){
            for (int row=0;row<rows;row++){
                if(array[row][col] != null){
                    result+=array[row][col];
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
//        String data = result("EDBAAODNN",4);
        String data = result("PROBLEMSONE",3);

        System.out.println(data);
    }
}
