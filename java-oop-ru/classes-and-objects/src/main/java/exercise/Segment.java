package exercise;

// BEGIN
public class Segment {
    private Point BeginPoint;
    private Point EndPoint;

    public Point getBeginPoint() {
        return BeginPoint;
    }

    public Point getEndPoint() {
        return EndPoint;
    }

    public Segment(Point point1, Point point2) {
        this.BeginPoint = point1;
        this.EndPoint = point2;
    }
    public Point getMidPoint() {
        var MidPointX = (BeginPoint.getX() + EndPoint.getX()) / 2;
        var MidPointY = (BeginPoint.getY() + EndPoint.getY()) / 2;
        return new Point(MidPointX, MidPointY);
    }
}
// END
