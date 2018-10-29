package designPattern.composite.logic;

public class Link implements IFileComposite {

    String name = "";
    public Link(String name) {
        this.name = name;
    }

    public void delete(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println(this.name + ".link");
    }
}
