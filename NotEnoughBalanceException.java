/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * NotEnoughBalanceException.java
 *
 */
package chap5.s1.q4.standard;

// Exceptionを継承するNoEnoughBalanceExceptionクラス
public class NotEnoughBalanceException extends Exception {

	// エラーメッセージを引数に受け取り、スーパークラスから継承したメッセージに設定するコンストラクタ
	public NotEnoughBalanceException(String message) {
		// 引数を指定してスーパークラスのコンストラクタを呼び出す。
		super(message);
	}

}
