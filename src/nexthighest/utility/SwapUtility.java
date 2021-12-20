package nexthighest.utility;

public class SwapUtility {

    // Utility function to swap two digit
    public static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
	
}
