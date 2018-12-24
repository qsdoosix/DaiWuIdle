package main.java;

import main.java.Constants.ClanType;
import main.java.Constants.WGType;

public class AttackWG extends WuGong {
	
	protected float range;
	protected float damage;
	
	public AttackWG(String nam, char lvl, short dif, WGType typ, ClanType cla, short cos,short cd,float rng,float dmg) {
		super(nam, lvl, dif, typ, cla, cos, cd);
		range=rng;
		damage=dmg;
	}
	public float getrange() {
		return range;
	}
	public float getdamage() {
		return damage;
	}

}
