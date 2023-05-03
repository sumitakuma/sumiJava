package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		問1)
//		下記9個をローカル変数として宣言のみしてください
//		・バイト型・短整数型・整数型・長整数型
//		・単精度浮動小数点数型・倍精度浮動小数点数型
//		・文字型・文字列型
//		・ブーリアン型
		
		byte a; short b; int c; long d;	//・バイト型・短整数型・整数型・長整数型
		
		float e; double f;	//・単精度浮動小数点数型・倍精度浮動小数点数型
		
		char g; String h;	//・文字型・文字列型
		
		boolean i;	//・ブーリアン型
		
//		問２)
//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		a = 0; b = 0; c = 0; d = 0;
		e = 0L; f = 0.0f; 
		g = '\u0000';  h = "こんにちは";
		i = false;
		
//		問３)
//		初期化をしたそれぞれの変数に下記の値を代入してください
//		・バイト型　10	
		a =10;
//		・短整数型　100
		b = 100;
//		・整数型　1000
		c = 1000;
//		・長整数型　10000
		d = 10000;
//		・単精度浮動小数点数型　9.5
		e = (float)9.5;
//		・倍精度浮動小数点数型　10.5
		f = 10.5;
//		・文字型　a
		g = 'a';
//		・文字列型　ハロー
		h = "ハロー";
//		・ブーリアン型true
		i = true;
		
		
		
//		問4)	
//		下記の通りにコンソール出力されるようにしてください
//		上記で作成した変数を必ず使用すること
//		11110		//a～dの合計
		System.out.println(a + b + c + d);
		
//		20			//整数表記のため、aを2回分算出
		System.out.println(a + a);
		
//		a ハロー true		//スペースを含めるため、g・h・iの間に空白文字を追加
		System.out.println(g + " " + h + " " + i);
		
//		11130				数字を全て足す		//aからfの合計
		System.out.println(a + b + c + d + e + f);
		
//		10000000000			小数点以外の数字を全てかける		//整数はa～d
		System.out.println(a * b * c * d);
		
//		0.105				10.5割る100をする		
		System.out.println(f / b);
		
//		-90					10引く100をする
		System.out.println(a - b);


//		問５)
//		次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
//		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。			
//		　String num="20";			
//		　int num1=23;			
//		　System.out.println("ハローJAVA"+(num+num1));	
		
		String num = "4";	//20を4に変更
		
		int num1 = 3;		//23を3に変更
		
		System.out.println("ハローJAVA" + (num + num1));
					
//		問６）					
//		『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください			
//		ローカル変数に代入し○○に入れてください			
//		『山田太郎 18歳 170.5cm 62.2kg 寿司』		
		
		String name = "山田太郎";	//文字入力なので、Stringを使用	
		
		String eat = "寿司";		//文字入力なので、Stringを使用	
		
		byte age = 18;				//整数なので整数に対して使用できるものを使用
		
		double height = 170.5;		//小数点型なので、doubleを使用
		
		double weight = 62.2;		//小数点型なので、doubleを使用
		
//		↓↓format↓↓			
//		「初めまして○○です」			
//		「年齢は○○歳です」			
//		「身長は○○cmです」			
//		「体重は○○kgです」			
//		「好きな食べ物は○○です」	
		
		System.out.println("初めまして" + name + "です");	//「初めまして○○です」	
		
		System.out.println("年齢は" + age + "歳です");		//「年齢は○○歳です」
		
		System.out.println("身長は" + height + "cmです");	//「身長は○○cmです」
		
		System.out.println("体重は" + weight + "kgです");	//「体重は○○kgです」
		
		System.out.println("好きな食べ物は" + eat + "です");	//「好きな食べ物は○○です」
					
		
//　	問７）					
//		6で作成した自己紹介に続いてBMIが出力されるようにしてください			
//		「BMIは○○です」			
//		ただし計算は数値を直書きせず、全て変数を使ってすること	
		
		double height2 = height / 100;	//身長を100で割り、cmをmに直す
		
		double bmi = weight / height2 /height2;	//体重(kg)÷身長(m)÷身長(m)
		
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");	//「BMIは○○です」
					
