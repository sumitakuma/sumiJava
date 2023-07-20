package lesson27Exe;

import java.util.HashMap;
import java.util.Scanner;

import lesson27Pro.Processing27;

public class Execution27 {
	public static void main(String[] args) {

		// サブクラスをインスタンス化
		Processing27 pro = new Processing27();

		// スーパーメソッドで作成したものをサブクラスを通じて呼び出し
		pro.printDate();

		// デミリタの大枠としてカンマを変数に代入
		String regex = ",";

		// スキャナー
		Scanner scanner = new Scanner(System.in);

		// 配列に大枠デミリタを挿入
		String[] sc = scanner.next().split(regex);

		scanner.close();

		// 連想配列（動物名, 学名）
		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("ライオン", "パンテラ レオ");

		hmap.put("ゾウ", "ロキソドンタ・サイクロティス");

		hmap.put("パンダ", "アイルロポダ・メラノレウカ");

		hmap.put("チンパンジー", "パン・トゥログロディテス");

		hmap.put("シマウマ", "チャップマンシマウマ");

		// for文、大枠デミリタを最大値として
		for (int i = 0; i < sc.length; i++) {

			// 小枠デミリタにコロンを変数に代入
			String[] animal = sc[i].split(":");

			System.out.println("動物名：" + animal[0]);

			System.out.println("体長：" + animal[1] + "m");

			System.out.println( "速度：" + animal[2] + "km/h");

			// 連想配列に設置した動物名以外が入力された時「不明」と出力されるよう式を変数に代入
			String type = hmap.get(animal[0]) != null ?  hmap.get(animal[0]) : "不明";

			System.out.println( "学名：" + type + "\n");
		}
	}
}
/*
ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
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