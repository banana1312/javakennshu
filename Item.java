/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Item.java
 *
 */
package chap5.s1.q5.standard;

// 商品クラス
public class Item {

	private String code;		// 商品コード
	private String name;		// 商品名
	private int   price;		// 商品単価

	public Item(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	// 商品の情報を表示するshowInfot()メソッド
	public void showInfo() {
		System.out.println("商品コード: " + code);
		System.out.println("商品名    : " + name);
		System.out.println("商品単価  : " + price);
	}
}
