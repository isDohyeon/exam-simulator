package simulator;

import java.util.Scanner;
import simulator.controller.ExamController;
import simulator.model.ProblemLoader;
import simulator.view.InputView;
import simulator.view.OutputView;

public class ExamSimulator {

    public static void main(String[] args) {
        InputView inputView = new InputView(new Scanner(System.in));
        OutputView outputView = new OutputView();
        ProblemLoader problemLoader = new ProblemLoader();
        new ExamController(inputView, outputView, problemLoader).start();
    }
}
