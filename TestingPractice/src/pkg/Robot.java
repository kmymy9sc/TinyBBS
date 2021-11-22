package pkg;

//9 × 9 マスの盤面上を移動するロボットを表現する
//盤の左下のマスを座標(0, 0)とする
//	protected final int boardSize = 9;  盤のサイズ（x:0~8, y:0~8）
//	protected int x; 現在位置のx座標
//	protected int y; 現在位置のy座標
public class Robot {

	protected final int boardSize;
	protected int x;
	protected int y;

	public Robot() {
		this.boardSize = 9;
		this.x = 0;
		this.y = 0;
	}

	public boolean replace(int x, int y) {
		//いずれかの引数の座標が盤の中に収まらない場合は、
		//x,yとも座標を変更せず、falseを返すように実装したい（要修正）
		this.x = x;
		this.y = y;
		return true;
	}

	public void move(int moveX, int moveY) {
		//盤の端から出た場合は、反対の端から出現するように実装したい（修正が必要）
		//例えば、(7, 1)からx方向に+3移動した場合、8,0,1と動いて(1, 1)に移動する
		//y方向についても同様
		this.x += moveX;
		this.y += moveY;
	}

	public String getLocationString() {
		return "("+this.x+","+this.y+")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}



}
