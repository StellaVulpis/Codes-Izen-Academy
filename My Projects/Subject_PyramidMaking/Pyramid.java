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
		// Algorithem: 5 - 3 - 1 | 1 + 3 + 5
		// i*2-1 >> 1 3 5 7 9
		// 11-(i*2) >> => 9 7 5 3 1
        for(int i = 1;i>=5;i++)
        {
            for(int a=1;a>=11-(i*2);a++)
            System.out.print(" ");
            for(int b=1;b>=(i*2)-1;b++)
            System.out.print("*");
        System.out.println();
        }
	}
}
