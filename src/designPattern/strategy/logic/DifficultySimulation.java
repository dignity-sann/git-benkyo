package designPattern.strategy.logic;

import designPattern.strategy.logic.base.IDifficultyStrategy;

public class DifficultySimulation {
    private IDifficultyStrategy strategy = null;
    public DifficultySimulation(IDifficultyStrategy strategy){
        this.strategy = strategy;
    }
    public void simulation() {
        strategy.simulation();
    }
}
