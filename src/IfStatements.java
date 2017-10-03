import java.util.Scanner;
public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int score=0;
		String answer;
		System.out.println("What year was the toonie created?");
		System.out.println("A. 1994");
		System.out.println("B. 1996");
		System.out.println("C. 1998");
		System.out.println("D. 2000");
		System.out.print("Your answer: ");
		answer=in.nextLine();
		answer=answer.toUpperCase();
		if (answer.equals("B")||answer.equals("1996")) {
			System.out.println("You got it!");
			score=score+10;
		}else {
			System.out.println("Wrong!");
			score=score-5;
		}
		System.out.println("Your score is: "+score);
		
	}

}
