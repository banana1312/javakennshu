/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */
package chap5.s1.q5.standard;

import util.StandardInput;

public class StartUp {

	public static void main(String[] args) {

		// 1.tryブロックを開始する。


			// ShoppingCartオブジェクトを生成する。
			ShoppingCart sc = new ShoppingCart();

			// 商品を3つ追加する。
			sc.addItem(new Item("1", "Jaw-dropping chocolate", 500));
			sc.addItem(new Item("2", "Spicy Tuna Sandwitches", 1000));
			sc.addItem(new Item("3", "Tiger Shrimp Cocktail", 2500));

			// 新たな商品を1つ追加する。
			System.out.println("【商品登録】");

			// 商品コードを入力する。
			System.out.print("商品コード: ");
			String itemCode = StandardInput.readString();

			// 商品名を入力する。
			System.out.print("商品名: ");
			String itemName = StandardInput.readString();

			// 商品単価を入力する。
			System.out.print("商品単価: ");
			int itemPrice = StandardInput.readInt();
			Item newItem = new Item(itemCode, itemName, itemPrice);
			sc.addItem(newItem);

			System.out.println();
			System.out.println("　以下のとおり商品情報を登録しました。");
			System.out.println();

			// 商品の情報を表示する。
			newItem.showInfo();

		// 2.ItemInvalidExceptionをキャッチして処理するcatchブロックを記述する。


			// エラーメッセージを表示する。


	}
}
