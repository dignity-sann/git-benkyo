package designPattern.factoryMethod.logic;

import designPattern.factoryMethod.logic.base.IDailyMission;

public class TanakaGames implements IDailyMission {

    @Override
    public String getGame() {
        return "デレステ";
    }
    @Override
    public String getMornigTitle() {
        return "トワレフルコンチャレンジ";
    }

    @Override
    public String getOhiruTitle() {
        return "トランシングパルスフルコンチャレンジ";
    }

    @Override
    public String getEveningTitle() {
        return "仇剣フルコンチャレンジ";
    }

    @Override
    public String getOwattaTitle() {
        return "(再)トワレフルコンチャレンジ";
    }
}
