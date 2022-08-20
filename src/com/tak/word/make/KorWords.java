package com.tak.word.make;

import java.util.Scanner;

public class KorWords {

    Setting set = new Setting();
    Scanner sc = new Scanner(System.in);

    String str;
    String[] kor = {"매개변수", "메소드", "객체배열", "추상화", "다형성", "인터페이스"};

    public void kor1() {

        for (int i = 0; i < 6; i++) {

            while (true) {
                set.write();
                System.out.println(kor[i]);
                str = sc.nextLine();

                if (str.equals(kor[i])) {
                    break;
                } else {
                    set.rewrite();
                }
            }
        }
    }
}
