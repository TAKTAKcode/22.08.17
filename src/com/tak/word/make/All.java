package com.tak.word.make;

public class All {

    KorWords korWords = new KorWords();
    EngWords engWords = new EngWords();

    /* 소요 시간을 측정하기 위한 시간측정 코드 추가하기!! */
    public void korWords() {

        long beforeTime = System.currentTimeMillis();

        korWords.kor1();

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime) / 1000;

        System.out.println("총 소요시간 : " + secDiffTime + "초");

    }

    public void engWords() {

        long beforeTime = System.currentTimeMillis();

        engWords.eng1();

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime) / 1000;

        System.out.println("총 소요시간 : " + secDiffTime + "초");
    }
}
