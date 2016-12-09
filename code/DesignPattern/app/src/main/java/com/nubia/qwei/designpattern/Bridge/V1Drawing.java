package com.nubia.qwei.designpattern.Bridge;

/**
 * Author qwei
 * Date 2016-12-9
 * Company NUBIA TECHNOLOGY CO..LTD
 */

public class V1Drawing extends Drawing {
    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        DP1.drawALine(x1, y1, x2, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        DP1.drawACircle(x, y, r);
    }
}
