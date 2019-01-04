package main.java;

import main.java.Constants.*;

public abstract class WuGong {
	
	protected short ID;
	protected String name;
	protected short level;
	protected short diffculty;
	protected WGType Type;//�书������
	protected ClanType Clan;//����������
	protected WG_Special[] special;
	protected short[][] special_value; 
	protected short[] cost;
	protected short cooldown;
	private short cooldowntimer;
	protected short casttime;
	protected short[] base_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//ѧϰ�书�Ļ������󣬴ﵽ����50%����
	protected short[] max_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//�书�ﵽ��ʩչ�����󣬴ﵽ��100%����
	protected short[] extra_bonus = new short[Constants.NUM_TIANYUAN];//���书Ч���ж���ӳɵ�����
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
		s+="\n��������:"+Constants.ClanToString(Clan);
		s+="\n����:"+Constants.WGTToString(Type);
		s+="\n�����Ѷ�: "+ diffculty;
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