import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private MyJTextField jtxtNumberOne;
    private MyJTextField jtxtNumberTwo;
    private MyJTextField jtxtResult;

    public CalcButtonActionListener(MyJTextField jtxtNumberOne, MyJTextField jtxtNumberTwo, MyJTextField jtxtResult) {
        this.jtxtNumberOne = jtxtNumberOne;
        this.jtxtNumberTwo = jtxtNumberTwo;
        this.jtxtResult = jtxtResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!(e.getSource() instanceof JButton)) {
            return;
        }
        JButton button = (JButton) e.getSource();

        final double a = Double.parseDouble(jtxtNumberOne.getText());
        final double b = Double.parseDouble(jtxtNumberTwo.getText());

        switch (button.getText()){
            case "Сложение":
                jtxtResult.setText(String.valueOf(CalcOperations.add(a, b)));
                break;
            case "Вычитание":
                jtxtResult.setText(String.valueOf(CalcOperations.substract(a, b)));
                break;
            case "Умножение":
                jtxtResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
                break;
            case "Деление":
                jtxtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
                break;
                default:
                    throw new RuntimeException("неизвестная кнопка");
        }

    }
}
