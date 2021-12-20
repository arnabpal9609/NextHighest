package nexthighest;

// Java program to find next highest
// number with same set of digits.
import java.util.Arrays;
import java.util.Scanner;

import nexthighest.find.FindNext;
import nexthighest.utility.SwapUtility;
 
public class nextGreater
{
	static FindNext findNext = new FindNext();
	
    // Given a number as a char array number[],
    // this function finds the next highest number.
    // It modifies the same array to store the result 
    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please enter the digits....");
        char digits[] = s.next().toCharArray();
        int n = digits.length;
        try {
			findNext.findNext(digits, n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}