package curriculum_B;

import java.util.Random;
import java.util.Scanner;



public class Qes1_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		問６）拡張for文・Switch文・条件演算子 ※普通のif文は使用不可
//		入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		
//		・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
//		・例：テレビorディスプレイと受け取った場合〇〇に受け取った値が入る→「〇〇の残り台数は9台です」
//		・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
//		・入力された値は「、」区切りで指定してください
//		・そのほかの値が入力された場合下記を出力されるようにしてください
			//『受け取った値』は指定の商品ではありません
//		・残り台数は0〜11までのランダムな値が出力されるようにしてください

		
		//入力内容をスキャン
		Scanner scanner = new Scanner(System.in);
		
		//入力された内容を取得
		String line = scanner.nextLine();
		
		//乱数
		Random rand = new Random();
		
		
		//配列denkisに商品名を入れる
		String[] denkis = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
		
		//パソコン＝０、冷蔵庫＝１、扇風機＝２、洗濯機＝３、加湿器＝４、テレビ＝５、ティスプレイ＝６、その他商品＝７
		
		//カンマを代入
		String[] nums = line.split("、");
		
		
		//拡張for文
		for(String num : nums) {
			
			//switch文にnums[i]を挿入
			switch(num) {
			
			//パソコンが入力された場合
			case "パソコン":
				System.out.println(denkis[0] + "の残り台数は" + rand.nextInt(12) + "台です");
				break;
				
			//冷蔵庫が入力された場合
			case "冷蔵庫":
				System.out.println(denkis[1] +  "の残り台数は" + rand.nextInt(12)+ "台です");
				break;
				
			//扇風機が入力された場合
			case "扇風機":
				System.out.println(denkis[2] +  "の残り台数は" + rand.nextInt(12) + "台です");
				break;
				
			//洗濯機が入力された場合
			case "洗濯機":
				System.out.println(denkis[3] +  "の残り台数は" + rand.nextInt(12) + "台です");
				break;
				
			//加湿器が入力された場合
			case "加湿器":
				System.out.println(denkis[4] +  "の残り台数は" + rand.nextInt(12) + "台です");
				break;
				
			//テレビが入力された場合
			case "テレビ":
				System.out.println(denkis[5] +  "の残り台数は" + rand.nextInt(12) + "台です");
				break;
				
			//ディスプレイが入力された場合
			case "ディスプレイ":
				System.out.println(denkis[6] +  "の残り台数は" + rand.nextInt(12) + "台です");
				break;
				
			//それ以外の文字が入力された場合
			default:
				System.out.println("『" + num + "』は指定の商品ではありません");
				break;
				}
			
			}
		}
		
		
//		入力例↓↓
//		パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品

//		出力例↓↓
//		パソコンの残り台数は8台です
//		冷蔵庫の残り台数は7台です
//		扇風機の残り台数は7台です
//		洗濯機の残り台数は10台です
//		加湿器の残り台数は3台です
//		テレビの残り台数は9台です
//		ディスプレイの残り台数は2台です
//		『 その他商品 』は指定の商品ではありません

	

}
