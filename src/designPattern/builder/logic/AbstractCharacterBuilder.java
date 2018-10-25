package designPattern.builder.logic;

public abstract class AbstractCharacterBuilder implements ICharacterMaiking {
    public abstract void settingName(String name);
    public abstract void settingType(String type);
    public abstract void settingDescription(String description);
    public abstract void kakutei();
}
