package com.kyaw.oo.interfaceDemo;

public interface View {

    default void getSystemInfo() {
        System.out.println("This is KoKyaw's MacbookPro");
    }
}

