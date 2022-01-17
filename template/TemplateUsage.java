package com.kaboomb.template;

public class TemplateUsage extends Template {
    public TemplateUsage(boolean useHook) {
        super(useHook);
    }

    @Override
    public void method1() {
       System.out.println("Overrided method1");
    }
}
