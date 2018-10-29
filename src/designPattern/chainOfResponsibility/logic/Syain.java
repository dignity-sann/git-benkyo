package designPattern.chainOfResponsibility.logic;

public class Syain extends AbstractUser {

    @Override
    public String getUserName() {
        return "社員田中";
    }
    @Override
    public void setAuthority() {
        super.authority = 10;
    }
}
