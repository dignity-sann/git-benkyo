package designPattern.builder.logic;

public class CinderellaGirlsBuilder extends AbstractCharacterBuilder {

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
        System.out.println("アイドルマスターシンデレラガールズ");
        System.out.println("名前：" + name);
        System.out.println("タイプ：" + type);
        System.out.println("説明：" + description);
        System.out.println("------------------------------------------------------------------------------------");
    }
}
