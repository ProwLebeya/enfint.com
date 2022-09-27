package assignment.questionTwo;

public class Points extends Shapes {

    private int a; //x-axis
    private int b; //y-axis
 
    public Points() {
         this(0, 0);
    }
    
    public Points(int a, int b) {
        this.a = a;
        this.b = b;
    }
 
    public Points(Points p) {
         this(p.a, p.b);
    }
 
     public double getX() {
        return a;
     }
 
     public void setX(int x) {
        this.a = x;
    }
 
    public double getY() {
        return b;
    }
 
    public void setY(int y) {
         this.b = y;
     }
 
 
 
    public double calculateDistance(Points p) {
        double x = this.getX() - p.getX();
        double y = this.getY() - p.getY();
        return Math.sqrt(x * x + y * y);
    }
 
    @Override
     public double getArea() {
        return 0;
    }
 
    @Override
     public double getTotalLengh() {
        return 0;
    }
 
    @Override
     public String getType() {
         return "Point";
     }
 }