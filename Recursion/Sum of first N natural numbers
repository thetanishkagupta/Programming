// Natural Numbers = 1,2,3,4,5,6,7,........

import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;    
        }
        sum += i;
        printSum(i+1, n, sum);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of n:");
	    int n = sc.nextInt();
	    printSum(1, n, 0);
	}
}

