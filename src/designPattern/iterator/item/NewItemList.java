package designPattern.iterator.item;

import java.util.Vector;

/**
 * NewItemList
 * @author dignity-sann
 */
public class NewItemList {

    protected Vector<Item> items;
    public void add(Item item){
        items.add(item);
    }
    public Item getItemAt(int index){
        return items.get(index);
    }
}
