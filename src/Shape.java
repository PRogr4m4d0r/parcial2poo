abstract class Shape {
    private String color = "red";
    private boolean filled = true;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString(){
        return "";
    }

}