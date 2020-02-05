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
   
    public String testAnswersToString(){
        String testAnswerAsAString = new String();
       
        if(this.testAnswers == null){
            return testAnswerAsAString;
        }
       
        for(int i = 0; i < this.testAnswers.length; ++i){
            //if(this.testAnswers[i] == null){
            //  return testAnswerAsAString;
            //}
            testAnswerAsAString = testAnswerAsAString + ", " + this.testAnswers[i];
        }
       
        return testAnswerAsAString;
    }
 
}