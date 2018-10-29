package designPattern.chainOfResponsibility.logic;

public class Bucho extends AbstractUser {

    @Override
    public String getUserName() {
        return "部長佐藤";
    }
    @Override
    public void setAuthority() {
        super.authority = 20;
    }
}
