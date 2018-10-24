package designPattern.iterator.user.member1;

import designPattern.iterator.item.Item;
import designPattern.iterator.user.base.AbstractCEO;

/**
 * Member1
 * @author dignity-sann
 */
public class Member1 extends AbstractCEO {

    protected Member1MyList itemlist;

    @Override
    public void createItemList() {
        itemlist = new Member1MyList(5);
        itemlist.add(new Item("001", "商品１"));
        itemlist.add(new Item("002", "商品２"));
        itemlist.add(new Item("003", "商品３"));
        itemlist.add(new Item("004", "商品４"));
        itemlist.add(new Item("005", "商品５"));
    }

    /*
     * 集約型の実装を使用してしまう問題
     * #getLastCount()、#getItemAt()
     */
    public void callItems_old() {
        for (int i = 0; i < itemlist.getLastCount(); i++) {
            Item item = itemlist.getItemAt(i);
            System.out.println("品番：" + item.getCode() + "、品名：" + item.getName());
        }
    }

    /*
     * 集約型の実装ではないので同じ構造の集約型であれば
     * 変更に強い
     */
    @Override
    public void callItems() {
        while (itemlist.iterator().hasNext()) {
            Item item = (Item) itemlist.iterator().next();
            System.out.println("品番：" + item.getCode() + "、品名：" + item.getName());
        }
    }
}
