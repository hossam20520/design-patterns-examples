import java.awt.Graphics;

public class Line  implements IShape{
    


    public Line(){
        System.out.println("this is Line");
    }

  

    @Override
    public void Draw(Graphics g) {
        g.drawLine(50, 50, 130, 130); 
    }


}
