package basicClass;

public class Dog {
	
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int num;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	// 引数無しのコンストラクタ
	Dog() {
	}
	
	// Animalで呼び出した文字列を返す
	String getName() {
		return name;
	}
	
	// Animalで引数内にセットする文字列をString nameに代入
	void setName(String name) {
		this.name = name;
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
	// Animalで呼び出した数値を返す
	int getNum() {
		return num;
	}
	
	// Animalで引数内にセットする数値をint numに代入
	void setNum(int num) {
		this.num = num;
	}
}
