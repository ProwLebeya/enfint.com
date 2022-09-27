package assignment.questionTwo;

public class Rectangle extends Shapes {

    private Points p1;
    private Points p2;
    private Points p3;
    private Points p4;
 
    public Rectangle(Points p1, Points p2, Points p3, Points p4) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
 
    public Points getP1() {
        return p1;
    }
 
    public void setP1(Points p1) {
        this.p1 = p1;
    }
 
    public Points getP2() {
        return p2;
    }

    public void setP2(Points p2) {
        this.p2 = p2;
    }

    public Points getP3() {
        return p3;
    }
 
    public void setP3(Points p3) {
        this.p3 = p3;
    }
 
 
    public Points getP4() {
        return p4;
    }
 
    public void setP4(Points p4) {
        this.p4 = p4;
    }
 
    @Override
    public double getArea() {
        return (p1.calculateDistance(p2) * p2.calculateDistance(p3));
    }
 
    @Override
     public double getTotalLengh() {
        return 2 * (p1.calculateDistance(p2) + p2.calculateDistance(p3));
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

 }