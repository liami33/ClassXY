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
    private View button;

    public Square(View v) {
        this.shape = 0;
        this.button = v;
        Button b = (Button) button;
        b.setText("");
    }

    public View getButton() {
        return button;
    }

    public void setShape(int s) {
        shape = s;
        Button b = (Button) button;
        if (shape == 0) b.setText("");
        if (shape == 1) b.setText("X");
        if (shape == 2) b.setText("O");
    }

    public int getShape() {
        return this.shape;
    }
}

