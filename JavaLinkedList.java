//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for(int i = 0; i<list.size(); i++){
			total += list.get(i);
		}

		return total;
	}

	public double getAvg(  )
	{

		return getSum() / list.size();
	}

	public int getLargest()
	{

		int largest=Integer.MIN_VALUE;
		for(int i = 0; i<list.size(); i++){
			if(largest<list.get(i)){
				largest = list.get(i);
			}
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest =Integer.MAX_VALUE;
		for(int i = 0; i<list.size(); i++){
			if(smallest>list.get(i)){
				smallest = list.get(i);
			}
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<list.size(); i++){
			output += list.get(i) + " ";
		}

		return output;
	}
}