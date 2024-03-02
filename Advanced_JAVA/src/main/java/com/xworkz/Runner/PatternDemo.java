package com.xworkz.Runner;

public class PatternDemo {

    public static void playButton(int n){

        for(int i=1;i<n+n;i++){
            if(i <=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for (int k=i-n;k<n;k++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    public  static  void diamond(int n){
        for (int i=1;i<=n+n;i++){
            if(i<=n){
                for (int j=i;j<=n;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++){
                    System.out.print("*");
                }
                for (int l=1;l<i;l++){
                    System.out.print("*");
                }
            }else {
                for(int j=1;j<=i-n+1;j++){
                    System.out.print(" ");
                }
                for (int k=i-n;k<n;k++){
                    System.out.print("*");
                }
                for (int l=i-n;l<n-1;l++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void index0Diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("-");
            }
            for (int k=i;k<=n;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern(int n) {
        int num = 1;
        int i, j;
        //Outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Inner loop to print spaces
            int spaces1 = 2 * (n - i);
            for (j = 1; j <= spaces1; j++) {
                System.out.print(" ");
            }

            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void butterFly(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            for(int k=0;k<(n-i-1)*2;k++){
                System.out.print("-");
            }

            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("*");
            }

            for(int k=0;k<(i+1)*2;k++){
                System.out.print("-");
            }

            for(int j=i;j<n-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void zPattern(int n){
        int counter = n;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                if( i == 1 || counter == j || i == n){

                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }

            counter--;

            System.out.println();
        }
    }

    public static void aPattarn(int n){

        int mid = (n/2);

        for (int i = 0; i < n; i++) {

//            int negativePoint = mid - i;
//            int positivePoint = mid + i;

            for(int j=1; j<n+n; j++){

                if((i==0 && j == n) || i!=0 && (j == n+i || j == n-i ) || i == mid && (j < n+i && j >n-i)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        playButton(5);
//        diamond(5);
//        index0Diamond(5);
//        butterFly(5);
//        pattern(5);
//        zPattern(5);
        aPattarn(5);
    }


}
