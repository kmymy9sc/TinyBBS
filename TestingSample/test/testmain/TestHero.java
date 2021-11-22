package testmain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Hero;
import main.Slime;

class TestHero {
	Hero h;
	Slime s;
	
	@BeforeEach
	void prepare() {
		this.h = new Hero("Taro", 100);
		this.s = new Slime("slime", 50);
	}
	
	@Test
	void testAttack() {
		h.attack(s);
		assertEquals(40, s.getHp());
	}
	
	@Test
	@DisplayName("100ダメ受けた")
	void testDamage100() {
		h.damage(100);
		assertEquals(0, h.getHp());
	}
	
	@Test
	@DisplayName("正のダメージ")
	void testDamageTrue() {
		assertTrue( h.damage(100) );
	}
	
	@Test
	@DisplayName("負のダメージ")
	void testDamageFalse() {
		assertFalse( h.damage(-1) );
	}
	
	

}
