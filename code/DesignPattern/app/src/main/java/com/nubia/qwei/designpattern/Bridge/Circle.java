package com.nubia.qwei.designpattern.Bridge;

import static android.R.attr.x;

/**
 * Author qwei
 * Date 2016-12-9
 * Company NUBIA TECHNOLOGY CO..LTD
 */

public class Circle extends Shape {
    private double mX;
    private double mY;
    private double mR;

    Circle(Drawing drawing, double x, double y, double r) {
        super(drawing);
        mX = x;
        mY = y;
        mR = r;
    }


    @Override
    public void draw() {
        mMyDrawing.drawCircle(mX , mY, mR);
    }
}
