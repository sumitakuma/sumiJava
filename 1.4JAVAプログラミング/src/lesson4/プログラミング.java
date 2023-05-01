package lesson4;

public class プログラミング {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
   	 
	     // Q1 下記9個をローカル変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
   	 	byte b;	//バイト型
   	 	short c;	//短整数型
   	 	int d;	//整数型
   	 	long e;	//長整数型
   	 	float f;	//単精度浮動小数点型
   	 	double g;	//倍精度浮動小数点型
   	 	char h;	//文字型
   	 	String i;	//文字列型
   	 	boolean date;	//ブーリアン型
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
   	 	b= 0;
   	 	c= 0; 
   	 	d = 0; 
   	 	e = 0L; 
   	 	f= 0.0f;
   	 	g= 0.0d; 
   	 	h = '\u0000'; 
   	 	i = "こんにちは"; 
   	 	date = false;
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	     // ・バイト型                 10
   	 	b = 10;
	     // ・短整数型                 100
   	 	c =100;
	     // ・整数型                	 1000
   	 	d =1000;
	     // ・長整数型                 10000
   	 	e = 10000;
	     // ・単精度浮動小数点数型   	 9.5
   	 	f = (float) 9.5;
	     // ・倍精度浮動小数点数型		 10.5
   	 	g = 10.5;
	     // ・文字型                   a
   	 	h = 'a';
	     // ・文字列型              	 ハロー
   	 	i = "ハロー";
	     // ・ブーリアン型          	 true
	    date = true;
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	     // 11110 上記b～eの数値合計
	    System.out.println(b + c + d + e);
	     // 20.0　小数点付きのため、小数点型の合計
	    System.out.println(f + g);
	     // a ハロー true　文字間が、スペースあいてると思ったので、"　"を追加
	    System.out.println(h + " " + i + " "+ date);
	    // 11130.0         数字を全て足す　数字はa～gまで
	    System.out.println(b + c + d + e + f + g);
	     // 10000000000      小数点以外の数字を全てかける　　a～eまで
	    System.out.println(b * c * d * e);
	     // 0.105           10.5割る100をする　　　
	    System.out.println(g / c);
	     // -90            10引く100をする
	    System.out.println(b - c);
   	// Q5 
   	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
   	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		String num = "4"; //20→4
		int num1 = 3; //23→3
		System.out.println("ハローJAVA" + (num + num1));
	}

}

    