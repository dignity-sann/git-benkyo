package designPattern.decorator.logic;

public class CustomePerk implements IKiller {

    IKiller killer = null;
    public CustomePerk(IKiller killer) {
        this.killer = killer;
    }

    @Override
    public String getName() {
        return killer.getName();
    }

    @Override
    public String getPerk() {
        return "苦悶の根源、バーベキュー＆チリ、破滅、不安の元凶";
    }
}
