package Assignment2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import static java.lang.Math.sqrt;

/**
 * Controls and provides the actual functions of the calculator app described by menu.fxml
 * Main.java is used to start up the fxml file and view/use the basic calculator GUI app
 * GUI app implemented using JavaFX
 *
 * @author Ian McNulty
 * @see javafx.event.ActionEvent
 * @see javafx.scene.control
 */
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

    /**
     * Places a zero in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
    public void placeZero(ActionEvent actionEvent) {
        if (op1.getText().isEmpty())
            field = 1;
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

    /**
     * Places a one in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
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

    /**
     * Places a two in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
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

    /**
     * Places a three in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
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

    /**
     * Places a four in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
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

    /**
     * Places a five in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
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

    /**
     * Places a point in the current operand text field
     *
     * @param actionEvent Performs the function on click
     */
    public void placePoint(ActionEvent actionEvent) {
        boolean test;
        if (field == 1)
            test = op1.getText().isEmpty();
        else
            test = op2.getText().isEmpty();

        if (!test) {
            if (op1.getText().isEmpty())
                field = 1;
            String text = " ";

            if (field == 1) {
                text = op1.getText();
                text = text + ".";
                op1.setText(text);
            } else if (field == 2) {
                text = op2.getText();
                text = text + ".";
                op2.setText(text);
            } else
                res.setText("Please select result");
        } else {
            res.setText("Must place number before point");
        }
    }

    /**
     * Sets the operation to addition and swaps the commands to fill the second operand box
     * Checks if the operands are empty
     *
     * @param actionEvent Performs the function on click
     */
    public void sum(ActionEvent actionEvent) {
        if (!op1.getText().isEmpty()) {
            field = 2;
            operation = 1;
        } else {
            res.setText("Please enter values in the Operands");
        }
    }

    /**
     * Sets the operation to division and swaps the commands to fill the second operand box
     * Checks if the operands are empty
     *
     * @param actionEvent Performs the function on click
     */
    public void quoti(ActionEvent actionEvent) {
        if (!op1.getText().isEmpty()) {
            field = 2;
            operation = 2;
        } else {
            res.setText("Please enter values in the Operands");
        }
    }

    /**
     * Sets the operation to sqrt
     * Checks if the operands are empty
     *
     * @param actionEvent Performs the function on click
     */
    public void root(ActionEvent actionEvent) {
        if (!op1.getText().isEmpty()) {
            field = 2;
            operation = 3;
        } else {
            res.setText("Please enter values in the Operands");
        }
    }

    /**
     * Clears the display and resets the operand field switch
     *
     * @param actionEvent
     */
    public void clearDisplay(ActionEvent actionEvent) {
        field = 1;
        op1.setText("");
        op2.setText("");
        res.setText("");
    }

    /**
     * Computes the value of the computations according to the operands and operation indicated
     * Checks for invalid inputs such as numbers ending in points, zero division, and 2 operand sqrt computations
     * Resets operands and operation
     *
     * @param actionEvent Performs the function on click
     * @see java.lang.Math Uses the sqrt function from this library
     */
    public void displayResults(ActionEvent actionEvent) {
        double a;
        double b;

        String str1 = op1.getText();
        String str2 = op2.getText();
        int len1 = str1.length();
        int len2 = str2.length();

        if (str1.charAt(len1-1) != '.' && str2.charAt(len2-1) != '.') {
            switch (operation) {
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
                    } else {
                        res.setText("Error: Only 1 operand needed");
                    }
                    break;
            }
        } else {
            res.setText("Error: Invalid numbers entered");
        }

        operation = 0;
        op1.setText("");
        op2.setText("");
        field = 1;
    }
}
