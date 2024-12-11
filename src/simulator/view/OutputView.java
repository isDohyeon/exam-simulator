package simulator.view;

public class OutputView {

    public void printSubjectInfo(String subjectName, int problemCount) {
        System.out.println("\"" + subjectName + "\"" + " 과목의 모의고사를 시작합니다." + " 총 문제 수 : " + problemCount);
    }

    public void printProblem(int number, String problem) {
        System.out.print
                ("\n" + number + "번 문제 : " + problem);
    }

    public void printInvalidMessage() {
        System.out.println("존재하지 않는 과목명입니다. 다시 입력해주세요\n");
    }

    public void printEndMessage() {
        System.out.println(" \n모의고사가 종료되었습니다.");
    }
}
