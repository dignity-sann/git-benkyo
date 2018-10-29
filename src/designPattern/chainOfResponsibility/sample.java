package designPattern.chainOfResponsibility;

import designPattern.chainOfResponsibility.logic.Bucho;
import designPattern.chainOfResponsibility.logic.Kacho;
import designPattern.chainOfResponsibility.logic.Syacho;
import designPattern.chainOfResponsibility.logic.Syain;

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
        Syain syain = new Syain();
        syain.setAuthority();
        Bucho bucho = new Bucho();
        bucho.setAuthority();
        Kacho kacho = new Kacho();
        kacho.setAuthority();
        Syacho syacho = new Syacho();
        syacho.setAuthority();
        syain.setNextApprovalUser(bucho).setNextApprovalUser(kacho).setNextApprovalUser(syacho);
        System.out.println("ケース１：田中はどうするか？");
        syain.chainQuestApproval(39);
        syain.chainQuestApproval(40);
        syain.chainQuestApproval(41);
    }
}
