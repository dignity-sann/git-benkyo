package designPattern.bridge;

import designPattern.bridge.base.SortImple;

public class QuickSorter extends SortImple {

    @Override
    public void sort(Object[] obj) {
        System.out.println("クイックソートだよ");
    }
}
