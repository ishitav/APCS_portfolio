package EncapsulationQuestions;


import java.util.Random;

import io.ConsoleMethods;

/** 
 * Question class is intended to support asking question on test
 *
 * @author (John Mortensen)
 * @version (1.0)
 */
public class Question extends Scoring
{
	// question setup values
	protected String question, choiceA, choiceB, choiceC, choiceD, choiceE, answer;
    protected char answerA, answerB, answerC, answerD, answerE, answerKey;  // used for setting answerKey by subs
    
    // internal control values, these are never change
    private final char charA = 'A', charB = 'B', charC = 'C', charD = 'D', charE = 'E'; 	// Multiple choice default letters
	private final char[] answers = {charA, charB, charC, charD, charE};						// Multiple choice default order
    
    // defaults for randomization
    private boolean scrambled = false;			// scrambled is control variable to tell if randomization is ON/OFF
   	private int randOffset = 0;					// randOffset is used when scrambled to move answers around
    protected boolean choiceEfixed = true;		// used to keep choice E fixed versus randomization
	private String[] choices = {"", "", "", "", ""};

    
    /**
     * Constructor for objects of class Question
     * 
     * @param  void
     */
    public Question()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("Question Constructor");
        
        // turn scrambled off for backward compatibility
        scrambled = false;
        randOffset = 0;
        choiceEfixed = true;
        
        // used by Sub Classes to set answerKey defaults more easily (ABCDE)
        answerA=answers[0];
        answerB=answers[1];
        answerC=answers[2]; 
        answerD=answers[3];
        answerE=answers[4];
    }
    
    /**
     * Randomize choices and answers, potentially change order from definition
     * 
     * @param  void
     */
    public void scramble()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("Scramble method");
        
        // tell class we are in scrambled orientation
		scrambled = true;
        
		// length of items to be scrambled
		int length = (choiceEfixed ? answers.length -1 : answers.length);
		
		// random number for scramble
    	Random rand = new Random();
    	randOffset = rand.nextInt(length);
    	
    	// scramble logic modulo math
    	int aOffset = randOffset;
    	int bOffset = (randOffset+1) % length;
    	int cOffset = (randOffset+2) % length;
    	int dOffset = (randOffset+3) % length;
    	int eOffset = choiceEfixed ? length : (randOffset+4) % length;
  
    	// choice scrambling
    	choices[aOffset] = choiceA;
    	choices[bOffset] = choiceB;
    	choices[cOffset] = choiceC;
    	choices[dOffset] = choiceD;
    	choices[eOffset] = choiceE;
    	    	
		// answer key reset to match scrambled choice
        char offsetAnswerKey='\0';
    	switch (answerKey) {
		case charA:
			offsetAnswerKey = answers[aOffset];
			break;
		case charB:
			offsetAnswerKey = answers[bOffset];
			break;
		case charC:
			offsetAnswerKey = answers[cOffset];
			break;
		case charD:
			offsetAnswerKey = answers[dOffset];
			break;
		case charE:
			offsetAnswerKey = answers[eOffset];
			break;

		}
    	// before and after answerKey
		ConsoleMethods.println("AnswerKey:" +answerKey);
		ConsoleMethods.println("offsetAnswerKey:" +offsetAnswerKey);
		// answerKey reset to match scrambled choice
		answerKey = offsetAnswerKey;

    	// Outputs showing randomization of letters
    	ConsoleMethods.printChar(answers[0]);
    	ConsoleMethods.printChar(answers[aOffset]);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[1]);
    	ConsoleMethods.printChar(answers[bOffset]);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[2]);
    	ConsoleMethods.printChar(answers[cOffset]);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[3]);
    	ConsoleMethods.printChar(answers[dOffset]);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[4]);
    	ConsoleMethods.printChar(answers[eOffset]);
    	ConsoleMethods.println();
    }
    
    
    /**
     * Intended for two args and an operator
     *
     * @param  arg1      1st argument in math expression
     * @param  operator  operator in math expression (/ or % only)
     * @param  arg2      2st argument in math expression
     * @return void
     */
    public void setupQuestion(int arg1, char operator, int arg2) {
		// TODO Auto-generated method stub	
	}
    
    /**
     * Intended for String and Double question setup
     *
     * @param  string     datatype of reference
     * @param  number       number in conversion
     * @return void
     */
	public void setupQuestion(String string, double number) {
		// TODO Auto-generated method stub
		
	}
	
	/**
     * Question getter
     *
     * @param  void
     * @return String	contents of question
     */
	public String getQuestion() {
		return question;
	}
	
	/**
     * Choices getter for Multiple Choice
     *
     * @param  void
     * @return String 	content of choices with ABCDEF formatting
     */
	public String getChoices() {
		if (scrambled)
		{
			return String.format(
	            answers[0] + ": " + choices[0] + "\n"  + 
	    	    answers[1] + ": " + choices[1] + "\n"  + 
	    	    answers[2] + ": " + choices[2] + "\n"  + 
	    	    answers[3] + ": " + choices[3] + "\n"  + 
	    	    answers[4] + ": " + choices[4] + "\n"
	            );    
		} else {
			return String.format(
	            answers[0] + ": " + choiceA + "\n"  + 
	    	    answers[1] + ": " + choiceB + "\n"  + 
	    	    answers[2] + ": " + choiceC + "\n"  + 
	    	    answers[3] + ": " + choiceD + "\n"  + 
	    	    answers[4] + ": " + choiceE + "\n"
	    	    );
		}
	}
	
	/**
     * Answer getter with formatting to correspond to getChoices
     *
     * @param  void
     * @return String 	correct answer with letter prefex of right answer (A or B or C...)
     */
	public String getAnswer() {	
		
		// This outputs randomization of letters
    	ConsoleMethods.println("Answer:" + answerKey);
		
		return answerKey + ": " + answer;
	}
    
	/**
     * Console support wrapper for asking question, getting result, and calculating results
     *
     * @param  void
     * @return void
     */
    public void  askQuestionConsole()
    {
        // getAnswer return true if question is correct
        updateCounters ( getAnswerConsole() );
    }
    
    /**
     * Console support for asking question and getting result
     *
     * @param  void
     * @return void
     */
    private boolean getAnswerConsole()
    {
        char choice;
        
        // Implement this to randomize order
        ConsoleMethods.println(getQuestion());
        ConsoleMethods.println(getChoices());
        
        // IO logic of getting answer from console
        do {
            choice = ConsoleMethods.inputChar("Enter selection (A-E) --> ");
            choice = Character.toUpperCase(choice); // Convert to upper case
            if (choice >= 'A' && choice <= 'E') break;
            ConsoleMethods.println(" (invalid) ");
        } while ( true );                                               // until valid input
        
        if (choice == answerKey) ConsoleMethods.print("(correct) ");
        else ConsoleMethods.print("(missed it!) ");
        ConsoleMethods.println(answer);
        ConsoleMethods.println();
        
        /*Boolean ansStatus = (choice == answerKey);
        calcResult(ansStatus)
        return ansStatus;*/
        return (choice == answerKey);
    }
  
}
