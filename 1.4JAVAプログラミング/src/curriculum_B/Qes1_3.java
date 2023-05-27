package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Qes1_3 {

	public static void main(String[] args) {

		// -----------------------------------------------------------------------------------------------------------------------------------

		// 問１）if文、else、else if、比較・論理・条件演算子、三項演算子
		// ログイン時の入力チェックシステムを下記条件で作成してください
		// コンソールにユーザー名を入力できるようにしてください

		// コンソールへの入力を受け取るために、Scannerというライブラリ
		Scanner scanner = new Scanner(System.in);

		// 入力されたユーザーネームを代入
		String userName = scanner.nextLine();
		
		if (!Objects.nonNull(userName)) {
			userName = "";
		} 
		// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		// 入力した内容の文字数を変数numに代入
		int num = userName.length();

		// numが１０よりも大きい時に文字を出力
		if (num >10) {
			System.out.println("「名前を10文字以内にしてください」" + "\n");
			return;
		} else {
			System.out.println();
		}

		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください

		// nullをString型に代入
		String str = null;
		
		// numが1以上または、nullがfalseを条件とし、否定文をのちに出力
		if (num > 0 || Objects.nonNull(str)) {
			System.out.println();
		} else {
			System.out.println("「名前を入力してください」" + "\n");
			return;	
		}
		


		// --------------------------------------------------------------------------------------------------------------------------------------

		// 問２）if文、else、else if、比較・論理・条件演算子、三項演算子
		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください

		// 半角英数字
		String alphaNum = "^[A-Za-z0-9]+$";
		// Patternオブジェクト
		Pattern pattern = Pattern.compile(alphaNum);
		// Matchesメソッド
		Matcher matcher = pattern.matcher(userName);	

		// 入力された内容が半角英数字の時は非表示、そうでないときは表示
		if (matcher.find()) {
			System.out.println();
		} else  {
			System.out.println("「半角英数字のみで名前を入力してください」" + "\n");
			return;
		} 

		// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください

		// numが1以上かつ10以下または、nullではない時に表示
		System.out.println("「ユーザー名「"+ userName +"」を登録しました」" + "\n");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// 問３）乱数、正規表現
		// じゃんけんのシステムを下記の条件で作成してください

		// じゃんけんに勝つまでループすること

		// 一回ごとに自分の手と相手の手を下記の通り出力してください
		// ユーザー名「name」を登録しました(上で処理済み)
		// nameの手は「パー」
		// 相手の手は「グー」

		// 「0はグー、1：チョキ、2：パー」とすること

		// ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください

		// じゃんけんの回数を格納する変数
		int jankenNum = 0;

		// while文の条件式　初期化＆ture変更
		boolean victory = false;
		victory = true;

		// while文の条件式　勝つまでループ
		while(victory) {

			jankenNum++;
			// ジャンケンの手を入力される用
			System.out.println("ジャンケンの手を入力してください");
			// ユーザーの手「0はグー、1：チョキ、2：パー」とすること
			System.out.print("(グー : 0 , チョキ : 1 , パー : 2)" + "\n");

			// ユーザーのじゃんけんの手を格納
			long userJanken = scanner.nextLong();

			// じゃんけんの手を配列に組み込む
			String[] hands = {"グー」", "チョキ」", "パー」"};

			// 共通の文を変数に
			String text0 = "の手は「";

			// ランダム変数
			Random rand = new Random();
			// ユーザーの手を乱数格納
			int user = rand.nextInt(3);
			// コンピュータ用に乱数を生成し変数computer_numに格納
			int computer_num = rand.nextInt(3);

			// ユーザーの手　＆　cpuの手　の表示
			System.out.printf(userName + text0 + hands[user] + "\n" 
					+ "相手" + text0 + hands[computer_num] + "\n");

			// 自分がじゃんけんに勝った場合
			if ((userJanken == 0) && (computer_num == 1) 
					|| ((userJanken == 1) && (computer_num == 2) 
							|| ((userJanken == 2) && (computer_num == 0)))) {

				System.out.println("やるやん" + "\n" + "次は俺にリベンジさせて" + "\n");

				// じゃんけんを行った回数を表示
				System.out.println("勝つまでにかかった合計回数は" + jankenNum + "回です" + "\n");
				break;		

				// 自分がじゃんけんでグーに負けた場合
			} else if ((userJanken == 1) && (computer_num == 0)){

				System.out.println("俺の勝ち！" + "\n" 
						+ "負けは次につながるチャンスです！" + "\n" 
						+ "ネバーギブアップ！" + "\n");

				// 自分がじゃんけんでチョキに負けた場合
			} else if ((userJanken == 2) && (computer_num == 1)) {
				System.out.println("俺の勝ち！" + "\n" 
						+ "たかがじゃんけん、そう思ってないですか？" + "\n" 
						+ "それやったら次も、俺が勝ちますよ" + "\n");

				// 自分がじゃんけんでパーに負けた場合
			} else if ((userJanken == 0) && (computer_num == 2)) {
				System.out.println("俺の勝ち" + "\n" 
						+ "なんで負けたか、明日まで考えといてください。"  + "\n" 
						+ "そしたら何かが見えてくるはずです" + "\n");

				// あいこの場合
			} else if ((userJanken == computer_num)) {
				System.out.println("DRAW あいこ もう一回しましょう！" + "\n");
			}
		}
	}
}