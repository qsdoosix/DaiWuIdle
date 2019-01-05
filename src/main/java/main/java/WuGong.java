package main.java;

import main.java.Constants.*;

public abstract class WuGong {
	
	protected short ID;//�书�ı��
	protected String name;//�书����
	protected short level;//�书�ȼ�
	protected short diffculty;//�书�Ѷ�
	protected WGType Type;//�书������
	protected ClanType Clan;//����������
	protected WG_Special[] special;//�书����
	protected short[][] special_value; //�书���Ե���ֵ
	protected short[] cost;//ʩչ�书�Ļ��ѣ�����/������
	protected short casttime;//ʩչ��Ҫ��ʱ��
	protected short[] base_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//ѧϰ�书�Ļ������󣬴ﵽ����50%����
	protected short[] max_requirement = new short[Constants.NUM_ATTRIBUTE+Constants.NUM_WGType];//�书�ﵽ��ʩչ�����󣬴ﵽ��100%����
	protected short[] extra_bonus = new short[Constants.NUM_TIANYUAN];//���书Ч���ж���ӳɵ�����
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
	public boolean can_study(Actor a) {//�Ƿ����ѧϰ����书
		for(int i =0;i<Constants.NUM_ATTRIBUTE;i++) {
			//��Ϊ����Class��ûд����ʱ����
		}
		for(int i = 0;i<Constants.NUM_WGType;i++) {
			
		}
		return true;
	}
}