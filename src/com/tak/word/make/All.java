package com.tak.word.make;

public class All {

    KorWords korWords = new KorWords();
    EngWords engWords = new EngWords();

    /* 소요 시간을 측정하기 위한 시간측정 코드 추가하기!! */
    public void korWords() {

        korWords.kor1();

        System.out.println("총 소요시간 : " );

    }


    public void engWords() {

        engWords.eng1();

    }
}
