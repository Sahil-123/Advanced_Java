package com.xworkz.servlet;

class TvDish{
    public void run(){
        System.out.println("run");
        hop();
    }

    public void hop(){
        System.out.println("hop");
    }
}

class TataTvDish extends TvDish{
    public void hop(){
        System.out.println("tata hop");
    }
}
public class Test {
    public static void main(String[] args) {
        TvDish tvDish = new TataTvDish();
        tvDish.run();
    }
}
