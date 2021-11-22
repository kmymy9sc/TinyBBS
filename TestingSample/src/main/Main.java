package main;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("ゆうしゃ", 100);
        //SwordHeroをnewしてhero2に代入する．引数として与える名前，hp, 剣攻撃力は適当でよい
        //SwordHero hero2
        Slime slime = new Slime("スライム", 100);
        
        //hero2の各メソッドを呼び出すように改造
        hero1.attack(slime);
        
        slime.attack(hero1);
        slime.heal();
        
        hero1.heroBlast(slime);
    }
    
}
