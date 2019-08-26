package OOP.Package2;

import OOP.Package1.Shape;

public class Circle extends Shape implements Comparable<Circle> {
    private int radius;
    private int coordinate_x;
    private int coordinate_y;

    public void setRadius(int i){
        this.radius = i;
    }

    public Circle(int radius, int coordinate_x, int coordinate_y){
        this.radius = radius;
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
    }

//    @Override
//    public void draw() {
//        System.out.println("Private fields of Circle: \n-radius = " + radius+"\n" + "-coordinate_x = " + coordinate_x+"\n" + "-coordinate_y = " + coordinate_y);
//    }

    @Override
    public String toString() {
        return super.toString();
//        String a = "Private fields of Circle: \n-radius = " + radius+"\n" + "-coordinate_x = " + coordinate_x+"\n" + "-coordinate_y = " + coordinate_y;
//        return a;
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if(!(obj instanceof Circle)){
            return false;
        }
        if(radius == ((Circle) obj).radius){
            return true;
        } else
        return false;

    }
    public void seeThis(){
        System.out.println(this);
    }

    @Override
    public int compareTo(Circle o) {
        if (!(o instanceof Circle)){
            o = (Circle)o;
            //return radius - o.radius;
        }
        return radius - o.radius;
    }
}
