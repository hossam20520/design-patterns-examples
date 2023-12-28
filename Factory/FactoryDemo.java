import javax.swing.SwingUtilities;

public class FactoryDemo{


  public static void main(String[] args) {
    
      SwingUtilities.invokeLater(() -> {
        ShapeDrawerUI shapeUI = new ShapeDrawerUI();
            shapeUI.setVisible(true);
        });

  }

}