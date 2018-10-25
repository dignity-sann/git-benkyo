package designPattern.templateMethod;

import designPattern.factoryMethod.logic.OtokuraIchiniti;
import designPattern.factoryMethod.logic.TanakaIchiniti;

/*
 * □まとめ
 * モデリンクが正しくできていればかなり効きそう
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        TanakaIchiniti tanaka = new TanakaIchiniti();
        OtokuraIchiniti kawaiize = new OtokuraIchiniti();
        tanaka.ichiniti();
        kawaiize.ichiniti();
    }
}
