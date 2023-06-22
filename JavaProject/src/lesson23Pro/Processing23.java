package lesson23Pro;

public class Processing23 {

	// フィールド
	private String animal;
	private double bodyLength;
	private int speed;
	
	// アクセサメソッド
	
	// ライオンのゲッター
	public String getAnimal() {
		return animal;
	}
	
	// ライオンのセッター
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	// 体長のゲッター
	public double getBodyLength() {
		return bodyLength;
	}
	// 体長のセッター
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	// 速度のゲッター
	public int getSpeed() {
		return speed;
	}
	
	// 速度のセッター
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
/*

※thisとsetterとgetterとフィールドを使ってください

動物名：ライオン
体長：2.1m
速度：80km/h

*/