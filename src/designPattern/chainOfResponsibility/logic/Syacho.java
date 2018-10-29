package designPattern.chainOfResponsibility.logic;

public class Syacho extends AbstractUser {

    @Override
    public String getUserName() {
        return "社長田井中";
    }
    @Override
    public void setAuthority() {
        super.authority = 40;
    }
}
