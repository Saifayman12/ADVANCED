package isequallll;


import java.util.Arrays;

public class dup {
	static String duplicated(char original[], int n)
	{
		
		int y = 0;

		
		for (int i = 0; i < n; i++)
		{

			
			int j;
			for (j = 0; j < i; j++)
			{
				if (original[i] == original[j])
				{
					break;
				}
			}

			
			if (j == i)
			{
				original[y++] = original[i];
			}
		}
		return String.valueOf(Arrays.copyOf(original, y));
	}

	
	public static void main(String[] args)
	{
		char str[] = "saifaabbsaaymanelsayedmohamed".toCharArray();
		int len = str.length;
		System.out.println(duplicated(str, len));
	}

}
