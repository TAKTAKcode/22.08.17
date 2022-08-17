package com.tak.word.select;

import java.util.Scanner;

public class Notice {

    public void notice() {

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("@@@@@ 게임 설명 @@@@");

            System.out.println("---------------------------");
            System.out.println("1. (한글단어, 영어단어) 中 택 1");
            System.out.println("2. 첫단어 등장과 동시에 소요시간 측정");
            System.out.println("3. 모든 단어 입력 후 소요시간 측정 종료 후 소요시간 출력");
            System.out.println("---------------------------");
            System.out.print("이전으로 돌아가려면 숫자 [ 1 ] 입력해주세요 : ");
            num = sc.nextInt();

            switch (num) {
                case 1 : return;
            }
        } while (true);
    }
}
