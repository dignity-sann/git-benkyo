package designPattern.decorator.logic;

public class TheHug implements IKiller {

    @Override
    public String getName() {
        return "ハグ";
    }

    @Override
    public String getPerk() {
        return "観察と虐待、選択は君次第だ、不屈、弄ばれる獲物";
    }
}
