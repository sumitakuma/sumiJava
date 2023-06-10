package basicClass;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	public static void main(String[] args) {
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog name = new Dog("Sara");
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog number = new Dog(1);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 現在日時を取得
		LocalDateTime date1 = LocalDateTime.now();
		
		// 表示形式を指定
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		
		// 現在日時を表示形式にはめ込み、変数に代入
		String date2 = dtf.format(date1);
		
		// yyyy-MM-dd H:m:s　表示の現在日時
		System.out.println(date2);
	}
}
