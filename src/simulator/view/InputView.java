package simulator.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public String readSubject() {
        System.out.print("과목명을 입력하세요 : ");
        return sc.nextLine();
    }

    public void readAnswer() {
        System.out.print("답 : ");
        sc.nextLine();
    }
}
