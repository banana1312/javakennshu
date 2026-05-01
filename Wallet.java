/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Wallet.java
 *
 */
package chap5.s1.q4.standard;

public class Wallet {

	// メンバ変数
	private String ownerName;
	private int balance;

	// コンストラクタ
	public Wallet(String ownerName, int balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 使う金額を受け取って残高を更新するspendMoney()メソッド
	public void spendMoney(int amount) {

		// 1.引数で受け取った使う金額を表示する。


		// 2.残高が不足している場合は、NotEnoughBalanceExceptionを発生させる。




		// 3.残高を更新する。

	}

	// 財布の情報を表示する。
	public void showWallet() {
		System.out.println();
		System.out.println("＜" + ownerName + "さんの財布です。＞");
		System.out.println("(残金)" + balance + " 円です。");
	}
}
