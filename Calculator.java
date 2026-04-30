/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Calculator.java
 *
 */
package util;

/**
 * Calculatorクラス
 *
 * 四則演算を実行するクラスです。
 *
 */
public class Calculator {

	/**
	 * 2つの整数の合計を計算する。
	 *
	 * @param 整数1(numX)
	 * @param 整数2(numY)
	 *
	 * @return 合計(numX+numY)
	 *
	 */
	public static int add(int numX, int numY) {
		return numX + numY;
	}

	/**
	 * 2つの整数の差を計算する。
	 *
	 * @param 整数1(numX)
	 * @param 整数2(numY)
	 *
	 * @return 差(numX-numY)
	 */
	public static int subtract(int numX, int numY) {
		return numX - numY;
	}

	/**
	 * 2つの整数の積を計算する。
	 *
	 * @param 整数1(numX)
	 * @param 整数2(numY)
	 *
	 * @return 積(numX*numY)
	 */
	public static int multiply(int numX, int numY) {
		return numX * numY;
	}

	/**
	 * 2つの整数の商を計算する。
	 *
	 * @param 整数1(numX)
	 * @param 整数2(numY)
	 *
	 * @return 商(numX/numY)
	 */
	public static int divide(int numX, int numY) {
		return numX / numY;
	}

	/**
	 * Calculatorクラスに関する情報を表示します。
	 *
	 */
	public static void showInfo() {
		System.out.println("これは、Calculatorクラスです。");
		System.out.println("このクラスの目的は、四則演算を実行することです。");
		System.out.println("このクラスは、以下の４つの演算が実行できます。");
		System.out.println("足し算:add(), 引き算:subtract(),掛け算:multiply(), 割り算:divide()");
	}
}
