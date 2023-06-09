package lesson17_18;
import java.util.Arrays;
import java.util.Random;

public class Curriculum1_18 {
	//------------------------------------------------------------------------------------------------------------------
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	// 引数文字列型(String)と整数型(int)
	static void printPrice(String text,int text2) {
		System.out.println(text + text2);
	}
	//------------------------------------------------------------------------------------------------------------------
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// 乗算する値をaとbとする
	static int pow(int a,int b) {
		// a,bの乗算をpowIntに代入
		int powInt = a * b;
		// returnで呼び出し元に値を返す
		System.out.println(powInt);
		return powInt;
	}
	//------------------------------------------------------------------------------------------------------------------
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// 引数に整数int[]を挿入。受け取った値を順番に→拡張for文
	static void printArray(int[] arr) {
		// 配列を順番に出力。
		for(int i : arr) {
			System.out.println(i);
		}
	}
	//------------------------------------------------------------------------------------------------------------------
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// 小数doubleのため、intを全てdoubleに変換
	static double pow(double a,double b) {
		// a,bを加算
		double sum = a + b;
		System.out.println(sum);
		return sum;
	}
	//------------------------------------------------------------------------------------------------------------------
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して、格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	static int[] random(int nums) {
		// 引数を配列に代入
		int[] rand = new int[nums];
			// 戻り値未満の回数分ランダムに数値を出力
			for(int r = 0; r < nums; r++) {
				// ランダムな数字を1～100の中で出力
				Random R = new Random();
				rand[r] = R.nextInt(100) + 1;
				System.out.println(rand[r]);
			}
		return rand;
	}
	//------------------------------------------------------------------------------------------------------------------
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// 小数点以下(= double、%〇f)
	// ()内にrandomの戻り値numを受け取らせ、その配列の要素の平均値を出力するメソッド作成
	static double average(int[] r) {
		// Arraysを使って配列の要素の平均値を取得
		double average = Arrays.stream(r).average().getAsDouble();
		System.out.println(average);
		return average;
	}
	//------------------------------------------------------------------------------------------------------------------
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	static boolean isAbove(double nums) {
		// 戻り値が50以上である条件
		return (nums >= 50);
	}
	//------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		
		//--------------------------------------------------------------------------------------------------------------
		// Q1 文字列型と整数型の引数で「Hello JavaSE 11」を出力
		printPrice("Hello JavaSE",11);
		
		//--------------------------------------------------------------------------------------------------------------
		// Q2 引数に配置した値同士を乗算出力,ここでは、2×5とする
		pow(2,5);
		
		//--------------------------------------------------------------------------------------------------------------
		// Q3 引数として整数配列を渡し、受け取った値を順番に出力
		int[] theArray = {1,2,3,4,5};
		printArray(theArray);
		
		//--------------------------------------------------------------------------------------------------------------
		// Q4 Q2をオーバーロード(ここではpow()になる)、引数を小数に変更(double)化
		pow(2.0,5.0);
		
		//--------------------------------------------------------------------------------------------------------------
		// Q5 1から100までの値をランダムに出力。Q6に繋げるために、配列Rに代入しておく
		int[] R = random(2);
		
		//--------------------------------------------------------------------------------------------------------------
		// Q6 Q5で作成した要素の平均値。Q７に繋げるために、整数を小数点化する
		double A = average(R);
		
		//--------------------------------------------------------------------------------------------------------------
		// Q7 受け取った値が50以上ならばtrue、50未満ならばfalse出力
		System.out.println(isAbove(A));
		//--------------------------------------------------------------------------------------------------------------
	}
}