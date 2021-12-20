package nexthighest.find;

import java.util.Arrays;

import nexthighest.utility.SwapUtility;

public class FindNext {
	
	static SwapUtility utility = new SwapUtility();
	
    public static void findNext(char ar[], int n)
    {
        int i;

        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
       if (i == 0)
        {
            System.out.println("Not possible");
        }
        else
        {
            int x = ar[i - 1], min = i;
        
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }

            try {
				utility.swap(ar, i - 1, min);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            Arrays.sort(ar, i, n);
            System.out.print("Next number with same" + " set of digits is ");
            for (i = 0; i < n; i++)
                System.out.print(ar[i]);
        }
    }

}
