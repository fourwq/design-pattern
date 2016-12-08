package com.nubia.qwei.designpattern.internationalCommerce;

/**
 * Author qwei
 * Date 2016-12-7
 * Company NUBIA TECHNOLOGY CO..LTD
 */

public class SalesOrder {

    private static final int CANAD = 1;
    private static final int USA = 2;


    public int calcTax(int myNation){
        switch(myNation){
            case USA:
                //US tax rule
                break;
            case CANAD:
                //Canada tax rule
                break;
        }
        return 0;
    }


    public int calcCurrency(int myNation){
        switch(myNation){
            case USA:
                //US Currency rule
                break;
            case CANAD:
                //Canada Currency rule
                break;
        }
        return 0;
    }

    public int getDate(int myNation){
            switch(myNation){
            case USA:
                //US mm/dd/yy
                break;
            case CANAD:
                //Canada dd/mm/yy
                break;
        }
        return 0;
    }


    public int getLanguage(int myNation){
        boolean inQuebec=false;
        switch(myNation){
            case USA:
                // use english
                break;
            case CANAD:
                if(inQuebec){
                    //use french
                }else{
                    //use english
                }
                break;
        }
        return 0;
    }


}
