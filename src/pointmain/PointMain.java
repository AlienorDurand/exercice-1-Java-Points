package pointmain;

public class PointMain {
  
    public static void main(String[] args) {
        
        // Instanciation
        Point x = new Point(10,2);
        
        // Test
        System.out.println(x.toString());
        System.out.println("Le point x vaut : "+x.getX());
        System.out.println("Le point y vaut : "+x.getY());
        
        x.moveTo(20,4);
        System.out.println(x.toString());
        
        x.rMoveTo(20,4);
        System.out.println(x.toString());
        
        
    }
    
}
