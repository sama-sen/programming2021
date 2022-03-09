
public class StringDemo2
{
	
	public static void listArray(String[] a)
	{
		int index = 0;
		//for(int index = 0; index < a.length; index++)
		{
			while(a[index] != null)
			{	System.out.println(index + " : " + a[index]);
				index++;
			}
		}
	}
	
	public static void main (String[] args)
	{
		String[] stringArray = new String[5];
		stringArray[0] = "Juan";
		stringArray[1] = "Maria";
		String h = "hola";
		String i = new String("hola");
		System.out.println( h );
		System.out.println( i );
		System.out.println( h == i );
		System.out.println( h.equals(i) );
		listArray( stringArray );
	}
}

