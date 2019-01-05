package main.java;

import main.java.Constants.*;

public abstract class WuGong {
	
	protected short ID;//武功的编号
	protected String name;//武功名字
	protected short level;//武功等级
	protected short diffculty;//武功难度
	protected WGType Type;//武功的种类
	protected ClanType Clan;//所属的门派
	protected WG_Special[] special;//武功特性
	protected short[][] special_value; //武功特性的数值
	protected short[] cost;//施展武功的花费（架势/提气）
	protected short casttime;//施展需要的时间
	protected short[] base_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//学习武功的基本需求，达到即有50%发挥
	protected short[] max_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//武功达到满施展的需求，达到有100%发挥
	protected short[] extra_bonus = new short[Constants.NUM_TIANYUAN];//对武功效果有额外加成的属性
	public WuGong(short i,String n, short lv, short dif, WGType WT, ClanType CT, WG_Special[] SP,short[][] sv, short[] cos, short ct, short[] br, short[] mr, short[] eb) {
		ID=i;
		name=n;
		level=lv;
		diffculty=dif;
		Type=WT;
		Clan=CT;
		special=SP;
		special_value=sv;
		cost=cos;
		casttime=ct;
		base_requirement=br;
		max_requirement=mr;
		extra_bonus=eb;
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
	public short getCT() {
		return casttime;
	}
	public short[] getBaseRequirement(){
		return base_requirement;
	}
	public short[] getBonusRequirement(){
		return max_requirement;
	}
	public boolean can_study(Actor a) {//是否可以学习这个武功
		for(int i =0;i<Constants.NUM_ATTRIBUTE;i++) {
			//因为人物Class还没写，暂时留空
		}
		for(int i = 0;i<Constants.NUM_WGType;i++) {
			
		}
		return true;
	}
}