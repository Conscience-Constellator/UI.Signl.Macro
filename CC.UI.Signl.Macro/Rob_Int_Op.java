package Macro;

import java.awt.*;

public interface Rob_Int_Op extends Rob_In_Op<Integer>
{
	void Op(Robot Rob,int Int);
		default void Op(Robot Rob,Integer Int){Op(Rob,Int);}
		default void Hold_Prs(Robot Rob,int... List){for(int Int:List){Op(Rob,Int);}}
}