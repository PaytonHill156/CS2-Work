package WeekThree;

public class SortStudentsOnGrades {

	public static void main(String[] args) {
		/*
		public class GradeExam { 
		2  Main method  
		3 public static void main(String[] args) { 
		4 // Students' answers to the questions 
		5 char[][] answers = { 
		6{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
		7{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, 
		8{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, 
		9{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, 
		10 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
		11 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
		12 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
		13 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}}; 
		14 
		15 // Key to the questions 
		16 char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; 
		17 
		18 // Grade all answers 
		19 for (int i = 0; i < answers.length; i++) { 
		20 // Grade one student 
		21 int correctCount = 0; 
		22 for (int j = 0; j < answers[i].length; j++) { 
		23 if (answers[i][j] == keys[j]) 
		24            correctCount++; 
		25        } 
		26 
		27        System.out.println("Student " + i + "'s correct count is " + 
		28          correctCount); 
		29      } 
		30    } 
		31  }
		 */

		/*Rewrite Listing 8.2, GradeExam.java, to display the students 
		 * in increasing order of the number of correct answers.
		 */
		int correctCount = -1;
		
		
		GetCorrectCount(null);
		SortStudentByCorrectCount(correctCount);
		PrintStudentResults();
		
	}
	
	//checks all students answers against the key
		//input -- char [][]
		//output -- int correct count
	private static void GetCorrectCount(char[][] answers) {
		
		
	}

	//Sorts students by the number of correct count
		//input -- int correct count
		//output -- void
	private static void SortStudentByCorrectCount(int correctCount) {
		
		
	}

	//Prints student results
		//input -- 
		//output -- 
	private static void PrintStudentResults() {
		
		
	}

}
