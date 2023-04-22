package geometry;

public class Rectangle {
    private int a;
    private int b;

    public void setLength(int length){
        if( length > 0) {
            this.b = length;
        }
    }
    public void setBreadth(int breadth){
        if (breadth > 0) {
            this.a = breadth;
        }
    }
    public int getLength(){
       return this.b;
    }
    public int getBreadth(){
       return this.a;
    }
    public int calculateP(){
        return getLength()*2 + getBreadth()*2;
    }
    public int calculateS(){
        return getBreadth()*getLength();
    }

}
