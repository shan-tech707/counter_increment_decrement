
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Counter extends JFrame {
    JFrame f1 = new JFrame();
    JLabel lblCount,lblStep;
    JTextField txtCount;
    JRadioButton rbtnUp,rbtnDown;
    JButton btnCount;
    int count=0;
    Counter(){
        f1.setTitle("Counter Application");
        lblCount=new JLabel("Counter");
        txtCount=new JTextField(5);
        txtCount.setText(""+count);
        rbtnUp=new JRadioButton("Up",true);
        rbtnDown=new JRadioButton("Down");
        ButtonGroup btnGroup=new ButtonGroup();
        btnGroup.add(rbtnUp);
        btnGroup.add(rbtnDown);
        lblStep=new JLabel("Step:");
        String[] values={"1","2","3","4"};
        JComboBox<String> comboBoxStep=new JComboBox<>(values);
        btnCount=new JButton("Count");
        FlowLayout layOut1=new FlowLayout();
        f1.setLayout(layOut1);
        f1.add(lblCount);
        f1.add(txtCount);
        f1.add(rbtnUp);
        f1.add(rbtnDown);
        f1.add(lblStep);
        f1.add(comboBoxStep);
        f1.add(btnCount);
        //f1.setSize(500,80);
        f1.pack();
        f1.setVisible(true);
        btnCount.addActionListener(e -> {
            int num,count;
            count=Integer.parseInt(txtCount.getText());
            num=Integer.parseInt((String) Objects.requireNonNull(comboBoxStep.getSelectedItem()));
            if(rbtnDown.isSelected()){
                count-=num;
            }
            else {
                count+=num;
            }
            txtCount.setText(""+count);

            //num = comboBoxStep.getSelectedIndex();
           /* if(rbtnDown.isSelected()){
                switch (num) {
                    case 0:
                        count--;
                        txtCount.setText("" + count);
                        break;
                    case 1:
                        count -= 2;
                        txtCount.setText("" + count);
                        break;
                    case 2:
                        count -= 3;
                        txtCount.setText("" + count);
                        break;
                    case 3:
                        count -= 4;
                        txtCount.setText("" + count);
                        break;
                }
            }
            else {
                switch (num) {
                    case 0:
                        count++;
                        txtCount.setText(""+count);
                        break;
                    case 1:
                        count+=2;
                        txtCount.setText(""+count);
                        break;
                    case 2:
                        count+=3;
                        txtCount.setText(""+count);
                        break;
                    case 3:
                        count+=4;
                        txtCount.setText(""+count);
                        break;
                }
            }*/

        });
    }

    public static void main(String[] args) {
        new Counter();
    }
}
