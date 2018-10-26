package designPattern.bridge;

import designPattern.bridge.base.TimerSorter;
/*
 * □まとめ
 * 全然わからなくてサンプル丸コピした
 * 実装クラスの関係を継承から委譲に変更することで
 * 機能の追加にするパターン？
 * これも業務パターンでのサンプルがほしい・・・
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        TimerSorter bubs = new TimerSorter(new BubbleSorter());
        bubs.sort(new String[] {"a", "b", "c"});
        bubs.timerSort(new String[] {"a", "b", "c"});
    }
}
