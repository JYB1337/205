import java.util.*;

public class solve {
	public static void main(String[] args){
		int cctotal=0;
		int pptotal=0;
		double probability=0;
		ArrayList<Integer> pp = new ArrayList<Integer>();
		ArrayList<Integer> cc = new ArrayList<Integer>();
//		ListIterator<Integer> it = pp.listIterator();
//		while(it.hasNext())
//		{
//			it.next();
//			it.set(0);
//		}
//		while(it.hasPrevious())
//			it.previous();
		for(int fuck = 0; fuck <= 36; fuck++)
		{
			pp.add(0);
			cc.add(0);
		}		
		
//		System.out.println(pp.size());
		for(int i=1; i<5; i++)
		{
			for(int j=1; j<5; j++)
			{
				for(int k=1; k<5; k++)
				{
					for(int l=1; l<5; l++)
					{
						for(int m=1; m<5; m++)
						{
							for(int n=1; n<5; n++)
							{
								for(int o=1; o<5; o++)
								{
									for(int p=1; p<5; p++)
									{
										for(int q=1; q<5; q++)
										{
											int temp = i+j+k+l+m+n+o+p+q;
											pp.set(temp, pp.get(temp) + 1);
											pptotal++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
//		while(it.hasNext())
//		{
//			System.out.println(it.nextIndex() + " : " + it.next());
//		}
		for(int tot = 0; tot<=36; tot++ )
		{
			System.out.println(tot + " : " + pp.get(tot));
		}
		
		for(int i = 1; i<7 ; i++)
		{
			for(int ii = 1; ii<7 ; ii++)
			{
				for(int iii = 1; iii<7 ; iii++)
				{
					for(int iv = 1; iv<7 ; iv++)
					{
						for(int v = 1; v<7 ; v++)
						{
							for(int vi = 1; vi<7 ; vi++)
							{
								int temp2 = i+ii+iii+iv+v+vi;
								cc.set(temp2, cc.get(temp2)+1);
								cctotal++;
							}
						}
					}
				}
			}
		}
		for(int tot = 0; tot<=36; tot++ )
		{
			System.out.println(tot + " : " + cc.get(tot));
		}
		int beat = 0;
		System.out.println("pp total: " + pptotal);
		System.out.println("cc total: " + cctotal);
		for(int d = 1; d<pp.size(); d++)
		{
//			System.out.println(pp.get(d));
//			System.out.println(cc.get(d-1));
			double pproll = (double)pp.get(d) / (double)pptotal;
			beat+=cc.get(d-1);
			double ccroll = (double)beat/(double)cctotal;
			//System.out.println(pproll + " " + ccroll);
			System.out.println("probs= " + d + " : " + pproll*ccroll);
			probability+= pproll*ccroll;
		}
		System.out.println(probability);
	}
}

