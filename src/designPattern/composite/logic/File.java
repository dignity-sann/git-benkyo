package designPattern.composite.logic;

public class File implements IFileComposite {

    String name = "";
    public File(String name) {
        this.name = name;
    }

    public void delete(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println(this.name + ".file");
    }
}
