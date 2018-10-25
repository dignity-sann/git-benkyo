package designPattern.factoryMethod;

import designPattern.factoryMethod.logic.OtokuraIchiniti;
import designPattern.factoryMethod.logic.TanakaIchiniti;
import designPattern.factoryMethod.logic.base.AbstractIchiniti;

/*
 * □まとめ
 * templateMethod有りきになりそう
 * 作るにしてもfactoryMethodパターンで統一しないと煩雑になりそう
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        AbstractIchiniti tanaka = new TanakaIchiniti();
        AbstractIchiniti kawaiize = new OtokuraIchiniti();
        tanaka.ichiniti();
        kawaiize.ichiniti();
    }
}
