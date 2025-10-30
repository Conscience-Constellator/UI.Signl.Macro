package Macro;

import java.awt.*;

public class Mous_On extends But_Havr
{
	public Mous_On(int Butg){super(Butg);}

	@Override public void Run(Robot Rob){Rob.mousePress(Butg);}
}