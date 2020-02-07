package WeekThree;

import java.util.Arrays;

public class Node {
	   
    int value;
    private char [] testAnswers;
    Node left;
    Node right;
   
    public Node(int testResult, char [] testResults){
        this.value = testResult;
        this.testAnswers = testResults;
        this.left = null;
        this.right = null;
    }
   
    public void print(){
        System.out.println(Arrays.toString(this.testAnswers) + " Score: " + value);
    }
 
    public char [] getTestAnswers() {
        return testAnswers;
    }
 
    public void setTestAnswers(char [] testAnswers) {
        this.testAnswers = testAnswers;
    }
}