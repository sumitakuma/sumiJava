package lesson5;

public class 変数１ {
	public static void main(String[] args) {
		 // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
	    //  ローカル変数に代入し○○に入れてください
	    // 『山田太郎 18歳 170.5cm 62.2kg 寿司』
	
	    // ↓↓format↓↓
	    // 「初めまして○○です」
	    // 「年齢は○○歳です」
	    // 「身長は○○cmです」
	    // 「体重は○○kgです」
	    // 「好きな食べ物は○○です」
	
		// Q1を下記に記載
		String name = "山田太郎";	//名前をString型を用いてnameに代入
		String eat = "寿司";		//食べ物をString型を用いてeatに代入
		byte age = 18;				//年齢は数値かつ整数なので、バイト型を用いてageに代入
		double height = 170.5;		//身長は小数点型なので、doubleを用いてheightに代入
		double weight = 62.2;		//体重は小数点型なので、doubleを用いてweightに代入
		
		System.out.println("初めまして" + name + "です");	 // 「初めまして○○です」
		System.out.println("年齢は" + age + "歳です");		// 「年齢は○○歳です」
		System.out.println("身長は" + height + "cmです");	 // 「身長は○○cmです」
		System.out.println("体重は" + weight + "kgです");		 // 「体重は○○kgです」
		System.out.println("好きな食べ物は" + eat + "です");	// 「好きな食べ物は○○です」
		
	    // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
	    // ただし計算は数値を直書きせず、全て変数を使ってすること
	
	    // Q2を下記に記載
		double height2 = height / 100;		//BMIを求める際に、身長はcmではなく、m表記での計算になるので、問１で代入した身長を100で割り、それをheight2に代入
		double bmi = weight / height2 /height2;		//BMI=体重(kg)÷身長(m)÷身長(m)
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");		//String.format("%.1f")で、小数点第１位以下の表記を省略する
		
		
	    // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です
	
	    // Q3を下記に記載
		name = "鈴木一郎";	//再代入なので、変数宣言を省く
		age = 24;			//再代入なので、変数宣言を省く
		height =168.5;		//再代入なので、変数宣言を省く
		weight = 64.2;		//再代入なので、変数宣言を省く
		eat = "オムライス";	//再代入なので、変数宣言を省く
		bmi = 22.6;			//再代入扱いなので、計算をせず、数値をそのまま代入した
		
		System.out.println("初めまして" + name + "です");	// 初めまして鈴木一郎です
		System.out.println("年齢は" + age + "歳です");		// 年齢は24歳です
		System.out.println("身長は" + height + "cmです");	// 身長168.5cmです
		System.out.println("体重は" + weight + "kgです");	// 体重は64.2kgです
		System.out.println("好きな食べ物は" + eat + "です");	// 好きな食べ物はオムライスです
		System.out.println("BMIは" + bmi + "です");			// BMIは22.6です
			
		// ↓↓コンソール最終結果↓↓
		
		//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です

	}
}