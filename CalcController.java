/**TODO:
 *  Finish up implementation of procedural methods
 *  Fix the problem checks
 */
package Assignment2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import static java.lang.Math.sqrt;

public class CalcController {
    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button point;
    public Button plus;
    public Button divide;
    public Button squareroot;
    public Button clear;
    public Button results;
    public Label op1;
    public Label op2;
    public Label res;

    public String result;
    public int field;
    public int operation;

    // Create functions corresponding to onAction occurrences
    public void placeZero(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
         /**else if (op1.getText().length() > 2)
            field = 2;**/

        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + "0";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + "0";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }
    public void placeOne(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + "1";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + "1";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }
    public void placeTwo(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + "2";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + "2";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }
    public void placeThree(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + "3";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + "3";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }
    public void placeFour(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + "4";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + "4";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }
    public void placeFive(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + "5";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + "5";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }
    public void placePoint(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
        String text = " ";

        if (field == 1) {
            text = op1.getText();
            text = text + ".";
            op1.setText(text);
        }
        else if (field == 2) {
            text = op2.getText();
            text = text + ".";
            op2.setText(text);
        }
        else
            res.setText("Please select result");
    }

    public void sum(ActionEvent actionEvent) {
        field = 2;
        operation = 1;
    }

    public void quoti(ActionEvent actionEvent) {
        field = 2;
        operation = 2;
    }

    public void root(ActionEvent actionEvent) {
        field = 2;
        operation = 3;
    }

    public void clearDisplay(ActionEvent actionEvent) {
        field = 1;
        op1.setText("");
        op2.setText("");
        res.setText("");
    }

    public void displayResults(ActionEvent actionEvent) {
        double a;
        double b;
        switch(operation){
            case 1:
                a = Double.parseDouble(op1.getText());
                b = Double.parseDouble(op2.getText());
                result = String.valueOf(a + b);
                res.setText(result);
                break;
            case 2:
                a = Double.parseDouble(op1.getText());
                b = Double.parseDouble(op2.getText());
                if (b == 0.0) {
                    res.setText("Error: Division by zero");
                } else {
                    result = String.valueOf(a / b);
                    res.setText(result);
                }
                break;
            case 3:
                if (op2.getText().isEmpty()) {
                    result = String.valueOf(sqrt(Double.parseDouble(op1.getText())));
                    res.setText(result);
                }
                else {
                    res.setText("Error: Only 1 operand needed");
                }
                break;
        }

        operation = 0;
        op1.setText("");
        op2.setText("");
        field = 1;
    }
}
