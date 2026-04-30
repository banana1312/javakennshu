/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StandardInput.java
 *
 */
package util;

import java.util.Scanner;

/**
 * StandardInputクラス
 *
 * 標準入力機能を提供するクラスです。
 *
 */
public class StandardInput {

	static Scanner sc = new Scanner(System.in);

	/**
	 *
	 * @return int型の入力値を返却します。
	 */
	public static int readInt() {
		return sc.nextInt();
	}

	/**
	 *
	 * @return Stringクラスの入力値を返却します。
	 */
	public static String readString() {
		return sc.nextLine();
	}

	/**
	 *
	 * @return double型の入力値を返却します。
	 */
	public static double readDouble() {
		return sc.nextDouble();
	}
}
