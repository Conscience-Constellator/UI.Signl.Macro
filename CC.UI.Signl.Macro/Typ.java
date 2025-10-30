package Macro;

import CC.Util.IO.Point_Out;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Typ implements Op
{
	public Typ(Point_Out<String> Sorc){this.Sorc=Sorc;}

	public Point_Out<String> Sorc;
	public static void Typ_Chr(Robot Rob,char Chr,int Dl)
	{
		int Cod=KeyEvent.getExtendedKeyCodeForChar(Chr);
		if(Cod==KeyEvent.CHAR_UNDEFINED){throw new RuntimeException("Key code not found for character \""+Chr+"\"");}
		Rob.keyPress(Cod);
		Rob.delay(Dl);
		Rob.keyRelease(Cod);
		Rob.delay(Dl);
	}
	public static void Typ_String(Robot Rob,String input,int Dl)
	{
		try{for(char Chr:input.toCharArray()){Typ_Chr(Rob,Chr,Dl);}}
		catch(Exception Xeptin){Xeptin.printStackTrace();}
	}
	@Override public void Run(Robot Rob){Typ_String(Rob,Sorc.Point_Out(),20);}
}