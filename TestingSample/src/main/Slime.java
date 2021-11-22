/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Tanaka
 */
public class Slime {

    //継承先のクラスからアクセスするため、privateの代わりにprotectedを使う。
    //privateはそのクラス内からしかアクセスできないが、protectedなら継承先からもアクセスできる。
    protected String name;
    protected int hp;

    //今回は、空のコンストラクタはあえて書かない
    //必ず名前とhpをセットする必要があるため
    //public Hero() {
    //}
    public Slime(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //slimeの攻撃力は8とする

    public boolean attack(Hero hero) {
    	if(hero == null) return false;
        System.out.println(this.name + "は" + hero.getName() + "に8ダメージを与えた。");
        System.out.println();
        hero.damage(8);//攻撃対象に10ダメージ
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

    //回復するメソッド
    public void heal() {
        this.hp += 30;
        System.out.print(this.name + "は回復した。");
        System.out.println("残りhpは" + this.hp + "になった。");
        System.out.println();
    }

    //以下，setterとgetter
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
