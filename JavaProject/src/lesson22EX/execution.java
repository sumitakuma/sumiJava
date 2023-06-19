package lesson22EX;

import lesson22Pro.processing;

public class execution {
	
	public static void main(String[] args) {
		
		processing Pro = new processing();
		processing Time = new processing();
	
		System.out.println(Pro.hello + "ここは" +Pro.country + "です！");
		System.out.println("この" + Pro.food + "うまい");
		System.out.println(Pro.food + "は" + Pro.type + "です");
		System.out.println("今の現在日時は" + Time.date2 + "です");
	}
}
/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

*/