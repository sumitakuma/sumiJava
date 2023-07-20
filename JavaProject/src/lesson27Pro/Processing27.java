package lesson27Pro;

// 抽象クラス
abstract class animals {
	// コンストラクタ
	animals() {
	}
	// protected 動物名(name)・体長(length)・速度(speed)・学名(type)
	protected String name;
	protected double length;
	protected int speed;
	protected String type;
	
	// 抽象メソッド
	// 動物名
//	public abstract void date1(String name);
	// 体長
	public abstract void date2(double length);
	// 速度
	public abstract void date3(int speed);
	// 学名
//	public abstract void date4(String type);
	
	// スーパーメソッド
	public void printDate() {
		System.out.println("コンソールに文字を入力してください");
	}
}

// 継承クラス
public class Processing27 extends animals {
	
	// スーパークラスの呼び出し
	public void printDate() {
		super.printDate();
	}
//	 動物名：名前
	public void date1(String name) {
		
		this.name = name;
	}
	// 体長：〇m
	public void date2(double length) {
		
		this.length = length;
	}
	// 速度：△km/h
	public void date3(int speed) {
		
		this.speed = speed;
	}
//	 学名：種類
	public void date4(String type) {
		
		this.type = type;
	}
}
/*
 
 ・コンストラクタ
 ・super()
 ・protected
 ・抽象メソッド
 ・抽象クラス
 ・オブジェクト指向
 ・クラスとインスタンス
 
コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50	←これをコンソールで入力すると下のものが一期に出力されるようになる
	
コンソール出力結果
	
コンソールに文字を入力してください
動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/