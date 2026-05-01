/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * NegativeHeightException.java
 *
 */
package chap5.s1.q3.standard;

// Exceptionクラスを継承するNegativeHeightExceptionクラスを定義する。
public class NegativeHeightException extends Exception {

	// エラーメッセージを引数に受け取り、スーパークラスから継承したメッセージに設定するコンストラクタを定義する。
	public NegativeHeightException(String message) {
		// 引数を指定してスーパークラスのコンストラクタを呼び出す。
		super(message);
	}

}