//　	問８）					
//		6で宣言した変数に再代入し下記の通りコンソールに出力してください			
//		　初めまして鈴木一郎です			
//		　年齢は24歳です			
//		　身長168.5cmです			
//		　体重は64.2kgです			
//		　好きな食べ物はオムライスです			
//		　BMIは22.6です			
		
		name = "鈴木一郎";	//再代入なので、変数宣言を省く
		
		age = 24;			//再代入なので、変数宣言を省く
		
		height =168.5;		//再代入なので、変数宣言を省く
		
		weight = 64.2;		//再代入なので、変数宣言を省く
		
		eat = "オムライス";	//再代入なので、変数宣言を省く
		
		bmi = 22.6;			//再代入扱いなので、計算をせず、数値をそのまま代入
		
		System.out.println("初めまして" + name + "です");	//初めまして鈴木一郎です	
		
		System.out.println("年齢は" + age + "歳です");		//年齢は24歳です
		
		System.out.println("身長は" + height + "cmです");	//身長168.5cmです	
		
		System.out.println("体重は" + weight + "kgです");	//体重は64.2kgです	
		
		System.out.println("好きな食べ物は" + eat + "です");	//好きな食べ物はオムライスです
		
		System.out.println("BMIは" + bmi + "です");			//BMIは22.6です
		
		
//		問９）					
//		8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください			
//		　初めまして鈴木一郎です			
//		　年齢は48歳です			
//		　身長337.0cmです			
//		　体重は128.4kgです			
//		　好きな食べ物はオムライスです			
//		　BMIは11.31です			
		
		age += age;								//自己代入
		
		height += height;						//自己代入
		
		weight += weight;						//自己代入
		
		double height3 = height / 100;				//身長を100で割り、cmをmに変換
		
		double bmi2 = weight / height3 /height3;	//体重(kg)÷身長(m)÷身長(m)
		
		System.out.println("初めまして" + name + "です");						//初めまして鈴木一郎です
		
		System.out.println("年齢は" + age + "歳です");							//年齢は48歳です
		
		System.out.println("身長は" + height + "cmです");						//身長337.0cmです
		
		System.out.println("体重は" + weight + "kgです");						//体重は128.4kgです
		
		System.out.println("好きな食べ物は" + eat + "です");					//好きな食べ物はオムライスです	
		
		System.out.println("BMIは" + String.format("%.2f", bmi2) + "です");	//BMIは11.31です　小数点第2位の表記なので、%.2f
		
					
//		問１０）					
//		8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません		
		
		name = "鈴木一郎";	//ここで改めて表記しないと問9の数値が出力されかねないので、改めて出力。
		
		age = 24;			//ここで改めて表記しないと問9の数値が出力されかねないので、改めて出力。
		
		height =168.5;		//ここで改めて表記しないと問9の数値が出力されかねないので、改めて出力。
		
		weight = 64.2;		//ここで改めて表記しないと問9の数値が出力されかねないので、改めて出力。
		
		eat = "オムライス";	//ここで改めて表記しないと問9の数値が出力されかねないので、改めて出力。
		
		bmi = 22.6;			//ここで改めて表記しないと問9の数値が出力されかねないので、改めて出力。
		
		System.out.println(age >= 25);	//年齢が25歳以上の時のみtrueが出力される
				
//		問１１）		
//		8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください			
		
		String str1 = Integer.toString(age);	//文字型をString型に変換
		
		String str2 = String.valueOf(height);	//文字型をString型に変換
		
		String str3 = String.valueOf(weight);	//文字型をString型に変換
		
		System.out.println(str1 + str2 + str3);	//str型にした3つを繋げて出力
		
//		問１２）		
//		11で変換した【年齢・身長】を整数型に変換して出力してください			
		
		int nenrei = Integer.parseInt(str1);			//String型を整数に変換
		
		double sintyou = Double.parseDouble(str2);		//String型を小数点型に変換
		
		int sintyou1 = (int)sintyou;					//小数点型を整数に変換
		
		System.out.println(nenrei + sintyou1);			//年齢と身長の数値を合計
		
//		問１３）			
//		12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
//		ただしif文は使わないでください			
		
		System.out.println(age == 25 ||  height >= 160);		//年齢が25もしくは身長が160以上という条件を追加
		
		
	}

}

