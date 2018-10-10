package pointmain;

public class PointMain {
  
    public static void main(String[] args) {
        
        // Instanciation
        Point x = new Point(10,2);
        Point y = new Point(70,40);
        
        // Test
        System.out.println(x.toString());
        System.out.println("Le point x vaut : "+x.getX());
        System.out.println("Le point y vaut : "+x.getY());
        
        // Donner des coordonnées
        x.moveTo(20,4);
        System.out.println(x.toString());
        
        // Ajouter des coordonnés
        x.rMoveTo(20,4);
        System.out.println(x.toString());
        
        // Calculer la distance entre 2 points
        System.out.println("La distance entre ces deux points vaut : "+x.distance(y));
        
        
    }
    
}
