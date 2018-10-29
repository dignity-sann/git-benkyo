package designPattern.facade;

import designPattern.facade.logic.KonnitiwaUtil;

public class Konnitiwa {
    public void facade() {
        KonnitiwaUtil util = new KonnitiwaUtil();
        if (Math.random() > 0.5) {
            System.out.println(util.konnitiwaMessage());
        } else {
            System.out.println(util.konnitiwaMessageUs());
        }
    }
}
