package simulator.controller;

import java.util.Collections;
import java.util.List;
import simulator.model.ProblemLoader;
import simulator.view.InputView;
import simulator.view.OutputView;

public class ExamController {

    private final InputView inputView;
    private final OutputView outputView;
    private final ProblemLoader loader;
    private List<String> problems;
    private String subjectName;

    public ExamController(InputView inputView, OutputView outputView, ProblemLoader loader) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.loader = loader;
    }

    public void start() {
        loadProblems();
        outputView.printSubjectInfo(subjectName, problems.size());
        simulateExam();
        outputView.printEndMessage();
    }

    private void simulateExam() {
        Collections.shuffle(problems);
        for (int i = 0; i < problems.size(); i++) {
            outputView.printProblem(i + 1, problems.get(i));
            inputView.readAnswer();
        }
    }

    private void loadProblems() {
        while (true) {
            subjectName = inputView.readSubject();
            problems = loader.loadProblems(subjectName);
            if (problems != null) {
                break;
            }
            outputView.printInvalidMessage();
        }
    }
}
