// 処理パッケージ
package lesson2425Pro;

import java.util.Random;


//サブクラス & getter setter
public class Processing2425 extends Field {
	
	// ランダム変数
	Random rand = new Random();
	
	// 数値のゲッター
	public int getNum() {
		return num;
	}
	// 数値のセッター & 乱数セット
	public void setNum(int num) {
		this.num = rand.nextInt(1000);
	}
}

// スーパークラス
class Field {
//	protected String name;
	public String hello; // こんにちは
	public String status; // ステータス
	public String hitPoint; // HP
	public String magical; // MP
	public String attack; // 攻撃力
	public String speed; // 素早さ
	public String defense; // 防御力
	protected int num; // 数値
	public String shout; // さあ冒険に出かけよう！
	
	// 引数無しのコンストラクタ
	public Field() {
		this.hello = "こんにちは";
		this.status = "ステータス";
		this.hitPoint = "HP：";
		this.magical = "MP：";
		this.attack = "攻撃力：";
		this.speed = "素早さ：";
		this.defense = "防御力：";
		this.shout = "さあ冒険に出かけよう！";
	}
}
/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/