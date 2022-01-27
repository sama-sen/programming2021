/*
 * Awesome demo by Ash K. Mitchell
 * 01/2022
 * Requires the StdDraw library
 */
import java.util.Scanner;

public class DrawTest
{
	static final double scaleX = 100;
	static final double scaleY = 100;
	static final double middleX = scaleX / 2;
	static final double middleY = scaleY / 2;
	static double SideLength =30;
	// Scale is one half of the lenth of a square side
	static double Rotation =0;
	// Roatation is the current angle of the Square from 0 to 1.570796
	static double Pi = 3.14159;
	static double TopRaise=15;
	// TopRaise is half of the square's height
	static int Speed=50;
	// how fast the cube rotates
	static String Type="Cube";
	// the type of object
	
	public static double EllPointX(double angle, double radius, double Origin) throws InterruptedException
	{
		//turn from degrees to radians
		angle = angle*(Pi/180);
		// check the angle on the ellipse
		double result =Math.cos(angle);
		result= Origin+radius*result;
		return result;
	}
	
		public static double EllPointY(double angle, double radius, double Origin) throws InterruptedException
	{
		//turn from degrees to radians
		angle = angle*(Pi/180);
		// check the angle on the ellipse
		double result =Math.sin(angle);
		result= Origin+radius*result;
		return result;
	}

	public static void SquareTop(double SideLength, double Rotation, double Top) throws InterruptedException
	{
		double x=Rotation;
		int i=0;
		if (Type == "Cube"){
		while (i<4) {
		double LineSX=EllPointX(x, SideLength, middleX);
		double LineSY=EllPointY(x, SideLength-20, middleY+Top);
		double LineEX=EllPointX(x+90, SideLength, middleX);
		double LineEY=EllPointY(x+90, SideLength-20, middleY+Top);
		StdDraw.line(LineSX, LineSY, LineEX, LineEY);
		i++;
		x=x+90;
	}
	} else {
		
	}
	}
	

	public static void SquareBottom(double SideLength, double Rotation, double Top) throws InterruptedException
	{
		double x=Rotation;
		int i=0;
		while (i<4) {
		double LineSX=EllPointX(x, SideLength, middleX);
		double LineSY=EllPointY(x, SideLength-20, middleY-Top);
		double LineEX=EllPointX(x+90, SideLength, middleX);
		double LineEY=EllPointY(x+90, SideLength-20, middleY-Top);
		StdDraw.line(LineSX, LineSY, LineEX, LineEY);
		i++;
		x=x+90;
	}
	}
	
	public static void SquareSides(double SideLength, double Rotation, double Top) throws InterruptedException
	{
		if (Type=="Cube"){
		double x=Rotation;
		int i=0;
		while (i<4) {
		double LineSX=EllPointX(x, SideLength, middleX);
		double LineSY=EllPointY(x, SideLength-20, middleY-Top);
		double LineEX=EllPointX(x, SideLength, middleX);
		double LineEY=EllPointY(x, SideLength-20, middleY+Top);
		StdDraw.line(LineSX, LineSY, LineEX, LineEY);
		i++;
		x=x+90;
	}
	} else {
		double x=Rotation;
		int i=0;
		while (i<4) {
		double LineSX=EllPointX(x, 0, middleX);
		double LineSY=EllPointY(x, 0, middleY+Top);
		double LineEX=EllPointX(x, SideLength, middleX);
		double LineEY=EllPointY(x, SideLength-20, middleY-Top);
		StdDraw.line(LineSX, LineSY, LineEX, LineEY);
		i++;
		x=x+90;
	}
	}
}
	
	public static void main(String[] args) throws InterruptedException
	{
		StdDraw.setPenRadius(0.005);
		StdDraw.setXscale(0, scaleX);
		StdDraw.setYscale(0, scaleY);
		StdDraw.setPenColor(StdDraw.BLUE);
		
		System.out.print("Enter the lenth of the sides (30 reccomended)");
		Scanner in = new Scanner(System.in);
		SideLength = in.nextDouble();
		
		System.out.print("Enter the height of the cube (30 reccomended)");
		TopRaise = in.nextDouble()/2;
		
		System.out.print("Enter the starting rotation (0 reccomended)");
		Rotation = in.nextDouble();
		
		System.out.print("Enter the rotation speed (50 reccomended)");
		Speed = in.nextInt();
		
		System.out.print("Enter the type of object (1 for cube, 2 for Triangle)");
		int x;
		x = in.nextInt();
		if (x==2){
			Type = "Triangle";
		} else {
			Type = "Cube";
		}
		
		SquareTop(SideLength, Rotation, TopRaise);
		SquareBottom(SideLength, Rotation, TopRaise);
		SquareSides(SideLength, Rotation, TopRaise);
		
		Boolean No=true;
		while (No=true){
		Rotation=Rotation+1;
		StdDraw.clear();
		SquareTop(SideLength, Rotation, TopRaise);
		SquareBottom(SideLength, Rotation, TopRaise);
		SquareSides(SideLength, Rotation, TopRaise);
		Thread.sleep(Speed);
	}
}
}
