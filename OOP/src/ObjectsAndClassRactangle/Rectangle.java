package ObjectsAndClassRactangle;

public class Rectangle {
    int length;
    int width;
    void insert(int addrLength, int addrWidth){
        length=addrLength;
        width=addrWidth;
    }
    void calculateArea(){
        System.out.println("Area: "+(width*length));
    }
}
