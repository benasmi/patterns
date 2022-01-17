package com.kaboomb.template;

public class Template {

    private final boolean useHook;

    public Template(boolean useHook) {
        this.useHook = useHook;
    }

    public void hook() {
        System.out.println("Hook");
    }

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public final void algorithm() {
        method1();
        if (useHook) {
            hook();

        }
        method2();
    }
}
