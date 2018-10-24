package designPattern.iterator;

import designPattern.iterator.user.member1.Member1;
/*
 * □まとめ
 * あまり使う機会はなさそう
 * （標準ライブラリにて実装されているのでArrayList）
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        Member1 member = new Member1();
        member.createItemList();
        member.callItems();
    }
}
