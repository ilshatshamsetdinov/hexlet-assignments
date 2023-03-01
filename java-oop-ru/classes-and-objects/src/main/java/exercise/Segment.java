package exercise;

// BEGIN
public class Segment {
    private Point BeginPoint;
    private Point EndPoint;

    public Segment(Point point1, Point point2) {
        this.BeginPoint = point1;
        this.EndPoint = point2;
    }
    public Point getMidPoint() {
        var MidPointX = (EndPoint.getX() - BeginPoint.getX()) / 2;
        var MidPointY = (EndPoint.getY() - BeginPoint.getY()) / 2;
        return new Point(MidPointX, MidPointY);
    }
}
// END
