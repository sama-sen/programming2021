
public class untitled {
	
	public static int mystery(int n, int a, int d)
	{
		if (n == 1)
			return a;
		else
			return d + mystery(n - 1, a, d);
	}
	
	
	public static void main (String[] args) {
		System.out.println(mystery(3,2,6));
	}
}

