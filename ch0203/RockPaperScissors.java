package ch0203;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 선택하세요.");

        while (true) {
            System.out.print("입력: ");
            String userChoice = scanner.nextLine();

            // 컴퓨터의 선택을 랜덤으로 생성
            String computerChoice = generateComputerChoice();

            // 사용자가 "그만"을 입력한 경우 게임 종료
            if (userChoice.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            // 가위바위보 결과 판정
            String result = determineResult(userChoice, computerChoice);

            // 결과 출력
            System.out.println("컴퓨터: " + computerChoice);
            System.out.println("결과: " + result);
            System.out.println();
        }
    }

    // 컴퓨터의 선택을 랜덤으로 생성하는 메서드
    private static String generateComputerChoice() {
        int randomNum = (int) (Math.random() * 3);
        if (randomNum == 0) {
            return "가위";
        } else if (randomNum == 1) {
            return "바위";
        } else {
            return "보";
        }
    }

    // 가위바위보 결과를 판정하는 메서드
    private static String determineResult(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "비겼습니다.";
        } else if (userChoice.equals("가위") && computerChoice.equals("보")
                || userChoice.equals("바위") && computerChoice.equals("가위")
                || userChoice.equals("보") && computerChoice.equals("바위")) {
            return "사용자가 이겼습니다!";
        } else {
            return "컴퓨터가 이겼습니다!";
        }
    }
}