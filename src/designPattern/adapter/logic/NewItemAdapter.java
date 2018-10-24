package designPattern.adapter.logic;

import designPattern.adapter.logic.intef.IItem;

public class NewItemAdapter extends OldItem implements IItem {

    @Override
    public String getName() {
        return "新しい商品";
    }
}
