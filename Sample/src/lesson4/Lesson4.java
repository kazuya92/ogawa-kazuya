package lesson4;

public class Lesson4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1 下記9個をクラス変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		// 	・単精度浮動小数点数型・倍精度浮動小数点数型
		//   	・文字型・文字列型
		//	 	・ブーリアン型 
		byte num2;
		short num3;
		int num4;
		long num5;
		float num6;
		double num7;
		char num8;
		String num9;
		boolean num10;
		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0L;
		num6 = 0.0f;
		num7 = 0.0d;
		num8 = '\u0000';
		num9 = null;
		num10 = false;
		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		num2 = 10;
		// ・バイト型                 10
		num3 = 100;
		// ・短整数型                 100
		num4 = 1000;
		// ・整数型                	 1000
		num5 = 10000L;
		// ・長整数型                 10000
		num6 = 9.5f;
		// ・単精度浮動小数点数型   	 9.5
		num7 = 10.5;
		// ・倍精度浮動小数点数型		 10.5
		num8 = 'a';
		// ・文字型                   a
		num9 = "ハロー";
		// ・文字列型              	 ハロー
		num10 = true;
		// ・ブーリアン型          	 true
		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		short i = 11110;

		System.out.println(i);

		// 20.0

		double m = 20.0;

		System.out.println(m);

		// a ハロー true

		System.out.println(num8 + num9 + num10);

		// 11130.0 数字を全て足す

		System.out.println(num2 + num3 + num4 + num5 + num6 + num7);

		// 10000000000 小数点以外の数字を全てかける

		System.out.println(num2 * num3 * num4 * num5);

		// 0.105 10.5割る100をする

		System.out.println(num7 / num3);

		// -90 10引く100をする

		System.out.println(num2 - num3);
		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		String num = "4"; //20を4
		int num1 = 3; //23を3
		System.out.println("ハローJAVA" + (num + num1)); //出力結果

	}

}
