package Subject_PyramidMaking;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		MyCls Py = new MyCls();
		Py.PyramidMaker();
	}
}
class MyCls
{
	MyCls()
	{
	}
	void PyramidMaker()
	{
	System.out.printf("\n\n\n\n");
		for(int i = 1; i<=5;i++) // size
		{
			// Start of triangle | 1 3 5 7 9

			for(int a=1; a<=11-(i*2); a++) // margin-left, spaces | big num >> small num
					System.out.print(" ");
			for(int b=1;b<=(i*2)-1;b++) // Pyramid | small num >> big num
					System.out.print(" *");

			// Start of reverse triangle right after the triangle | 9 7 5 3 1
			// *의 시작포인트에서 9개로 시작을 해야함.
			
		System.out.println();
		}
		for(int j=1;j<=5;j++)
		{
			for(int d=1;d<=(j*2)+1;d++)
				System.out.print(" ");
			for(int c=1;c<=9-(j*2);c++)
				System.out.print(" *");
			
		System.out.println();
		}
	}	
	}
}
