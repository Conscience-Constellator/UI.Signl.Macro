package Macro;

import java.awt.*;

public class Ke_On extends But_Havr
{
	public Ke_On(int Butg){super(Butg);}

	@Override public void Run(Robot Rob){Rob.keyPress(Butg);}
}