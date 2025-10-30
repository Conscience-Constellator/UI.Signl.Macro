package Macro;

import java.awt.*;

public class Ke_Of extends But_Havr
{
	public Ke_Of(int Butg){super(Butg);}

	@Override public void Run(Robot Rob){Rob.keyRelease(Butg);}
}