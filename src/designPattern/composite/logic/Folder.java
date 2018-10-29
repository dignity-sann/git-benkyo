package designPattern.composite.logic;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileComposite {
    List<IFileComposite> list = new ArrayList<IFileComposite>();
    String name = "";
    boolean isDisplayed = false;

    public Folder(String name) {
        this.name = name;
    }

    public void add(IFileComposite obj) {
        list.add(obj);
    }

    // アンチパターン
    /*
     * 木構造をもつものでcompositeパターンを使用していない場合は
     * 新たな追加をした際に変更が必要になる
     */
//    private void delete(int depth) {
//        for (Object obj : list) {
//            if (obj instanceof Folder) {
//                System.out.println(this.name);
//                for (int i = 0; i < depth; i++) {
//                    System.out.print(" ");
//                }
//                System.out.print("└");
//                isDisplayed = true;
//                int depthex = depth + 1;
//                ((Folder) obj).delete(depthex);
//
//            } else if (obj instanceof File) {
//                if (!isDisplayed) {
//                    System.out.println(this.name);
//                    isDisplayed = true;
//                }
//                ((File) obj).delete(depth + 2);
//            }
//        }
//    }

    public void delete(int depth) {
        for (IFileComposite obj : list) {
            if (!isDisplayed) {
                for (int i = 0; i < depth; i++) {
                    System.out.print(" ");
                }
                System.out.println(this.name);
            }
            isDisplayed = true;
            obj.delete(depth + 1);
        }
    }
}
