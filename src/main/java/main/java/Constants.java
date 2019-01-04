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
	public static final int NUM_ATTRIBUTE = 6;//���������ɣ��������������ǣ�����
	public static final int NUM_WGType = 10;
	public static final int NUM_TIANYUAN=6;
	public static String LevelToString(short i) {
		String s = "Error";
		switch(i) {
		case 10:
			s= "������";
			break;
		case 9:
			s= "�¾�Ʒ";
			break;
		case 8:
			s= "�а�Ʒ";
			break;
		case 7:
			s= "����Ʒ";
			break;
		case 6:
			s= "����Ʒ";
			break;
		case 5:
			s= "����Ʒ";
			break;
		case 4:
			s= "����Ʒ";
			break;
		case 3:
			s= "����Ʒ";
			break;
		case 2:
			s= "����Ʒ";
			break;
		case 1:
			s= "��һƷ";
			break;
		default:
			s="�޴˵ȼ�";
			break;
		}
		return s;
	}
	public static String ClanToString(ClanType C) {
		String s = "Error";
		if(C==ClanType.WuDang) {
			s="�䵱��";
		}else if(C==ClanType.ShaoLin) {
			s="������";
		}else if(C==ClanType.JiangHu) {
			s="����";
		}else {
			s="�޴�����";
		}
		return s;
	}
	public static String WGTToString(WGType w) {
		String s="Error";
		if (w==WGType.Base) {
			s="��������";
		}else if (w==WGType.Attack) {
			s="����";
		}else if (w==WGType.Defense) {
			s="����";
		}else if (w==WGType.Movement) {
			s="�Ṧ";
		}else if (w==WGType.Special) {
			s="����";
		}else {
			s="�޴�����";
		}
		return s;
	}
}
