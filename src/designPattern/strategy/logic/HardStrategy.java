package designPattern.strategy.logic;

import designPattern.strategy.logic.base.IDifficultyStrategy;

public class HardStrategy implements IDifficultyStrategy {

    @Override
    public void simulation() {
        if (Math.random() > 0.89) {
            System.out.println("Ok");
        } else {
            System.out.println("Ng");
        }
    }
}
