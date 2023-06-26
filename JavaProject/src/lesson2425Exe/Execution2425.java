package lesson2425Exe;

import java.util.Objects;
import java.util.Scanner;

import lesson2425Pro.Processing2425;

public class Execution2425 {

	public static void main(String[] args) {
		
		// 名前を入力するためのスキャナー
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		
		// フィールドProcessing2425をuserに変換
		Processing2425 user = new Processing2425();
		// フィールドProcessing2425をnumberに変換
		Processing2425 number = new Processing2425();
		// 乱数を0～999の範囲で設定
		number.setNum(1000);
		
		// 出力
		if (Objects.nonNull(user)) {
			System.out.println(user.hello + "「" + userName + "」さん");
			System.out.println(user.status);
			System.out.println(user.hitPoint + number.getNum());
			System.out.println(user.magical + number.getNum());
			System.out.println(user.attack + number.getNum());
			System.out.println(user.speed + number.getNum());
			System.out.println(user.defense + number.getNum() + "\n");
			System.out.println(user.shout);
		}
	}
}
/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/