package curriculum_B;


import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Qes1_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		問７）
//		N人の生徒の成績を管理するプログラムを下記条件で作成してください
//		・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
//		・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
//		・このプログラムの実行は必ず1回以上行われるようにしてください
//		・出力例を参考にプログラミングを作成してください

//		入力・出力例
//		生徒の人数を入力してください（2以上）: 2
//		1人目の『英語』の点数を入力してください :10
//		1人目の『数学』の点数を入力してください :10
//		1人目の『理科』の点数を入力してください :10
//		1人目の『社会』の点数を入力してください :10

//		2人目の『英語』の点数を入力してください :10
//		2人目の『数学』の点数を入力してください :10
//		2人目の『理科』の点数を入力してください :10
//		2人目の『社会』の点数を入力してください :10

//		1人目の平均点は10.00点です。
//		2人目の平均点は10.00点です。

//		英語の平均点は10.00点です。
//		数学の平均点は10.00点です。
//		理科の平均点は10.00点です。
//		社会の平均点は10.00点です。
		
//		全体の平均点は10.00点です。

		//subject[0]英語、[1]数学、[2]理科、[3]社会
		String[] subject = {"英語","数学","理科","社会"};
		
		
			
		//入力内容をスキャン
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("生徒の人数を入力してください (2以上) :");
		
		
		//入力された人数を格納
		int peapole = scanner.nextInt();
		
		System.out.println();
		
		//共通の文章をtext1に代入
		String text1 = "』の点数を入力してください : ";
		
		//プリミティブ型に対応するラッパークラスとして、intgerを型指定
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		ArrayList<Integer> D = new ArrayList<Integer>();
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//上限が存在しないので、入力された人数に+１をした変数を作成し代用
		int peapole2 = peapole + 1;
		
		
		//個人の点数を表示
		for(int i =1; i < peapole2; i++) {
			
			//英語
			System.out.print(i + "人目の『" + subject[0] + text1);
			//入力された点数を格納
			A.add(scanner.nextInt());
			
			//数学
			System.out.print(i + "人目の『" + subject[1] + text1);
			//入力された点数を格納
			B.add(scanner.nextInt());
		
			//理科
			System.out.print(i + "人目の『" + subject[2] + text1);
			//入力された点数を格納
			C.add(scanner.nextInt());
		
			//社会
			System.out.print(i + "人目の『" + subject[3] + text1);
			//入力された点数を格納
			D.add(scanner.nextInt());
			System.out.println();
			
			
		}
		
		
		//個人の4科目の点数の平均点
		for(int i =0; i < peapole; i++) {
			
			int ave = (A.get(i) + B.get(i) + C.get(i) + D.get(i)) / 4;
			
			System.out.println(i+1 + "人目の平均点は" + ave + "点です。");
		}
		
		System.out.println();
		
		
		
		//数値の基本的な統計情報を取得（IntSummaryStatisticsクラス、getAverageメソッド、getSumメソッド）
		
		//mapToInt　(入力したクラスに用意されたメソッドをStreamで指定した引数に実行)
		
		//summaryStatistics　(要約統計。最大値・最小値・平均等を計算できる)
		
		//intValue　(intに変換したいintgerの変数)
		
		
		
		//英語の平均点
		IntSummaryStatistics aveE = A.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
		
		System.out.println(subject[0] + "の平均点は" + aveE.getAverage() + "点です。");
		
		
		//数学の平均点
		IntSummaryStatistics aveS = B.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
		
		System.out.println(subject[1] + "の平均点は" + aveS.getAverage() + "点です。");
		
		
		//理科の平均点
		IntSummaryStatistics aveR = C.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
	
		System.out.println(subject[2] + "の平均点は" + aveR.getAverage() + "点です。");
		
		
		//社会の平均点
		IntSummaryStatistics aveY = D.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
		
		System.out.println(subject[3] + "の平均点は" + aveY.getAverage() + "点です。");
		System.out.println();
		
		
		//全体の平均点
		long aveZ = (aveE.getSum() + aveS.getSum() + aveR.getSum() + aveY.getSum()) / peapole;
		System.out.println("全体の平均点は" + aveZ + "点です。");
		
		
	}

}
