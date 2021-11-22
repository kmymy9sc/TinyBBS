package main;

/**
 *
 * @author Tanaka
 */
public class Hero {

    //継承先のクラスからアクセスするため、privateの代わりにprotectedを使う。
    //privateはそのクラス内からしかアクセスできないが、protectedなら継承先からもアクセスできる。
    protected String name;
    protected int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //勇者の通常攻撃
    public boolean attack(Slime slime) {
    	if(slime == null) return false;
        System.out.println(this.name + "は" + slime.name + "に10ダメージを与えた。");
        System.out.println();
        slime.damage(10); //攻撃対象に10ダメージ
        return true;
    }

    //ダメージを受けるメソッド
    public boolean damage(int damage) {
    	if(damage < 0) {
    		System.out.println("damageが負値です。");
    		return false;
    	}
        this.hp -= damage;
        System.out.print(this.name + "は" + damage + "ダメージを受けた。");
        System.out.println("残りhpは" + this.hp + "になった。");
        if (hp <= 0) {
            System.out.println(this.name + "は倒れた。");
        }
        System.out.println();
        return true;
    }

    //Heroが持つ必殺技
    public boolean heroBlast(Slime slime) {
    	if(slime == null) return false;
        System.out.println(this.name + "はヒーローブラストを使った。");
        System.out.println();
        slime.damage(999999);
        return true;
    }
    
    //以下，getterとsetter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
