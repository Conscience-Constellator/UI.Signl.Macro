package Macro;

import java.awt.*;

public class Mous_Of extends But_Havr
{
	public Mous_Of(int Butg){super(Butg);}

	@Override public void Run(Robot Rob){Rob.mouseRelease(Butg);}
}