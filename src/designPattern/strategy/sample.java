package designPattern.strategy;

import designPattern.strategy.logic.DifficultySimulation;
import designPattern.strategy.logic.EasyStrategy;
import designPattern.strategy.logic.HardStrategy;
import designPattern.strategy.logic.NormalStrategy;
import designPattern.strategy.logic.base.IDifficultyStrategy;

/*
 * □まとめ
 * アルゴリズムごとに分割を行うことによって変更や追加に強くなる
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {

        IDifficultyStrategy difficulty = null;

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    difficulty = new EasyStrategy();
                    System.out.println("イージー");
                    break;
                case 1:
                    difficulty = new NormalStrategy();
                    System.out.println("ノーマル");
                    break;
                case 2:
                    difficulty = new HardStrategy();
                    System.out.println("ハード");
                    break;
            }
            System.out.println("----------------------------------------------------------------------------");
            for (int j = 0; j < 5; j++) {
                System.out.print((j + 1) + "回目：");
                new DifficultySimulation(difficulty).simulation();;
            }
            System.out.println("----------------------------------------------------------------------------");
        }
    }
}
