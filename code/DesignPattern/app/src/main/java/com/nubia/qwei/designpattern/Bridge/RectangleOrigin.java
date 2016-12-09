package com.nubia.qwei.designpattern.Bridge;

/**
 * Author qwei
 * Date 2016-12-8
 * Company NUBIA TECHNOLOGY CO..LTD
 */

abstract public class RectangleOrigin {
    private double mX1;
    private double mX2;
    private double mY1;
    private double mY2;

    public RectangleOrigin(double x1, double y1, double x2, double y2){
        mX1 = x1;
        mY1 = y1;
        mX2 = x2;
        mY2 = y2;
    }
    public void draw(){
        drawLine(mX1, mY1, mX1, mY1);
        drawLine(mX2, mY1, mX1, mY2);
        drawLine(mX2, mY2, mX2, mY2);
        drawLine(mX1, mY2, mX2, mY1);

    }

    abstract  protected  void drawLine(double x1, double y1, double x2, double y2);
}
