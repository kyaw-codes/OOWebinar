package com.kyaw.oo.interfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laptop {

    private List<Button> buttons = new ArrayList<>();

    public void addButtons(Button... buttons) {
        this.buttons.addAll(Arrays.asList(buttons));
    }

    public List<Button> getAllButtons() {
        return new ArrayList<>(buttons);
    }

    public void drawOnScreen(View view) {
        // do presentation stuffs
    }

}

