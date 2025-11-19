package ch06.조별과제;

import java.util.Scanner;

public class BankApplication {
   private static Account[] accounts = new Account[100];
    private static int accountNum = 0;
    private static Scanner scanner = new Scanner(System.in);
    
   public static void main(String[] args) {
      boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    savemoney();
                    break;
                case "4":
                    outmoney();
                    break;
                case "5":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
        scanner.close();
    }

    // 계좌 생성 메서드
    private static void createAccount() {
        System.out.println("계좌생성");
        System.out.print("계좌번호: ");
        String number = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        accounts[accountNum++] = new Account(number, owner, money);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    // 계좌 목록 출력
    private static void accountList() {
        System.out.println("계좌목록");
        for (int i = 0; i < accountNum; i++) {
            Account acc = accounts[i];
            System.out.printf("%s %s %d%n", acc.getNumber(), acc.getOwner(), acc.getMoney());
        }
    }

    // 예금 기능
    private static void savemoney() {
        System.out.println("예금");
        System.out.print("계좌번호: ");
        String number = scanner.nextLine();
        Account acc = findAccount(number);

        if (acc == null) {
            System.out.println("결과: 해당 계좌가 없습니다.");
            return;
        }

        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());
        if (money > 0) {
            acc.setMoney(acc.getMoney() + money);
            System.out.println("결과: 예금이 성공되었습니다.");
        } else {
            System.out.println("예금액은 0보다 커야 합니다.");
        }
    }

    // 출금 기능
    private static void outmoney() {
        System.out.println("출금");
        System.out.print("계좌번호: ");
        String number = scanner.nextLine();
        Account acc = findAccount(number);

        if (acc == null) {
            System.out.println("결과: 해당 계좌가 없습니다.");
            return;
        }

        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());
        if (money > 0 && acc.getMoney() >= money) {
            acc.setMoney(acc.getMoney() - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        } else {
            System.out.println("잔액이 부족하거나 출금액이 올바르지 않습니다.");
        }
    }

    // 계좌번호로 계좌 찾기
    private static Account findAccount(String number) {
        for (int i = 0; i < accountNum; i++) {
            if (accounts[i].getNumber().equals(number)) {
                return accounts[i];
            }
        }
        return null;
   }

}
