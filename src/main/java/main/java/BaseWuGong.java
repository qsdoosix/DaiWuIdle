package main.java;

import main.java.Constants.ClanType;
import main.java.Constants.WGType;
import main.java.Constants.WPType;

public class BaseWuGong extends WuGong {
	
	protected WPType Weapon;//ʹ��ʲô�����ͷ�
	public BaseWuGong(String n, char l, short d, WGType t, ClanType c, short co, short cd) {
		super(n, l, d, t, c, co, cd);
	}

}
