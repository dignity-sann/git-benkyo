package designPattern.builder.logic;

public class AzurlaneBuilder extends AbstractCharacterBuilder {

    private String name = "";
    private String type = "";
    private String description = "";
    @Override
    public void settingName(String name) {
        this.name = name;
    }

    @Override
    public void settingType(String type) {
        this.type = type;
    }

    @Override
    public void settingDescription(String description) {
        this.description = description;
    }

    @Override
    public void kakutei() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("アズールレーン");
        System.out.println("名前：" + name);
        System.out.println("艦種：" + type);
        System.out.println("説明：" + description);
        System.out.println("------------------------------------------------------------------------------------");
    }
}
