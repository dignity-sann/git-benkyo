package designPattern.observer.logic;

public class SurvivorObserver implements IObserver {

    @Override
    public void update(AbstractSubjectDbd dbd) {
        if (dbd.getHatsudenki() != 0 && dbd.getSurvivorCount() != 0) {
            System.out.println("SurvivorObserver:" + "残り発電機は" + dbd.getHatsudenki());
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
