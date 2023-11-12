package animal;

public class Human extends Animal implements Thinkable {

    private String hobby;
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }


 // 以下、ゲッターとセッター
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    // コンストラクタを定義(引数なし)
    public Human() {
    }
    // コンストラクタを定義(引数あり)
    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラス(Animal)のコンストラクタを呼び出し
        this.hobby = hobby;
    }

}
