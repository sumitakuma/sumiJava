package lesson22EX;


import java.util.Objects;

import lesson22Pro.Processing;


public class Execution {
	
	public static void main(String[] args) {
		
		// Processingフィールドの呼び出し＆Proに代入
		Processing Pro = new Processing();
		
		// Processing(String)フィールドの呼び出し＆Timeに代入
		Processing Time = new Processing();
		
		// こんにちは！ここは日本です！
		if (Objects.nonNull(Pro)) {
			System.out.println(Pro.hello + "ここは" +Pro.country + "です！");
		} 
		
		// この寿司はうまい
		if (Objects.nonNull(Pro)) {
			System.out.println("この" + Pro.food + "うまい");
		}
	
		// 寿司は和食です
		if (Objects.nonNull(Pro)) {
			System.out.println(Pro.food + "は" + Pro.type + "です");
		}
			
		// 今の現在日時は2023/03/09 10:23:39です
		if (Objects.nonNull(Pro)) {
			System.out.println("今の現在日時は" + Time.date2 + "です");
		}
	}
}