import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SQUARE  implements IShape {
    
  public SQUARE(){
    System.out.println("This is square");
  }

 

@Override
public void Draw(Graphics g) {
  g.drawRect(50, 50, 80, 80);
}
 

}
