package designPattern.iterator.item;

/**
 * Item
 * @author dignity-sann
 */
public class Item {

    private String code;
    private String name;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * codeを取得します。
     * @return code
     */
    public String getCode() {
        return code;
    }
    /**
     * codeを設定します。
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * nameを取得します。
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * nameを設定します。
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
