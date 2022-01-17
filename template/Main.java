package com.kaboomb.template;

import com.kaboomb.template.TemplateUsage;

public class Main {

    public static void main(String[] args) {
        TemplateUsage test = new TemplateUsage(false);
        test.algorithm();

        System.out.println("\n---\n");

        TemplateUsage test1 = new TemplateUsage(true);
        test1.algorithm();
    }
}
