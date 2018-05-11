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
        testGUI.createTextFields();
        testGUI.createButtons();

    }

    private void createLabels(){
        labelNumberOne = new JLabel("Число 1");
        labelNumberTwo = new JLabel("Число 2");
        lableResult = new JLabel("Результат");
    }

    private void createTextFields(){
        jtxtNumberOne = new MyJTextField(10);
        jtxtNumberTwo = new MyJTextField(10);
        jtxtResult = new MyJTextField(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);
    }

    private void createButtons(){
        btnAdd = new MyJButton("Сложение");
        btnSubstract = new MyJButton("Вычитание");
        btnDivide = new MyJButton("Деление");
        btnMultiply = new MyJButton("Умножение");
    }
}
