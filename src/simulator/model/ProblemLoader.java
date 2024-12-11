package simulator.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProblemLoader {

    private static final String FILE_PATH = "src/simulator/model/subject/%s.txt";
    private List<String> problems;

    public List<String> loadProblems(String subjectName) {
        problems = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(String.format(FILE_PATH, subjectName)))) {
            createProblem(reader);
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return problems;
    }

    private void createProblem(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                problems.add(sb.toString());
                sb.setLength(0);
                continue;
            }
            sb.append(line).append("\n");
        }
        problems.add(sb.toString());
    }
}
