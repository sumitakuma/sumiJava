package lesson7;

public class 型変換 {
	public static void main(String[] args) {
		
//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
//		②double型変数 d に i を代入する。
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		int i = 3;	//int型変数 i に 3 を代入
		
		double d = i;	//double型変数 d に i を代入
		
		System.out.println(i);	//変数 i の値をそれぞれコンソールに表示
		System.out.println(d);	//変数 d の値をそれぞれコンソールに表示
		
		
		
//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
//		③int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		
		double pi = 3.14;	//double型変数 pi に数値「3.14」を代入
		
		pi = pi * 3;		//変数 pi に「3」を掛けた値をコンソールに出力
		
		int integer = (int)pi;			//int型の変数 integer を宣言
		
		System.out.println(integer);	//変数 pi を int型に型変換しコンソールに出力
		
		
		
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
//		　double型の変数をコンソールに出力して下さい。
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
//		　int型の変数をコンソールに出力して下さい。
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
//		　String型の変数をコンソールに出力して下さい。
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//		　int型の変数をコンソールに出力して下さい。
		
		double abc = 2 + 6.0;				//double型の変数を定義し、「2 + 6.0」を代入
		
		System.out.println(abc);			//double型の変数をコンソールに出力
		
		int dd = (int)abc;					//int型の変数を定義し、double型の変数をint型に型変換して代入
		
		System.out.println(dd);				//int型の変数をコンソールに出力
		
		String o = String.valueOf(dd);		//String型の変数を定義し、int型の変数をString型に型変換して代入
		
		System.out.println(o);				//String型の変数をコンソールに出力
		
		int ky =Integer.valueOf(o);		//「②」で定義したint型変数に、String型の変数をint型に型変換して代入
		
		System.out.println(ky);				//int型の変数をコンソールに出力
	}
}