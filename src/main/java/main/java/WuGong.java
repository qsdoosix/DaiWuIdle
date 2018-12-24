package main.java;

import main.java.Constants.ClanType;
import main.java.Constants.WGType;

public abstract class WuGong {
	
	protected String name;
	protected char level;
	protected short diffculty;
	protected WGType Type;//Base,Attack,Defense,Movement,Special
	protected ClanType Clan;//À˘ Ùµƒ√≈≈…
	protected short cost;
	protected short cooldown;
	protected int[][] base_requirement = new int[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType][2];
	protected int[][] bonus_requirement = new int[Constants.NUM_TIANYUAN+Constants.NUM_WGType][2];
	
	public WuGong(String nam, char lvl, short dif, WGType typ, ClanType cla, short cos,short cd) {
		 name = nam;
		 level=lvl;
		 diffculty=dif;
		 Type=typ;
		 Clan=cla;
		 cost=cos;
		 cooldown=cd;
	}
	public String getname() {
		return name;
	}
	public char getlv() {
		return level;
	}
	public short getdif() {
		return diffculty;
	}
	public WGType getType() {
		return Type;
	}
	public ClanType getClan() {
		return Clan;
	}
	public short getCost() {
		return cost;
	}
	public short getCD() {
		return cooldown;
	}
}
