public class HumanMain {
  public static void main(String[] args) {
    // インスタンスを生成
    Human human1 = new Human();

    // プロパティを設定
    human1.name = "徳川家康";
    human1.age = 80;

    // helloメソッドを呼び出す（徳川家康、80歳となる）
    human1.hello();

    // 別のインスタンスを生成
    Human human = new Human();

    // プロパティを設定
    human1.name = "紫式部";
    human1.age = 30;

    // helloメソッドを呼び出す（紫式部、30歳となる）
    human1.hello();

  }
}
