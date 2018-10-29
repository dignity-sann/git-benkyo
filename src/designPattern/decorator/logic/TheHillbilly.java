package designPattern.decorator.logic;

public class TheHillbilly implements IKiller {

    @Override
    public String getName() {
        return "ヒルビリー";
    }

    @Override
    public String getPerk() {
        return "不屈、苦悶の根源、観察と虐待、最後のお楽しみ";
    }
}
