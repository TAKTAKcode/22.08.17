package com.tak.word.select;

import com.tak.word.make.All;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Notice notice = new Notice();
        All all = new All();

        int num;

        do {
            System.out.println("***단어 빨리 치기 게임***");
            System.out.println("----------------------");
            System.out.println("1. 게임 설명");
            System.out.println("2. 한글 단어 시작");
            System.out.println("3. 영어 단어 시작");
            System.out.println("9. 게임 종료");
            System.out.print("원하시는 기능의 숫자를 입력해주세요 : ");
            num = sc.nextInt();

            switch (num) {
                case 1 : notice.notice();
                    break;
                case 2 : all.korWords();
                    break;
                case 3: all.engWords();
                    break;
                case 9 : System.out.println("프로그램을 종료합니다.");
                    break;

                default :
                    System.out.println();
                    System.out.println("잘못된 값을 입력하셨습니다.");
                    System.out.println();
            }
            if (num == 9) {
                break;
            }



        } while (true);
    }
}
