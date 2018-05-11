import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public MyJFrame(String title, int width, int height){
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setVisible(true);
    }

    public MyJFrame(String title, int width, int height, Component component){
        this(title, width, height);
        super.getContentPane().add(component);
    }
    public MyJFrame(String title, int width, int height, LayoutManager layoutManager){
        this(title, width, height);
        super.setLayout(layoutManager);
    }
}
