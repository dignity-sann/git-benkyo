package designPattern.factoryMethod.logic;

import designPattern.factoryMethod.logic.base.AbstractIchiniti;
import designPattern.factoryMethod.logic.base.IDailyMission;

public class TanakaIchiniti extends AbstractIchiniti {

    @Override
    protected IDailyMission dailyMissinonFuctory() {
        return new TanakaGames();
    }
    @Override
    protected void morning(IDailyMission daily) {
        System.out.println(daily.getGame() + "できた。トワレむずかしい。");
    }
    @Override
    protected void ohiru(IDailyMission daily) {
        System.out.println(daily.getGame() + "できた。トワレむずかしい。");

    }
    @Override
    protected void evening(IDailyMission daily) {
        System.out.println(daily.getGame() + "できなかった。むずかしい");

    }
    @Override
    protected void owattara(IDailyMission daily) {
        System.out.println(daily.getGame() + "できなかった。むずかしいむずかしい");
    }
}
