package j4_02;

/**----------------------------------------------------------------------*
 *■■■Mainクラス■■■
 *概要：メイン（ユーザーの情報抽出）
 *----------------------------------------------------------------------**/
public class Sel_Main {
	public static void main (String[] args) {

		//ビジネスロジック（ユーザーの情報抽出）クラスのインスタンス化＆メソッド起動
		Sel_BusinessLogic blSel = new Sel_BusinessLogic();
		blSel.extractAll();

	}
}
