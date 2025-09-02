package Test;
import java.util.*;
public class PoolingBooth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candidate1 = 0, candidate2 = 0,candidate3 = 0;
		int voterCount = 0;
		while(true) {
			System.out.println("Enter the age (-1 to exit) : ");
			int age = sc.nextInt();
			if(age>=18) {
				voterCount++;
				System.out.println("You are eligible to vote");
				System.out.println("Enter candidate choice to vote (1/2/3) : ");
				int vote = sc.nextInt();
				if(vote==1) {
					candidate1++;
				}
				else if(vote==2) {
					candidate2++;
				}
				else if(vote==3) {
					candidate3++;
				}
				else{
					System.out.println("Invalid Vote");
				}
			}
			else if(age==-1) {
				System.out.println("Invalid Age");
				break;
			}
			else {
				System.out.println("Not Eligible");
			}
		}
		System.out.println("Total voters = " + votercount);
		System.out.println("Candidate 1 : " + candidate1 + "votes");
		System.out.println("Candidate 2 : " + candidate2 + "votes");
		System.out.println("Candidate 3 : " + candidate3 + "votes");
		sc.close();
	}
}
