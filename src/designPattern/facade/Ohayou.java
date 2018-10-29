package designPattern.facade;

import designPattern.facade.logic.OhayouUtil;

public class Ohayou {
    public void facade() {
        OhayouUtil util = new OhayouUtil();
        if (Math.random() > 0.5) {
            System.out.println(util.ohayouMessage());
        } else {
            System.out.println(util.ohayouMessageUs());
        }
    }
}
