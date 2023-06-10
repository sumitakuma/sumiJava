package basicClass;

public class Dog {
	
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int number;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	// Q1の変数を引数に入力
	Dog(String name) {
		// 名前を"サラ"とする
		this.name = "Sara";
		System.out.println(name);
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
	// Q2の変数を引数に入力
	Dog(int number) {
		// 数を指定
		this.number = 1;
		System.out.println(number);
	}
}
