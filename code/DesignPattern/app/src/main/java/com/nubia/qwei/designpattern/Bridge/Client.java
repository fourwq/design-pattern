package com.nubia.qwei.designpattern.Bridge;

/**
 * Author qwei
 * Date 2016-12-8
 * Company NUBIA TECHNOLOGY CO..LTD
 */

public class Client {
    static public void main(){
        Shape mMyShape[];
        Factory mMyFactory = new Factory();
        mMyShape = mMyFactory.getShapes();
        for(Shape shape: mMyShape){
            shape.draw();
        }
    }
}
