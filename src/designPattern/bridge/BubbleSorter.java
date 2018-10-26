package designPattern.bridge;

import designPattern.bridge.base.SortImple;

public class BubbleSorter extends SortImple {

    @Override
    public void sort(Object[] obj) {
        System.out.println("バブルソートだよ");
    }
}
