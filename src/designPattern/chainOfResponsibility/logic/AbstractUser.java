package designPattern.chainOfResponsibility.logic;

public abstract class AbstractUser implements IUser {

    AbstractUser abstractUser = null;
    int authority;

    public AbstractUser setNextApprovalUser(AbstractUser abstractUser) {
        this.abstractUser = abstractUser;
        return abstractUser;
    }
    public void chainQuestApproval(int authority) {
        if (isApproval(authority)) {
            answer();
        } else if (this.abstractUser != null) {
            this.abstractUser.chainQuestApproval(authority);
        } else {
            System.out.println("誰にも答えられない");
        }
    }
    private void answer() {
        System.out.println(getUserName() + "が回答しました。");
    }
    private boolean isApproval(int authority) {
        if (this.authority < authority) {
            return false;
        } else {
            return true;
        }
    }
    public abstract void setAuthority();
}
