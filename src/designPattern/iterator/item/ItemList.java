package designPattern.iterator.item;

/**
 * ItemList
 * @author dignity-sann
 */
public class ItemList {

    protected Item[] items;
    private int count = 0;

    public ItemList() {
    }

    public ItemList(int count) {
        this.items = new Item[count];
    }

    public void add(Item item){
        items[this.count] = item;
        this.count++;
    }

    public Item getItemAt(int count){
        return items[count];
    }

    public int getLastCount(){
        return this.count;
    }
}
