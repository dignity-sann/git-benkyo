package designPattern.builder.logic;

public class MultiDirector {
    private AbstractCharacterBuilder builder;
    public MultiDirector(AbstractCharacterBuilder buider){
         this.builder = buider;
    }
    public void constract(String gameTyp){

        String[] character = new String[3];
        if (gameTyp.equals("アズレン")) {
            if (Math.random() < 0.8) {
                character = new String[]{"エイジャックス", "軽巡", "かわいい"};
            } else {
                character = new String[]{"エセックス", "空母", "鳥がかわいい"};
            }
        } else if (gameTyp.equals("デレマス")) {
            if (Math.random() < 0.8) {
                character = new String[]{"渋谷凛", "クール", "あまり好きじゃない"};
            } else {
                character = new String[]{"乙倉悠貴", "キュート", "Met That Kawaii"};
            }
        } else if (gameTyp.equals("DBD")) {
            character = new String[]{"ヒルビリー", "キラー", "ワンパン"};
        }
        builder.settingName(character[0]);
        builder.settingType(character[1]);
        builder.settingDescription(character[2]);
        builder.kakutei();
    }
}
