import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShapeDrawerUI  extends JFrame {
     private JComboBox<String> shapeSelector;
    private JButton drawButton;
    private JPanel drawingPanel;
    private IShape currentShape = null;
    public ShapeDrawerUI() {
        setTitle("Shape Drawer");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components initialization
        String[] shapes = {"Square", "Circle", "Line"};
        shapeSelector = new JComboBox<>(shapes);
        drawButton = new JButton("Draw");
        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (currentShape != null) {
                    currentShape.Draw(g);
                }
            }
        };

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel.add(shapeSelector);
        panel.add(drawButton);

        add(panel, BorderLayout.NORTH);
        add(drawingPanel, BorderLayout.CENTER);

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedShape = (String) shapeSelector.getSelectedItem();
                FactoryShape shapeFactory = new FactoryShape();
                currentShape = shapeFactory.getShape(selectedShape);

                if (currentShape != null) {
                    drawingPanel.repaint();
                }
            }
        });
    }

}
