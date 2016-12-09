package com.nubia.qwei.designpattern.Bridge;

/**
 * Author qwei
 * Date 2016-12-9
 * Company NUBIA TECHNOLOGY CO..LTD
 */

public class Rectangles extends  Shape {
    private  double mX1;
    private  double mY1;
    private  double mX2;
    private  double mY2;

    Rectangles(Drawing drawing, double x1, double y1, double x2, double y2) {
        super(drawing);
        mX1 = x1;
        mY1 = y1;
        mX2 = x2;
        mY2 = y2;
    }


    @Override
    public void draw() {
        drawLine(mX1, mY1, mX1, mY1);
        drawLine(mX2, mY1, mX1, mY2);
        drawLine(mX2, mY2, mX2, mY2);
        drawLine(mX1, mY2, mX2, mY1);
    }

    @Override
    protected  void drawLine(double x1, double y1, double x2, double y2){
        mMyDrawing.drawLine(x1, y1, x2, y2);
    }

}
