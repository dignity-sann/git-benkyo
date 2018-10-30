package designPattern.observer;

import designPattern.observer.logic.ConcreateMatch;
import designPattern.observer.logic.KillerObserver;
import designPattern.observer.logic.SurvivorObserver;

/*
 * □まとめ
 * 実装クラスの状態の変化を通知し観察対象ではなんらかの処理を行うパターン
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        ConcreateMatch match = new ConcreateMatch();
        KillerObserver kObserver = new KillerObserver();
        SurvivorObserver sObserver = new SurvivorObserver();
        match.addObserver(kObserver);
        match.addObserver(sObserver);
        match.execute();
    }
}
