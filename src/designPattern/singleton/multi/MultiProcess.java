package designPattern.singleton.multi;

public class MultiProcess {

    private static MultiProcess multiProcess = new MultiProcess();
    private boolean dieYamaokaRin = false;
    private MultiProcess() {};
    public static MultiProcess getInstance() {
        return multiProcess;
    }
    public void yamaokadoko() {
        if (dieYamaokaRin) {
            System.out.println("山岡凛は死んだ。");
        } else {
            System.out.println("山岡凛はチェイス中。");
        }
    }
    public void kill() {
        dieYamaokaRin = true;
    }
    public void zaoraru() {
        dieYamaokaRin = false;
    }
}
