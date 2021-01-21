/**TODO:
 *  Finish up implementation of procedural methods
 *  Fix the problem checks
 */
package files;

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

    // Create functions corresponding to onAction occurrences
    public void placeZero(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + "0";
        op1.setText(text);
    }
    public void placeOne(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + "1";
        op1.setText(text);
    }
    public void placeTwo(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + "2";
        op1.setText(text);
    }
    public void placeThree(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + "3";
        op1.setText(text);
    }
    public void placeFour(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + "4";
        op1.setText(text);
    }
    public void placeFive(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + "5";
        op1.setText(text);
    }
    public void placePoint(ActionEvent actionEvent) {
        String text = op1.getText();
        text = text + ".";
        op1.setText(text);
    }

    public void sum(ActionEvent actionEvent) {
        double a = Double.parseDouble(op1.getText());
        double b = Double.parseDouble(op2.getText());
        result = String.valueOf(a + b);
    }

    public void quoti(ActionEvent actionEvent) {
        double a = Double.parseDouble(op1.getText());
        double b = Double.parseDouble(op2.getText());
        if (b != 0)
            result = String.valueOf(a / b);
        else
            op1.setText("0");
            op2.setText("0");
            res.setText("Error: Division by zero");
    }

    public void root(ActionEvent actionEvent) {
        if (op2.getText() == "0")
            result = String.valueOf(sqrt(Double.parseDouble(op1.getText())));
        else
            op1.setText("0");
            op2.setText("0");
            res.setText("Error: Only 1 operand needed");
    }

    public void clearDisplay(ActionEvent actionEvent) {
        op1.setText("0");
        op2.setText("0");
        res.setText("0");
    }

    public void displayResults(ActionEvent actionEvent) {
        op1.setText("0");
        op2.setText("0");
        res.setText(result);
    }
}
