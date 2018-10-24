package designPattern.iterator.user.member1;

import designPattern.iterator.item.Item;
import designPattern.iterator.item.interf.Iterator;

public class Member1MyIterator implements Iterator {

    Member1MyList member1MyList;
    int index = 0;

    public Member1MyIterator(Member1MyList member1MyList) {
        this.member1MyList = member1MyList;
    }

    @Override
    public boolean hasNext() {
        return this.member1MyList.getLastCount() > index;
    }

    @Override
    public Object next() {
        Item item = this.member1MyList.getItemAt(index);
        index++;
        return item;
    }
}
