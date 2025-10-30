package Macro;

import java.awt.*;

public interface Rob_In_Op<In>
{
	void Op(Robot Rob,In In);
		default Op Fil_In(In In){return (Rob)->{Op(Rob,In);};}
		default void Op(Robot Rob,In... List){for(In In:List){Op(Rob,In);}}
}