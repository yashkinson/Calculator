import javax.swing.*;
import java.awt.*;

public class TestGUI {

    public static final String INPUT_CHISLO = "Введите число";

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
        testGUI.createPanels();
        testGUI.createFrame();

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

        addButtonListener();
    }

    private void createPanels(){
        panelTop = new MyJPanel("panel1", 100, 100);
        panelTop.setPreferredSize(new Dimension(200, 50));
        panelTop.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelMid = new MyJPanel("panel2", 100, 100);
        panelMid.setPreferredSize(new Dimension(200, 50));
        panelMid.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelDown = new MyJPanel("panel3", 100, 100);
        panelDown.setPreferredSize(new Dimension(200, 50));
        panelDown.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelTop.add(labelNumberOne);
        panelTop.add(jtxtNumberOne);
        panelTop.add(labelNumberTwo);
        panelTop.add(jtxtNumberTwo);

        panelMid.add(btnAdd);
        panelMid.add(btnSubstract);
        panelMid.add(btnMultiply);
        panelMid.add(btnDivide);

        panelDown.add(lableResult);
        panelDown.add(jtxtResult);
    }

    private void createFrame(){
        frame = new MyJFrame("Calculator", 430, 200, new BorderLayout(2,2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panelTop, BorderLayout.NORTH);
        frame.getContentPane().add(panelMid, BorderLayout.CENTER);
        frame.getContentPane().add(panelDown, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void addButtonListener(){
        CalcButtonActionListener butLis = new CalcButtonActionListener(jtxtNumberOne, jtxtNumberTwo, jtxtResult);

        btnAdd.addActionListener(butLis);
        btnDivide.addActionListener(butLis);
        btnMultiply.addActionListener(butLis);
        btnSubstract.addActionListener(butLis);
    }

}
