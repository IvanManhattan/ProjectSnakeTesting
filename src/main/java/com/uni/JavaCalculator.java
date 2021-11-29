package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class JavaCalculator implements ActionListener {
    private final JButton[] button = new JButton[50];
    private Operation operation;
    private double output;
    private double input1;
    private double input2;
    private final JTextField outputField = new JTextField(20);
    private final JPanel panel = new JPanel();
    private int notInclude;
    boolean isExtended = false;

    public static void main(String[] arg) {
        new JavaCalculator();
    }

    public JavaCalculator() {



        for (int i = 0; i <= 49; i++) {
            button[i] = new JButton();
        }

        panel.setLayout(new GridLayout(7, 4));

        registerButton(button[13], "C");
        registerButton(button[12], "e");
        registerButton(button[11], "π");
        registerButton(button[14], "÷");

        registerButton(button[7], "7");
        registerButton(button[8], "8");
        registerButton(button[9], "9");
        registerButton(button[15], "×");

        registerButton(button[4], "4");
        registerButton(button[5], "5");
        registerButton(button[6], "6");
        registerButton(button[16], "−");

        registerButton(button[1], "1");
        registerButton(button[2], "2");
        registerButton(button[3], "3");
        registerButton(button[17], "+");

        registerButton(button[18], "%");
        registerButton(button[0], "0");
        registerButton(button[10], ".");
        registerButton(button[19], "=");

        registerButton(button[20], "√");
        registerButton(button[21], "^");
        registerButton(button[34], "^2");
        registerButton(button[35], "^3");

        registerHiddenButton(button[22], "log");
        registerHiddenButton(button[24], "sin°");
        registerHiddenButton(button[25], "cos°");
        registerHiddenButton(button[26], "tg°");
        registerHiddenButton(button[27], "ctg°");
        registerHiddenButton(button[28], "arcsin");
        registerHiddenButton(button[29], "arccos");
        registerHiddenButton(button[30], "arctg");
        registerHiddenButton(button[31], "arcctg");
        registerHiddenButton(button[42], "10^");
        registerHiddenButton(button[36], "lg");
        registerHiddenButton(button[37], "ln");
        registerHiddenButton(button[38], "ch");
        registerHiddenButton(button[39], "sh");
        registerHiddenButton(button[40], "th");
        registerHiddenButton(button[41], "cth");

        registerButton(button[43], "1/x");
        registerButton(button[23], "n!");
        registerButton(button[44], "n!!");

        registerButton(button[32], "Инженер");

        outputField.setFont(outputField.getFont().deriveFont(40f));
        outputField.setHorizontalAlignment(SwingConstants.RIGHT);
        outputField.setEditable(false);
        operation = Operation.NULL;

    }


    public void registerButton(JButton button, String name) {
        button.setFont(button.getFont().deriveFont(20f));
        button.addActionListener(this);
        button.setText(name);
        panel.add(button);
    }


    public void registerHiddenButton(JButton button, String name) {
        button.setFont(button.getFont().deriveFont(20f));
        button.addActionListener(this);
        button.setText(name);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        final JButton jbutton = (JButton) event.getSource();
        selectButton(jbutton);
    }


    public void selectButton(JButton jbutton) {

        if (jbutton == button[23]) {
            oneNumber(Operation.FACTORIAL, button[23]);
        } else if (jbutton == button[44]) {
            oneNumber(Operation.DOUBLEFACT, button[44]);
        } else if (jbutton == button[20]) {
            oneNumber(Operation.SQRT, button[20]);
        } else if (jbutton == button[24]) {
            oneNumber(Operation.SIN, button[24]);
        } else if (jbutton == button[25]) {
            oneNumber(Operation.COS, button[25]);
        } else if (jbutton == button[26]) {
            oneNumber(Operation.TG, button[26]);
        } else if (jbutton == button[27]) {
            oneNumber(Operation.CTG, button[27]);
        } else if (jbutton == button[28]) {
            oneNumber(Operation.ARCSIN, button[28]);
        } else if (jbutton == button[29]) {
            oneNumber(Operation.ARCCOS, button[29]);
        } else if (jbutton == button[30]) {
            oneNumber(Operation.ARCTG, button[30]);
        } else if (jbutton == button[31]) {
            oneNumber(Operation.ARCCTG, button[31]);
        } else if (jbutton == button[34]) {
            oneNumber(Operation.SQARE, button[34]);
        } else if (jbutton == button[35]) {
            oneNumber(Operation.CUBE, button[35]);
        } else if (jbutton == button[36]) {
            oneNumber(Operation.LG, button[36]);
        } else if (jbutton == button[37]) {
            oneNumber(Operation.LN, button[37]);
        } else if (jbutton == button[38]) {
            oneNumber(Operation.CH, button[38]);
        } else if (jbutton == button[39]) {
            oneNumber(Operation.SH, button[39]);
        } else if (jbutton == button[40]) {
            oneNumber(Operation.TH, button[40]);
        } else if (jbutton == button[41]) {
            oneNumber(Operation.CTH, button[41]);
        } else if (jbutton == button[42]) {
            oneNumber(Operation.TEN, button[42]);
        } else if (jbutton == button[43]) {
            oneNumber(Operation.BACK, button[43]);
        } else if (jbutton == button[17]) {
            twoNumbers(Operation.PLUS, button[17]);
        } else if (jbutton == button[16]) {
            twoNumbers(Operation.MINUS, button[16]);
        } else if (jbutton == button[15]) {
            twoNumbers(Operation.MULTIPLE, button[15]);
        } else if (jbutton == button[22]) {
            twoNumbers(Operation.LOGARITHM, button[22]);
        } else if (jbutton == button[21]) {
            twoNumbers(Operation.POWER, button[21]);
        } else if (jbutton == button[14]) {
            twoNumbers(Operation.DIVIDE, button[14]);
        } else if (jbutton == button[18]) {
            twoNumbers(Operation.PERCENT, button[18]);
        }


        else if (jbutton == button[32]) {
            extendedMode();
        }


        else if (jbutton == button[13]) {
            clear();
        }


        else if (jbutton == button[19]) {
            equals();
        }


        else if (jbutton == button[12]) {
            outputField.setText("2.718281828459045");
        }

        else if (jbutton == button[11]) {
            outputField.setText("3.141592653589793");
        }


        else {
            for (int i = 0; i < 11; i++) {
                if (jbutton == button[i]) {
                    String t = outputField.getText();
                    t += button[i].getText();
                    outputField.setText(t);
                }
            }
        }
    }


    public void clear() {
        output = input1 = input2 = 0;
        outputField.setText("");
    }


    public void extendedMode() {
        if (!isExtended) {
            panel.setLayout(new GridLayout(11, 4));
            isExtended = true;
            panel.remove(button[32]);

            panel.add(button[42]);
            panel.add(button[24]);
            panel.add(button[25]);
            panel.add(button[26]);
            panel.add(button[27]);
            panel.add(button[28]);
            panel.add(button[29]);
            panel.add(button[30]);
            panel.add(button[31]);
            panel.add(button[38]);
            panel.add(button[39]);
            panel.add(button[40]);
            panel.add(button[41]);
            panel.add(button[22]);
            panel.add(button[36]);
            panel.add(button[37]);

            panel.add(button[32]);
            button[32].setText("Назад");
        } else {
            panel.setLayout(new GridLayout(7, 4));
            isExtended = false;
            panel.remove(button[32]);

            panel.remove(button[42]);
            panel.remove(button[24]);
            panel.remove(button[25]);
            panel.remove(button[26]);
            panel.remove(button[27]);
            panel.remove(button[28]);
            panel.remove(button[29]);
            panel.remove(button[30]);
            panel.remove(button[31]);
            panel.remove(button[38]);
            panel.remove(button[39]);
            panel.remove(button[40]);
            panel.remove(button[41]);
            panel.remove(button[22]);
            panel.remove(button[36]);
            panel.remove(button[37]);

            panel.add(button[32]);
            button[32].setText("Инженер");
        }
    }


    public void equals() {
        input2 = Double.parseDouble(outputField.getText().substring(notInclude));
        // данные
        calculate();
        final String result = new DecimalFormat("#.###############").format(output);
        outputField.setText(outputField.getText() + "=" + result);
    }


    public void oneNumber(Operation op, JButton button) {
        input1 = Double.parseDouble(outputField.getText());
        operation = op;
        calculate();
        final String result = new DecimalFormat("#.###############").format(output);
        outputField.setText(button.getText() + "(" + outputField.getText() + ")" + "=" + result);
    }


    public void twoNumbers(Operation op, JButton button) {
        notInclude = outputField.getText().length() + button.getText().length();
        input1 = Double.parseDouble(outputField.getText());
        operation = op;
        outputField.setText(outputField.getText() + button.getText());
    }

    public double calculate() {
        switch (operation) {
            case PLUS:
                output = input1 + input2;
                break;
            case MINUS:
                output = input1 - input2;
                break;
            case MULTIPLE:
                output = input1 * input2;
                break;
            case ARCSIN:
                output = Math.asin(input1);
                break;
            case ARCCOS:
                output = Math.acos(input1);
                break;
            case ARCTG:
                output = Math.atan(input1);
                break;
            case ARCCTG:
                output = 1 / Math.atan(input1);
                break;
            case SIN:
                output = Math.sin(Math.toRadians(input1));
                break;
            case COS:
                output = Math.cos(Math.toRadians(input1));
                break;
            case TG:
                output = Math.tan(Math.toRadians(input1));
                break;
            case CTG:
                output = 1 / Math.tan(Math.toRadians(input1));
                break;
            case SQRT:
                output = Math.sqrt(input1);
                break;
            case LOGARITHM:
                output = Math.log10(input1) / Math.log10(input2);
                break;
            case POWER:
                output = Math.pow(input1, input2);
                break;
            case FACTORIAL:
                long result = 1;
                for (long i = 1; i <= input1; i++) {
                    result = result * i;
                }
                output = result;
                break;
            case DIVIDE:
                output = input1 / input2;
                break;
            case PERCENT:
                output = input2 * input1 / 100;
                break;
            case SQARE:
                output = input1 * input1;
                break;
            case CUBE:
                output = Math.pow(input1, 3);
                break;
            case LG:
                output = Math.log10(input1);
                break;
            case LN:
                output = Math.log(input1);
                break;
            case CH:
                output = (Math.pow(2.7183, input1) + Math.pow(2.7183, (-1) * input1)) / 2;
                break;
            case SH:
                output = (Math.pow(2.7183, input1) - Math.pow(2.7183, (-1) * input1)) / 2;
                break;
            case TH:
                output = (Math.pow(2.7183, input1) - Math.pow(2.7183, (-1) * input1)) / (Math.pow(2.7183, input1) + Math.pow(2.7183, (-1) * input1));
                break;
            case CTH:
                output = (Math.pow(2.7183, input1) + Math.pow(2.7183, (-1) * input1)) / (Math.pow(2.7183, input1) - Math.pow(2.7183, (-1) * input1));
                break;
            case TEN:
                output = Math.pow(10, input1);
                break;
            case BACK:
                output = 1 / input1;
                break;
            case DOUBLEFACT:
                long result2 = 1;
                for (Long k = Math.round(input1); k > 0; k = k - 2) {
                    result2 = result2 * k;
                }
                output = result2;
                break;
            case NULL:
                output = input2;
                break;
        }
        return 0;
    }


    public enum Operation {
        NULL, ARCCOS, ARCCTG, ARCSIN, ARCTG, COS, CTG, DIVIDE, FACTORIAL, LOGARITHM, MINUS, MULTIPLE, PERCENT, PLUS, POWER, SIN, SQRT, TG, SQARE, CUBE, LG, LN, CH, SH, TH, CTH, TEN, BACK, DOUBLEFACT;
    }


    public JButton getButton(int i) {
        return button[i];
    }


    public boolean getExtended() {
        return isExtended;
    }


    public double getOutput() {
        return output;
    }
}