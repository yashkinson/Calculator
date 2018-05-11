import javax.swing.*;
import java.awt.*;

public class TestGUI {

    private MyJButton btnAdd;
    private MyJButton btnSubstract;
    private MyJButton btnDivide;
    private MyJButton btnMultiply;

    private JLabel labelNumberOne;
    private JLabel labelNumberTwo;
    private JLabel lableResult;

    private MyJTextField jtxtNumberOne;
    private MyJTextField jtxtNumberTwo;
    private MyJTextField jtxtResult;

    private MyJPanel panelTop;
    private MyJPanel panelMid;
    private MyJPanel panelDown;

    private MyJFrame frame;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI testGUI = new TestGUI();

        testGUI.createLabels();

    }

    private void createLabels(){
        labelNumberOne = new JLabel("Число 1");
        labelNumberTwo = new JLabel("Число 2");
        lableResult = new JLabel("Результат");
    }
}
