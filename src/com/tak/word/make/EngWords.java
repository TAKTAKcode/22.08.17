package com.tak.word.make;

import java.util.Scanner;

public class EngWords {

    Setting set = new Setting();
    Scanner sc = new Scanner(System.in);

    String str;
    String[] eng = {"public", "void", "method", "getInformation", "Overriding", "abstraction"};

    public void eng1() {

        for (int i = 0; i < 6; i++) {

            while (true) {
                set.write();
                System.out.println(eng[0]);
                str = sc.nextLine();

                if (str.equals(eng[i])) {
                    break;
                } else {
                    set.rewrite();
                }


            }

        }

    }

}
