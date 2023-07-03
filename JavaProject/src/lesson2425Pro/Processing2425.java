// 処理パッケージ
package lesson2425Pro;

//サブクラス & getter
public class Processing2425 extends Field {
	
	public Processing2425() {
	}
	
	public void SuperHello() {
		System.out.println(super.getHello());
	}
	
	public void SuperStatus() {
		System.out.println(super.getStatus());
	}
	
	public void SuperHitPoint() {
		System.out.println(super.getHitPoint());
	}
	
	public void SuperMagical() {
		System.out.println(super.getMagical());
	}
	
	public void SuperAttack() {
		System.out.println(super.getAttack());
	}
	
	public void SuperSpeed() {
		System.out.println(super.getSpeed());
	}
	
	public void SuperDefence() {
		System.out.println(super.getDefence());
	}
	
	public void SuperShout() {
		System.out.println(super.getShout());
	}
}

// スーパークラス
// フィールド
class Field {
	private String hello;
	private String status;
	private String hitPoint;
	private String magical;
	private String attack;
	private String speed;
	private String defense;
	private String shout;
	
	// 引数・中身無しコンストラクタ
	Field() {
	}
	
	// 「こんにちは」-----------------------------
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getHello() {
		return hello;
	}
	// -------------------------------------------
	
	// 「ステータス」-----------------------------
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	// -------------------------------------------
	
	// 「HP」-------------------------------------
	public void setHitPoint(String hitPoint) {
		this.hitPoint = hitPoint;
	}
	public String getHitPoint() {
		return hitPoint;
	}
	// -------------------------------------------
	
	// 「MP」-------------------------------------
	public void setMagical(String magical) {
		this.magical = magical;
	}
	public String getMagical() {
		return magical;
	}
	// -------------------------------------------
	
	// 「攻撃力」---------------------------------
	public void setAttack(String attack) {
		this.attack = attack;
	}
	public String getAttack() {
		return attack;
	}
	// -------------------------------------------
	
	// 「素早さ」---------------------------------
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getSpeed() {
		return speed;
	}
	// -------------------------------------------
	
	// 「防御力」---------------------------------
	public void setDefence(String defense) {
		this.defense = defense;
	}
	public String getDefence() {
		return defense;
	}
	// -------------------------------------------
	
	// 「さあ冒険にでかけよう」-------------------
	public void setShout(String shout) {
		this.shout = shout;
	}
	public String getShout() {
		return shout;
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