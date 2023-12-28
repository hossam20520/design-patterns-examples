import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;


public class ShapeSelectorUI  extends JFrame {
    private JComboBox<String> shapeSelector;
    private JButton drawButton;
    private JTextArea outputArea;


    public ShapeSelectorUI() {
        setTitle("Shape Selector");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components initialization
        String[] shapes = {"Square", "Circle", "Line" , "circle"};
        shapeSelector = new JComboBox<>(shapes);
        drawButton = new JButton("Draw");
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(shapeSelector);
        panel.add(drawButton);
        panel.add(new JScrollPane(outputArea));
        add(panel);

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String selectedShape = (String) shapeSelector.getSelectedItem();
                FactoryShape shapeFactory = new FactoryShape();
                IShape shape = shapeFactory.getShape(selectedShape);

                if (shape != null) {
                    // Clear output area and display the selected shape
                    outputArea.setText("");
                    outputArea.append("Drawing " + selectedShape + "\n");
                    // shape.Draw();
                } else {
                    outputArea.setText("Invalid shape selection");
                }
            }
        });
    }



    
     
}