package Macro;

import CC.Util.IO.Point_Out;
import java.awt.*;

public class Mov implements Op
{
	public Mov(Point_Out<int[]> Loc_Sorc){this.Loc_Sorc=Loc_Sorc;}

	public Point_Out<int[]> Loc_Sorc;
	public static void Mov(Robot Rob,int[] Loc){Rob.mouseMove(Loc[0],Loc[1]);}
	@Override public void Run(Robot Rob){Mov(Rob,Loc_Sorc.Point_Out());}
}