package com.kaboomb.templatev2;

public abstract class Template {

    public final void execute() {
        method1();
        method2();

        if(needsMethod3()) {
            method3();
        }
    }

    public void method1(){
        System.out.println("Method1");
    }

    public void method2() {
        System.out.println("Method2");
    }

    public void method3() {
        System.out.println("Method3");
    }

    // hook
    abstract boolean needsMethod3();
}
