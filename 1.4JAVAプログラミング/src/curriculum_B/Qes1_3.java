package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問１）if文、else、else if、比較・論理・条件演算子、三項演算子
//		ログイン時の入力チェックシステムを下記条件で作成してください
//		・コンソールにユーザー名を入力できるようにしてください
		
		//コンソールへの入力を受け取るために、Scannerというライブラリ
		Scanner scanner = new Scanner(System.in);
		
		//入力した内容を1行取得
		String line = scanner.nextLine();
		
		//入力した内容を出力
		System.out.println(line);
		
		
//		・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		
		//入力した内容の文字数を変数numに代入
		int num = line.length();
		
		//numが１０よりも大きい時に文字を出力
		if (num >10) {
			System.out.println("「名前を10文字以内にしてください」");
			return;
		} else {
			System.out.println();
		}
		
		
//		・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
	
		//nullをString型に代入
		String str = null;
		
		//numが1以上または、nullがfalseを条件とし、否定文をのちに出力
		if (num > 0 || str != null) {
			System.out.println();
		} else {
			System.out.println("「名前を入力してください」");
			return;
		}
		
//		問２）if文、else、else if、比較・論理・条件演算子、三項演算子
//		ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		
		//半角英数字
		String alphaNum = "^[A-Za-z0-9]+$";
		//Patternオブジェクト
		Pattern pattern = Pattern.compile(alphaNum);
		//Matchesメソッド
		Matcher matcher = pattern.matcher(line);
		
		//入力された内容が半角英数字の時は非表示、そうでないときは表示
		if (matcher.find()) {
			System.out.println();
		} else  {
			System.out.println("「半角英数字のみで名前を入力してください」");
			return;
		} 
		
//		・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		
		//numが1以上かつ10以下または、nullではない時に表示
		
		System.out.println("「ユーザー名「"+ line +"」を登録しました」");
		

		
		//改行
		System.out.println();
		
		
//		問３）乱数、正規表現
//		じゃんけんのシステムを下記の条件で作成してください
		
//		・じゃんけんに勝つまでループすること
		
//		・一回ごとに自分の手と相手の手を下記の通り出力してください
//			ユーザー名「name」を登録しました(上で処理済み)
//			nameの手は「パー」
//			相手の手は「グー」
		
//		・「0はグー、1：チョキ、2：パー」とすること
	
//		ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください

		
		// じゃんけんの回数を格納する変数
		int janken_num = 0;
		
		
		while(true) {
			
				janken_num++;
				// コンピュータ用に乱数を生成し変数computer_numに格納
				Random rand = new Random();
				
				int computer_num = rand.nextInt(3) + 0;
				
				int user_num = rand.nextInt(3) + 0;
				
				System.out.println("");
				
						
				if (user_num == 0) {
					System.out.println(line + "の手は「グー」");
				}
				else if (user_num == 1) {
					System.out.println(line + "の手は「チョキ」");
				}
				else if (user_num == 2) {
					System.out.println(line + "の手は「パー」");
				}
								
				if (computer_num == 0) {
					System.out.println("相手の手は「グー」");
					System.out.println();
				}
				else if (computer_num == 1) {
					System.out.println("相手の手は「チョキ」");
					System.out.println();
				}
				else if (computer_num == 2) {
					System.out.println("相手の手は「パー」");
					System.out.println();
				}
				
//		・条件分岐の設定
//		・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
//			ユーザー名「name」を登録しました
//			nameの手は「勝ち」
//			相手の手は「負け」
//			やるやん。
//			次は俺にリベンジさせて
				
				if ((user_num == 0) && (computer_num == 1) || ((user_num == 1) && (computer_num == 2) || ((user_num == 2) && (computer_num == 0)))) {
					System.out.println("やるやん");
					System.out.println("次は俺にリベンジさせて");
					
//		じゃんけんを行った回数を表示してください
					System.out.println();
					System.out.println("勝つまでにかかった合計回数は" + janken_num + "回です");
					break;
				}
				
				
				
//		・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
//			ユーザー名「name」を登録しました
//			nameの手は「チョキ」
//			相手の手は「グー」
//			俺の勝ち！
//			負けは次につながるチャンスです！
//			ネバーギブアップ！
				if ((user_num == 1) && (computer_num == 0)){
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
				}
//		・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
//			ユーザー名「name」を登録しました
//			nameの手は「パー」
//			相手の手は「チョキ」
//			俺の勝ち！
//			たかがじゃんけん、そう思ってないですか？
//			それやったら次も、俺が勝ちますよ				
				if ((user_num == 2) && (computer_num == 1)) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				}
//		・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
//			ユーザー名「name」を登録しました
//			nameの手は「グー」
//			相手の手は「パー」
//			俺の勝ち！
//			なんで負けたか、明日まで考えといてください。
//			そしたら何かが見えてくるはずです				
				if ((user_num == 0) && (computer_num == 2)) {
					System.out.println("俺の勝ち");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
//		・あいこの場合、下記が出力されるようにしてください
//			ユーザー名「name」を登録しました
//			nameの手は「あいこ」
//			相手の手は「あいこ」
//			DRAW あいこ もう一回しましょう！				
				if ((user_num == computer_num)) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				}
				
		}
				
	}


}


