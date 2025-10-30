package Macro;

import CC.UI.Lit.Colr;

import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.Robot;

import static CC.UI.Lit.Colr.Dif_Totl_RGB;

public class Scren_Area
{
	public Scren_Area(int AX,int AY,int BX,int BY){Set_Bound(AX,AY,BX,BY);}

	public int AX,AY,BX,BY;
		public void Set_Bound(int AX,int AY,int BX,int BY)
		{
			this.AX=AX;
			this.AY=AY;
			this.BX=BX;
			this.BY=BY;
		}
	public static BufferedImage Snip(Robot Rob,int X,int Y,int Wid,int Hit){return Rob.createScreenCapture(new Rectangle(X,Y,Wid,Hit));}
		public static BufferedImage Try_Snip(Robot Rob,int X,int Y,int Wid,int Hit)
		{
			try{return Snip(Rob,X,Y,Wid,Hit);}
			catch(Exception Xeptin)
			{
				System.err.println(Xeptin);

				return null;
			}
		}

	public static int Pixl_Num(BufferedImage Imag){return Imag.getHeight()*Imag.getWidth();}

	public static void Calc_X_Difg(BufferedImage Imag,long[][] Difg)
	{
		for(int X=0;X<Difg.length;X+=1)
		{
			long[] Y_Ro=Difg[X];
			for(int Y=0;Y<Y_Ro.length;Y+=1){Y_Ro[Y]=Colr.Dif(Imag.getRGB(X,Y),Imag.getRGB(X,Y+1));}
		}
	}
		public static long[][] Calc_X_Difg(BufferedImage Imag)
		{
			long[][] Difg=new long[Imag.getWidth()-1][Imag.getHeight()];
			Calc_X_Difg(Imag,Difg);

			return Difg;
		}
	public static void Calc_Y_Difg(BufferedImage Imag,long[][] Difg)
	{
		for(int X=0;X<Difg.length;X+=1)
		{
			long[] Y_Ro=Difg[X];
			for(int Y=0;Y<Y_Ro.length;Y+=1){Y_Ro[Y]=Colr.Dif(Imag.getRGB(X,Y),Imag.getRGB(X+1,Y));}
		}
	}
		public static long[][] Calc_Y_Difg(BufferedImage Imag)
		{
			long[][] Difg=new long[Imag.getWidth()][Imag.getHeight()-1];
			Calc_Y_Difg(Imag,Difg);

			return Difg;
		}
	public static void Calc_Dif(BufferedImage A,BufferedImage B,long[][] Difg)
	{
		for(int X=0;X<Difg.length;X+=1)
		{
			long[] Y_Ro=Difg[X];
			for(int Y=0;Y<Y_Ro.length;Y+=1){Y_Ro[Y]=Colr.Dif(A.getRGB(X,Y),B.getRGB(X,Y));}
		}
	}
		public static long[][] Calc_Dif(BufferedImage A,BufferedImage B)
		{
			long[][] Difg=new long[A.getWidth()][A.getHeight()];
			Calc_Dif(A,B,Difg);

			return Difg;
		}
	public static long Totl_Mag(long[][] P)
	{
		int Mag=0;
		for(long[] Y_Ro:P){for(long Vectr:Y_Ro){Mag+=Dif_Totl_RGB((Vectr<0)?Vectr*-1:Vectr);}}

		return Mag;
	}
	public static int Totl_Dif(BufferedImage A,BufferedImage B,long[][] Difg)
	{
		Calc_Dif(A,B,Difg);

	}
}