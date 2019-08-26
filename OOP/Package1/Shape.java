package OOP.Package1;

public class Shape {
    private int border_size;
    private String colour;

    //<Constructor>

    public void setBorder_size(int i){
        this.border_size = i;
    }

    public int getBorder_size(){
        return border_size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void draw(){
        System.out.println("Private fields: border_size "+ border_size +", colour "+ colour);
    }


}
