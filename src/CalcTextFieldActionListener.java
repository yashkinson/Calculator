import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFieldActionListener implements FocusListener{

    private MyJTextField field;

    public CalcTextFieldActionListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(TestGUI.INPUT_CHISLO)){
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(field.getText().trim().isEmpty()){
            field.setText(TestGUI.INPUT_CHISLO);
            field.setForeground(Color.GRAY);
        }
    }
}
