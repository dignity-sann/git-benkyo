package designPattern.factoryMethod.logic.base;

/**
 * AbstractShigoto
 * @author dignity-sann
 */
public abstract class AbstractIchiniti {
    protected abstract IDailyMission dailyMissinonFuctory();
    protected abstract void morning(IDailyMission daily);
    protected abstract void ohiru(IDailyMission daily);
    protected abstract void evening(IDailyMission daily);
    protected abstract void owattara(IDailyMission daily);
    public void ichiniti() {
        IDailyMission daily = this.dailyMissinonFuctory();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("対象 -> " + daily.getGame());
        System.out.print("□" + daily.getMornigTitle() + "：");
        this.morning(daily);
        System.out.print("□" + daily.getOhiruTitle() + "：");
        this.ohiru(daily);
        System.out.print("□" + daily.getEveningTitle() + "：");
        this.evening(daily);
        System.out.print("□" + daily.getOwattaTitle() + "：");
        this.owattara(daily);
        System.out.println("------------------------------------------------------------------------------------");
    }
}
