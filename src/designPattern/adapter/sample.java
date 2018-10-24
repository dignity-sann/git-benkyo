package designPattern.adapter;

import designPattern.adapter.logic.NewItemAdapter;

/*
 * □まとめ
 * 元々のクラスを変更せずに追加機能の実装などができるため有効
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        NewItemAdapter adapter = new NewItemAdapter();
        System.out.println("元々のメソッド：" + adapter.getItemName());
        System.out.println("新しいメソッド：" + adapter.getName());
    }

}
