package designPattern.factoryMethod.logic;

import designPattern.factoryMethod.logic.base.IDailyMission;

public class OtokuraGames implements IDailyMission {

    @Override
    public String getGame() {
        return "デッドバイデイライト";
    }
    @Override
    public String getMornigTitle() {
        return "全キラーで全吊りチャレンジ１枠目";
    }

    @Override
    public String getOhiruTitle() {
        return "全キラーで全吊りチャレンジ２枠目";
    }

    @Override
    public String getEveningTitle() {
        return "クローデットモレルで隠密チャレンジ";
    }

    @Override
    public String getOwattaTitle() {
        return "ヒルビリー最小徒歩数全吊りチャレンジ";
    }
}
