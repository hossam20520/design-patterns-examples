import java.awt.Graphics;

public class Circle  implements IShape {


   public Circle(){
    System.out.println("This is  circle");
   }
 
    @Override
    public void Draw(Graphics g) {
        g.drawOval(50, 50, 80, 80);
    }
    
}
