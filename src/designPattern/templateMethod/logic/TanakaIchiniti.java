package designPattern.templateMethod.logic;

import designPattern.templateMethod.logic.base.AbstractIchiniti;

public class TanakaIchiniti extends AbstractIchiniti {

    @Override
    protected void morning() {
        System.out.println("出社する");

    }
    @Override
    protected void ohiru() {
        System.out.println("ご飯食べる");

    }
    @Override
    protected void evening() {
        System.out.println("退社する");

    }
    @Override
    protected void owattara() {
        System.out.println("ねる");
    }
}
