import javax.swing.*;

public class MyJButton extends JButton {
    public MyJButton(String title){
        super(title);
    }

    public MyJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }
}
