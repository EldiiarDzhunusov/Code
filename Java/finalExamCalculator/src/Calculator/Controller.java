package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {
    private String expression = "";
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine = manager.getEngineByName("js");
    private Object result;
    @FXML
    private Text screen;
    @FXML
    private void buttonController(ActionEvent event) throws ScriptException {
        String input = (((Button) event.getSource()).getText());
        if ("1234567890+-*/.".contains(input)) expression += input;
        else if (input.equals("C")) expression = "";
        else {
            result = engine.eval(expression);
            if (input.equals("+/-")) {
                result = Double.parseDouble(result.toString()) * -1;
            }
            else if (input.equals("%")) {
                result = Double.parseDouble(result.toString()) / 100;
            }
            expression = result.toString();
        }
        screen.setText(expression);
    }
}
