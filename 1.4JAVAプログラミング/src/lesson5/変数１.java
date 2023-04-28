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
		String name = "山田太郎";
		String eat = "寿司";
		byte age = 18;
		double height = 170.5;
		double weight = 62.2;
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + eat + "です");
		
	    // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
	    // ただし計算は数値を直書きせず、全て変数を使ってすること
	
	    // Q2を下記に記載
		double height2 = height / 100;
		double bmi = weight / height2 /height2;
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		
	    // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です
	
	    // Q3を下記に記載
		name = "鈴木一郎";
		age = 24;
		height =168.5;
		weight = 64.2;
		eat = "オムライス";
		bmi = 22.6;
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + eat + "です");
		System.out.println("BMIは" + bmi + "です");
		
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