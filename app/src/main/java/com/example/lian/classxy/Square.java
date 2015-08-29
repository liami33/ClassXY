package com.example.lian.classxy;

import android.view.*;
import android.widget.Button;

/**
 * Created by Lian on 23/08/2015.
 */
public class Square {
    // shape represents the square's content:
    // 0 = empty
    // 1 = X
    // 2 = O
    private int shape;
    // "button" field holds a reference to the matching button in the UI
    private Button button;

    public Square(View v) {
        this.shape = 0;
        this.button = (Button) v;
        // button IS-A view, but view ISN'T a button !!!!!!
        button.setText("");
    }


    public View getButton() {
        return button;
    }

    public void setShape(int s) {
        shape = s;
        if (shape == 0) button.setText("");
        if (shape == 1) button.setText("X");
        if (shape == 2) button.setText("O");
    }

    public int getShape() {
        return this.shape;
    }
}

