package student.examples;

public class Window implements HasCoordinate{
    private Coordinate coordinate;
    public Window(int x, int y){
        this.coordinate = new Coordinate(x, y);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Window{" +
                "coordinate=" + coordinate +
                '}';
    }
}
