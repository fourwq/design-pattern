package com.nubia.qwei.designpattern.Bridge;

/**
 * Author qwei
 * Date 2016-12-8
 * Company NUBIA TECHNOLOGY CO..LTD
 */

abstract public class Shape {
    protected Drawing mMyDrawing;
    abstract  public void draw();
    Shape(Drawing drawing){
        mMyDrawing = drawing;
    }
    protected  void drawLine(double x1, double y1, double x2, double y2){
        mMyDrawing.drawLine(x1, y1, x2, y2);
    }
    protected  void drawCircle(double x, double y, double r){
        mMyDrawing.drawCircle(x,y,r);
    }
}
