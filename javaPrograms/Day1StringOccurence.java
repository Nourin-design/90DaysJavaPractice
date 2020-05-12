package javaPrograms;

public class Day1StringOccurence {
	public static void main(String[] args) {
		String str = "You have no choice other than following me!";
		
		//Create a counter varaiable to the number of 'O'
		int count = 0;
		
		//Converting sentence into sequence of characters
		char[] array = str.toCharArray();
		
		for(int i =0; i<array.length; i++)
		{
			if(array[i]=='o')
			{
				count = count+1;
			}
		}
		System.out.println("Occurance of o is: " +count);
			
				
	}

}
