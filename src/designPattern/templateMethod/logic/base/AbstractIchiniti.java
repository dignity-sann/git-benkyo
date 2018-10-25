package designPattern.templateMethod.logic.base;

/**
 * AbstractShigoto
 * @author dignity-sann
 */
public abstract class AbstractIchiniti {
    protected abstract void morning();
    protected abstract void ohiru();
    protected abstract void evening();
    protected abstract void owattara();
    public void ichiniti() {
        System.out.println("朝の出来事");
        morning();
        System.out.println("昼の出来事");
        ohiru();
        System.out.println("夕方の出来事");
        evening();
        System.out.println("夜の出来事");
        owattara();
    }
}
