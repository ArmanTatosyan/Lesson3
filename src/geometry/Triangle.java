package geometry;
import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;
    Triangle(){
        boolean isValid = false;
        Scanner myObj = new Scanner(System.in);
        while(isValid == false){
            System.out.println("Enter size of side a");
            String a = myObj.nextLine();

            this.a = Integer.parseInt(a);
            System.out.println("Enter size of side b");
            String b = myObj.nextLine();

            this.b = Integer.parseInt(b);
            System.out.println("Enter size of side c");
            String c = myObj.nextLine();

            this.c = Integer.parseInt(c);
            if (this.a + this.b > this.c && this.b + this.c > this.a && this.a + this.c > this.b){
                isValid = true;
            } else {
                System.out.println("Try again");
            }

        }

    }
    public double calculateS(){
        return a*c*a/c*0.5;
    }
    public int calculateP(){
        return a +b +c;
    }


    public static void main(String[] args){
        Triangle triangle1 = new Triangle();
        int p = triangle1.calculateP();
        System.out.println(p);
        double s =triangle1.calculateS();
        System.out.println(s);

    }

}
