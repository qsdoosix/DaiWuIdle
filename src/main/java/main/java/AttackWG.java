package main.java;

import main.java.Constants.ClanType;
import main.java.Constants.WGType;
import main.java.Constants.WG_Special;
import main.java.Constants.WPType;

public class AttackWG extends WuGong {

	protected WPType Weapon;//ʹ��ʲô�����ͷ�
	protected float range;
	protected float damage;
	
	public AttackWG(short i,String n, short lv, short dif, WGType WT, ClanType CT, WG_Special[] SP,short[][] sv, short[] cos, short cd, short ct, short[] br, short[] mr, short[] eb, float rng, float dmg) {
		super(i,n, lv, dif, WT, CT, SP,sv, cos,  ct,  br,  mr,  eb);
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
