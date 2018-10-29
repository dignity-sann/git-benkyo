package designPattern.decorator;

import designPattern.decorator.logic.CustomePerk;
import designPattern.decorator.logic.TheHillbilly;
import designPattern.decorator.logic.TheHug;

/*
 * □まとめ
 * 元のものを継承して潰すのではなく
 * 新たに追加することで様々な機能変更が容易となる
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        TheHillbilly killer1 = new TheHillbilly();
        TheHug killer2 = new TheHug();
        CustomePerk killer3 = new CustomePerk(new TheHillbilly());

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("キラー：" + killer1.getName());
        System.out.println("パーク：" + killer1.getPerk());
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("キラー：" + killer2.getName());
        System.out.println("パーク：" + killer2.getPerk());
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("キラー：" + killer3.getName());
        System.out.println("パーク：" + killer3.getPerk());
        System.out.println("------------------------------------------------------------------------------------");
    }
}
