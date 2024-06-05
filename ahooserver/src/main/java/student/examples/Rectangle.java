package student.examples;

public class Rectangle extends Shape{
    private  byte width;
    private byte height;
    public Rectangle(){}
    public Rectangle(Coordinate coordinate){
        super(coordinate);
    }
    public Rectangle(int x, int y, int width, int height){
        super(new Coordinate(x, y));
        setWidth(width);
        setHeight(height);
    }

    public byte getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = (byte)width;
    }

    public byte getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = (byte)height;
    }
}
