package designPattern.facade;

/*
 * □まとめ
 * 処理単位毎に処理の窓口を作ってしまい呼び元は意識しなくていいようにする
 */

/**
 * sample
 * @author dignity-sann
 */
public class sample {

    public static void main(String[] args) {
        int i = 2;
        switch (i) {
            case 1:
                new Ohayou().facade();
                break;
            case 2:
                new Konnitiwa().facade();
                break;
            case 3:
                new Konbanwa().facade();
                break;
        }
    }
}
