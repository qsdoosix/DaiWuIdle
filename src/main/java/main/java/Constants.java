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
		DefenseBreak
	}
	public static final int NUM_ATTRIBUTE = 6;
	public static final int NUM_WGType = 10;
	public static final int NUM_TIANYUAN=6;
}
