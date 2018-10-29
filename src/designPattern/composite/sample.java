package designPattern.composite;

import designPattern.composite.logic.File;
import designPattern.composite.logic.Folder;
import designPattern.composite.logic.Link;

/*
 * □まとめ
 * 木構造をもつものでcompositeパターンを使用していない場合は
 * 新たな追加をした際に変更が必要になるためわかりやすい
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        Folder folder1 = new Folder("フォルダ１");
        Folder folder2 = new Folder("フォルダ２");
        Folder folder3 = new Folder("フォルダ３");
        Folder folder4 = new Folder("フォルダ４");
        File file1 = new File("ファイル１");
        File file2 = new File("ファイル２");
        File file3 = new File("ファイル３");
        File file4 = new File("ファイル４");
// 追加
        Link link1 = new Link("リンク１");
        Link link2 = new Link("リンク２");
        Link link3 = new Link("リンク３");
// 追加
        folder1.add(folder2);
        folder2.add(folder3);
        folder3.add(file1);
        folder3.add(file2);
        folder3.add(file3);
        folder3.add(link1);
        folder3.add(link2);
        folder4.add(file4);
        folder4.add(link3);

        folder1.delete(0);
        folder4.delete(0);
    }
}
