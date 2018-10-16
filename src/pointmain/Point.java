package pointmain;

public class Point {
    
    // Attributs
    private double x=0;
    private double y=0;
    
    // Constructeur
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Méthodes
    public String toString(){
        return "Le point x vaut : "+x+" et le point y vaut : "+y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void moveTo(double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public void rMoveTo(double a, double b){
        this.x += a;
        this.y += b;
    }
    
    //  Calcul de la distance
    public double distance(Point a){
        return Math.sqrt(Math.pow(a.getX() - x, 2) + Math.pow(a.getY() - y,2));
    }
}
