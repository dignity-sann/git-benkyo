package designPattern.builder;

import designPattern.builder.logic.AzurlaneBuilder;
import designPattern.builder.logic.CinderellaGirlsBuilder;
import designPattern.builder.logic.MultiDirector;
/*
 * □まとめ
 * むずかしい。実装例などを見る必要あり
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        new MultiDirector(new AzurlaneBuilder()).constract("アズレン");
        new MultiDirector(new CinderellaGirlsBuilder()).constract("デレマス");
        new MultiDirector(new AzurlaneBuilder()).constract("DBD");
    }
}
