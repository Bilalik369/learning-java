package exercices;

public class LineSegment {
    private Point endPoint1 ;
    private Point endPoint2;


    public LineSegment( Point p1, Point p2) {
        this.endPoint1 = p1;
        this.endPoint2 = p2;


    }
    public double length(){
        return endPoint1.distanceTi(endPoint2);
    }  
    public String toString(){
        return "Segment de "+endPoint1.toString()+ "a" +endPoint2.toString();
    }  

    public void affichare(){
        System.out.println(this.toString());
    }
}
