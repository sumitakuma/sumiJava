// 実行パッケージ
package lesson2425Exe;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import lesson2425Pro.Processing2425;

public class Execution2425 {

	public static void main(String[] args) {
		
		// 名前を入力するためのスキャナー
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		scanner.close();
		// フィールドProcessing2425をuserに変換
		Processing2425 user = new Processing2425();
		
		user.setHello("こんにちは");
		user.setStatus("ステータス");
		user.setHitPoint("HP：");
		user.setMagical("MP：");
		user.setAttack("攻撃力：");
		user.setSpeed("素早さ：");
		user.setDefence("防御力：");
		user.setShout("さあ冒険に出かけよう！");

		Random rand = new Random();
		// 出力
		if (Objects.nonNull(user)) {
			System.out.println(user.getHello() + " 「" + userName + "」 さん");
			System.out.println(user.getStatus());
			System.out.println(user.getHitPoint() + rand.nextInt(1000));
			System.out.println(user.getMagical() + rand.nextInt(1000));
			System.out.println(user.getAttack() + rand.nextInt(1000));
			System.out.println(user.getSpeed() + rand.nextInt(1000));
			System.out.println(user.getDefence() + rand.nextInt(1000) + "\n");
			System.out.println(user.getShout());
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