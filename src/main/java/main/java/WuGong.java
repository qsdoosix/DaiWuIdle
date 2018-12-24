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
	
	public WuGong(String n, char l, short d, WGType t, ClanType c, short co,short cd) {
		 name = n;
		 level=l;
		 diffculty=d;
		 Type=t;
		 Clan=c;
		 cost=co;
		 cooldown=cd;
	}
}
