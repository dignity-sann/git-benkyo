package designPattern.iterator.user.member1;

import designPattern.iterator.item.ItemList;
import designPattern.iterator.item.interf.Aggregate;
import designPattern.iterator.item.interf.Iterator;

public class Member1MyList extends ItemList implements Aggregate {

    public Member1MyList() {
        super();
    }

    public Member1MyList(int count) {
        super(count);
    }

    @Override
    public Iterator iterator() {
        return new Member1MyIterator(this);
    }
}
