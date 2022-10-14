package com.driver;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.meth());

        B b = new B();
        System.out.println(b.meth());
    }

    public static class A{

        public String meth() {
            String s = "Invoking method from class A";
            return s;
        }
    }

    public static class B extends A{

        @Override
        public String meth(){
            String s = "Method is overridden in Extendend class B";
            return s;
        }
    }
}