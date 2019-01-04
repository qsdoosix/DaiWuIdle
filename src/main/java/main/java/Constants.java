package main.java;

public abstract class Constants {
	public enum WGType{
		Base,
		Attack,
		Defense,
		Movement,
		Special
	}
	public enum ClanType{
		JiangHu,
		WuDang,
		ShaoLin
	}
	public enum WG_Special{
		BounceBack,
		CounterAttack,
		SpeedChange,
		SpeedLimit,
		DOT,
		Critical,
		SureHit,
		BreakQi,
		BreakF,
		stack
	}
	public enum WPType{
		Sword
	}
	public static final int NUM_ATTRIBUTE = 6;//臂力，灵巧，身法，内力，体魄，悟性
	public static final int NUM_WGType = 10;
	public static final int NUM_TIANYUAN=6;
	public static String LevelToString(short i) {
		String s = "Error";
		switch(i) {
		case 10:
			s= "不入流";
			break;
		case 9:
			s= "下九品";
			break;
		case 8:
			s= "中八品";
			break;
		case 7:
			s= "上七品";
			break;
		case 6:
			s= "奇六品";
			break;
		case 5:
			s= "秘五品";
			break;
		case 4:
			s= "极四品";
			break;
		case 3:
			s= "超三品";
			break;
		case 2:
			s= "绝二品";
			break;
		case 1:
			s= "神一品";
			break;
		default:
			s="无此等级";
			break;
		}
		return s;
	}
	public static String ClanToString(ClanType C) {
		String s = "Error";
		if(C==ClanType.WuDang) {
			s="武当派";
		}else if(C==ClanType.ShaoLin) {
			s="少林派";
		}else if(C==ClanType.JiangHu) {
			s="江湖";
		}else {
			s="无此门派";
		}
		return s;
	}
	public static String WGTToString(WGType w) {
		String s="Error";
		if (w==WGType.Base) {
			s="基础攻击";
		}else if (w==WGType.Attack) {
			s="进攻";
		}else if (w==WGType.Defense) {
			s="防御";
		}else if (w==WGType.Movement) {
			s="轻功";
		}else if (w==WGType.Special) {
			s="绝技";
		}else {
			s="无此种类";
		}
		return s;
	}
}
