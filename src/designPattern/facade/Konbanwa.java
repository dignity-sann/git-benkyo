package designPattern.facade;

import designPattern.facade.logic.KonobanwaUtil;

public class Konbanwa {
    public void facade() {
        KonobanwaUtil util = new KonobanwaUtil();
        if (Math.random() > 0.5) {
            System.out.println(util.konobanwaMessage());
        } else {
            System.out.println(util.konobanwaMessageUs());
        }
    }
}
