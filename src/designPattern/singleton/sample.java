package designPattern.singleton;

import designPattern.singleton.multi.MultiProcess;

/*
 * □まとめ
 * 全体を通しての状態や状態を持たないものに付加するのが有効
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        MultiProcess m1 = MultiProcess.getInstance();
        MultiProcess m2 = MultiProcess.getInstance();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("m1 ->");
        m1.yamaokadoko();
        System.out.println("m2 ->");
        m2.yamaokadoko();
        System.out.println("m1 ->");
        m1.kill();
        m1.yamaokadoko();
        System.out.println("m2 ->");
        m2.yamaokadoko();
        m2.zaoraru();
        System.out.println("m1 ->");
        m1.yamaokadoko();
        System.out.println("------------------------------------------------------------------------------------");
    }
}
