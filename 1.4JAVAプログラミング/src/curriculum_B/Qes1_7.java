package curriculum_B;


import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Qes1_7 {

	public static void main(String[] args) {

		// -----------------------------------------------------------------------------------------------------------------------------------

		// 問７）
		// N人の生徒の成績を管理するプログラムを下記条件で作成してください
		// ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
		// ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
		// ・このプログラムの実行は必ず1回以上行われるようにしてください
		// ・出力例を参考にプログラミングを作成してください

		// 入力・出力例
		// 生徒の人数を入力してください（2以上）: 2
		// 1人目の『英語』の点数を入力してください :10
		// 1人目の『数学』の点数を入力してください :10
		// 1人目の『理科』の点数を入力してください :10
		// 1人目の『社会』の点数を入力してください :10

		// 2人目の『英語』の点数を入力してください :10
		// 2人目の『数学』の点数を入力してください :10
		// 2人目の『理科』の点数を入力してください :10
		// 2人目の『社会』の点数を入力してください :10

		// 1人目の平均点は10.00点です。
		// 2人目の平均点は10.00点です。

		// 英語の平均点は10.00点です。
		// 数学の平均点は10.00点です。
		// 理科の平均点は10.00点です。
		// 社会の平均点は10.00点です。

		// 全体の平均点は10.00点です。

		// -----------------------------------------------------------------------------------------------------------------------------------

		// subject[0]英語、[1]数学、[2]理科、[3]社会
		String[] subjects = {"英語","数学","理科","社会"};



		// 入力内容をスキャン
		Scanner scanner = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください (2以上) :");


		// 入力された人数を格納
		int people = scanner.nextInt();

		System.out.println();

		// 共通の文章をtext0・1に代入
		String text0 = "人目の『";
		String text1 = "』の点数を入力してください : ";

		// プリミティブ型に対応するラッパークラスとして、intgerを型指定
		ArrayList<Integer> English = new ArrayList<Integer>();
		ArrayList<Integer> Math = new ArrayList<Integer>();
		ArrayList<Integer> Science = new ArrayList<Integer>();
		ArrayList<Integer> Society= new ArrayList<Integer>();




		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// 上限が存在しないので、入力された人数に+１をした変数を作成し代用
		int peapole2 = people + 1;

		
		// 個人の点数を表示
		for(int i =1; i < peapole2; i++) {

			// 英語
			System.out.print(i + text0 + subjects[0] + text1);
			//入力された点数を格納
			English.add(scanner.nextInt());

			// 数学
			System.out.print(i + text0 + subjects[1] + text1);
			//入力された点数を格納
			Math.add(scanner.nextInt());

			// 理科
			System.out.print(i + text0 + subjects[2] + text1);
			//入力された点数を格納
			Science.add(scanner.nextInt());

			// 社会
			System.out.print(i + text0 + subjects[3] + text1);
			// 入力された点数を格納
			Society.add(scanner.nextInt());
			System.out.println();


		}
		// スキャナーを閉じる
		scanner.close();
		

		// 個人の4科目の点数の平均点
		for(int i =0; i < people; i++) {

			// 小数点以下を表示するためdouble型
			double ave = (English.get(i) + Math.get(i) + Science.get(i) + Society.get(i)) / 4;



			// 個人の平均点,小数点第二位まで表示
			System.out.println(i+1 + "人目の平均点は" + (String.format("%.2f", ave)) + "点です。" + "\n");
		}


		// 数値の基本的な統計情報を取得（IntSummaryStatisticsクラス、getAverageメソッド、getSumメソッド）

		// mapToInt　(入力したクラスに用意されたメソッドをStreamで指定した引数に実行)

		// summaryStatistics　(要約統計。最大値・最小値・平均等を計算できる)

		// intValue　(intに変換したいintgerの変数)


		// 英語の平均点,小数点第二位まで表示
		IntSummaryStatistics aveE = English.stream()
				.mapToInt(Integer::intValue)
				.summaryStatistics();

		System.out.println(subjects[0] + "の平均点は" + (String.format("%.2f", aveE.getAverage())) + "点です。" + "\n");


		// 数学の平均点,小数点第二位まで表示
		IntSummaryStatistics aveS = Math.stream()
				.mapToInt(Integer::intValue)
				.summaryStatistics();

		System.out.println(subjects[1] + "の平均点は" + (String.format("%.2f", aveS.getAverage())) + "点です。" + "\n");


		// 理科の平均点,小数点第二位まで表示
		IntSummaryStatistics aveR = Science.stream()
				.mapToInt(Integer::intValue)
				.summaryStatistics();

		System.out.println(subjects[2] + "の平均点は" + (String.format("%.2f", aveR.getAverage())) + "点です。" + "\n");


		// 社会の平均点,小数点第二位まで表示
		IntSummaryStatistics aveY = Society.stream()
				.mapToInt(Integer::intValue)
				.summaryStatistics();

		System.out.println(subjects[3] + "の平均点は" + (String.format("%.2f", aveY.getAverage())) + "点です。" + "\n");
		

		// 全体の平均点,小数点第二位まで表示
		System.out.println("全体の平均点は" + (String.format("%.2f",(aveE.getAverage() + aveS.getAverage() + aveR.getAverage() + aveY.getAverage()) / 4)) + "点です。" + "\n");


	}

}
