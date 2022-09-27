package assignment.questionTwo;

public class Line extends Shapes {

    private Points point1;
    private Points point2;

    public Line(Points p1, Points p2) {
        super();
        this.point1 = p1;
        this.point2 = p2;
    }
 
    public Points getP1() {
        return point1;
    }

    public void setP1(Points p1) {
        this.point1 = p1;
    }
 
    public Points getP2() {
        return point2;
    }
 
    public void setP2(Points p2) {
        this.point2 = p2;
    }
 
    @Override
     public double getArea() {
        return 0;
    }
 
    @Override
    public double getTotalLengh() {
        return point1.calculateDistance(point2);
    }
 
    @Override
    public String getType() {
        return "Line";
    }

 }