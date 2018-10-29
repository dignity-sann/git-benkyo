package designPattern.chainOfResponsibility.logic;

public class Kacho extends AbstractUser {

    @Override
    public String getUserName() {
        return "課長伊藤";
    }
    @Override
    public void setAuthority() {
        super.authority = 30;
    }
}
