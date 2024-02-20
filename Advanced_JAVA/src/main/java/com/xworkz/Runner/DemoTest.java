package com.xworkz.Runner;


class R{
    public void m1() throws MyException {
        throw new MyException();
    }
}
public class DemoTest {
    public static void main(String[] args) throws MyException {
        System.out.println("Main");
        R r=new R();
        r.m1();
    }
}
