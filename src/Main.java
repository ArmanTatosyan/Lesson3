import geometry.Rectangle;
import math.ActionsWithNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {boolean isValid = false;
        Scanner myObj = new Scanner(System.in);
        int aInt=0;
        int bInt=0;
        int xInt=0;
        int yInt=0;
        String action = "";

        while(isValid == false) {
            System.out.println("Enter size of side a");
            String a = myObj.nextLine();

            aInt = Integer.parseInt(a);
            System.out.println("Enter size of side b");
            String b = myObj.nextLine();

            bInt = Integer.parseInt(b);

            if (aInt >0 && bInt > 0) {
                isValid = true;
            } else {
                System.out.println("Try again");
            }
        }
        Rectangle rect1 = new Rectangle();
        rect1.setBreadth(bInt);
        rect1.setLength(aInt);
        int s = rect1.calculateS();
        System.out.println("S = " + s);
        int p = rect1.calculateP();
        System.out.println("P = " + p);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter x");
        String x = myObj.nextLine();
        xInt = Integer.parseInt(x);
        System.out.println("Enter y");
        String y = myObj.nextLine();
        yInt = Integer.parseInt(x);
        System.out.println("Enter action");
        action = myObj.nextLine();
        System.out.println(action);
        if(action.equals( "sum")){
            int sum = ActionsWithNumber.sum(xInt,yInt);
           System.out.println(sum);

        } else if (action.equals("dif")) {
            int dif =ActionsWithNumber.dif(xInt, yInt);
            System.out.println(dif);
        } else if (action.equals("prod")) {
            int prod = ActionsWithNumber.prod(xInt,yInt);
            System.out.println(prod);

        }


    }


    }
