package lesson22Pro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class processing {
	// フィールド変数
	
	// あいさつ
	public String hello;
	// 国
	public String country;
	// 食べ物
	public String food;
	// 種類
	public String type;
	
	public processing() {
		this.hello = "こんにちは！";
		this.country = "日本";
		this.food = "寿司";
		this.type = "和食";
	}
	
	// 現在日時を取得
	LocalDateTime date1 = LocalDateTime.now();
			
	// 表示形式を指定
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
			
	// 現在日時を表示形式にはめ込み、変数に代入
	public String date2 = dtf.format(date1);
	
	public processing(String date2) {
		this.date2 = date2;
	}
}
/*

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。 
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/