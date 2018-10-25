package designPattern.factoryMethod.logic;

import designPattern.factoryMethod.logic.base.AbstractIchiniti;
import designPattern.factoryMethod.logic.base.IDailyMission;

public class OtokuraIchiniti extends AbstractIchiniti {

    @Override
    protected IDailyMission dailyMissinonFuctory() {
        return new OtokuraGames();
    }
    @Override
    protected void morning(IDailyMission daily) {
        System.out.println(daily.getGame() + "できなかった。");
    }
    @Override
    protected void ohiru(IDailyMission daily) {
        System.out.println(daily.getGame() + "できた。山岡凛で失敗した。");

    }
    @Override
    protected void evening(IDailyMission daily) {
        System.out.println(daily.getGame() + "できた。クロちゃん");

    }
    @Override
    protected void owattara(IDailyMission daily) {
        System.out.println(daily.getGame() + "できなかった。おやすみ");
    }
}
