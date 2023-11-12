package animal;

public class Animal {

    // 名前と年齢を格納するフィールドを定義
    private String name;
    private int age;

    // コンストラクタを定義(引数なし)
    public Animal() {
    }
    // コンストラクタを定義(引数あり)
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // sayメソッド
    public void say(Animal name, Animal age) {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }


    // 以下、ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
