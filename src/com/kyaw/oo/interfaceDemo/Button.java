package com.kyaw.oo.interfaceDemo;

public interface Button extends View, Animation {

    void onClick();

    void onMouseOver();

    void onMouseOut();

    void draw(double x, double y);

}

