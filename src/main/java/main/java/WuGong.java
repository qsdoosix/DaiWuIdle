package main.java;

import main.java.Constants.*;

public abstract class WuGong {
	
	protected short ID;
	protected String name;
	protected short level;
	protected short diffculty;
	protected WGType Type;//武功的种类
	protected ClanType Clan;//所属的门派
	protected WG_Special[] special;
	protected short[][] special_value; 
	protected short[] cost;
	protected short cooldown;
	private short cooldowntimer;
	protected short casttime;
	protected short[] base_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//学习武功的基本需求，达到即有50%发挥
	protected short[] max_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//武功达到满施展的需求，达到有100%发挥
	protected short[] extra_bonus = new short[Constants.NUM_TIANYUAN];//对武功效果有额外加成的属性
	public WuGong(short i,String n, short lv, short dif, WGType WT, ClanType CT, WG_Special[] SP,short[][] sv, short[] cos, short cd, short ct, short[] br, short[] mr, short[] eb) {
		ID=i;
		name=n;
		level=lv;
		diffculty=dif;
		Type=WT;
		Clan=CT;
		special=SP;
		special_value=sv;
		cost=cos;
		cooldown=cd;
		casttime=ct;
		base_requirement=br;
		max_requirement=mr;
		extra_bonus=eb;
	}
	
	public String toString() {
		String s = "";
		s+=Constants.LevelToString(level);
		s+="\n"+name;
		s+="\n所属门派:"+Constants.ClanToString(Clan);
		s+="\n分类:"+Constants.WGTToString(Type);
		s+="\n基础难度: "+ diffculty;
		s+="\n";
		return s;
	}
	
	public String getname() {
		return name;
	}
	public short getlv() {
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
	public short[] getCost() {
		return cost;
	}
	public short getCD() {
		return cooldown;
	}
	public short getCT() {
		return casttime;
	}
	public short[] getBaseRequirement(){
		return base_requirement;
	}
	public short[] getBonusRequirement(){
		return max_requirement;
	}
}