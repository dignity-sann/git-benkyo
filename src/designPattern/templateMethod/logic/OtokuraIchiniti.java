package designPattern.templateMethod.logic;

import designPattern.templateMethod.logic.base.AbstractIchiniti;

public class OtokuraIchiniti extends AbstractIchiniti {

    @Override
    protected void morning() {
        System.out.println("はしる");

    }
    @Override
    protected void ohiru() {
        System.out.println("ミックスジュース");

    }
    @Override
    protected void evening() {
        System.out.println("はしる");

    }
    @Override
    protected void owattara() {
        System.out.println("ミックスジュース");
    }
}
