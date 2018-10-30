package designPattern.observer.logic;

public class KillerObserver implements IObserver {

    @Override
    public void update(AbstractSubjectDbd dbd) {
        System.out.println("-------------------------------------------------------------------");
        System.out.print("KillerObserver:");
        if (dbd.getHatsudenki() == 0) {
            System.out.println("脱出された");
        } else {
            if (dbd.getSurvivorCount() == 0) {
                System.out.println("全吊りした");
            } else {
                System.out.println("残り生存者は" + dbd.getSurvivorCount());
            }
        }
    }
}
