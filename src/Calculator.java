import java.awt.;
import java.awt.event.;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        final TextField num1Field = new TextField();
        num1Field.setBounds(50, 50, 100, 20);

        final TextField num2Field = new TextField();
        num2Field.setBounds(50, 100, 100, 20);

        final TextField resultField = new TextField();
        resultField.setBounds(50, 150, 100, 20);
        resultField.setEditable(false);

        Button addBtn = new Button("+");
        addBtn.setBounds(50, 200, 50, 30);

        Button subtractBtn = new Button("-");
        subtractBtn.setBounds(110, 200, 50, 30);

        Button multiplyBtn = new Button("*");
        multiplyBtn.setBounds(50, 250, 50, 30);

        Button divideBtn = new Button("/");
        divideBtn.setBounds(110, 250, 50, 30);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(String.valueOf(result));
            }
        });

        subtractBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultField.setText(String.valueOf(result));
            }
        });

        multiplyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 * num2;
                resultField.setText(String.valueOf(result));
            }
        });

        divideBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                if (num2 != 0) {
                    double result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } else {
                    resultField.setText("Error: Division by zero");
                }
            }
        });

        f.add(num1Field);
        f.add(num2Field);
        f.add(resultField);
        f.add(addBtn);
        f.add(subtractBtn);
        f.add(multiplyBtn);
        f.add(divideBtn);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}