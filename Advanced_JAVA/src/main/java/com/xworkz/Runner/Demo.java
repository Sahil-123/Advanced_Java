package com.xworkz.Runner;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

interface A{
    public void m1();
}


class B implements A{
    private int k;
    private int j;

    public B() {
    }

    public B(int k, int j) {
        this.k = k;
        this.j = j;
    }

    public void m1(){
        System.out.println("m1");
    }

    public void m2(){
        System.out.println(k+" "+j);
    }
}

class C extends B{
    private int l;
    private int m;

    public C(){

    }
    public C(int l, int m) {
        this.l = l;
        this.m = m;
    }

    public void m1(){
        System.out.println("m1 at C");
    }

    public void m3(){
        System.out.println("m3");
    }
}

public class Demo {
    public static void main(String[] args) {
        A a1=new C(10,20);
//        a.m2();
        B a = (B)a1;
        Method[] m = a.getClass().getMethods();
        for(Method m1: m){
            System.out.println(m1.getName());
        }

        Field[] fields = a.getClass().getDeclaredFields();

        // Print all fields
        for (Field field : fields) {
            System.out.println(field.getName()+" -field");
        }

        a.m1();
    }
}
