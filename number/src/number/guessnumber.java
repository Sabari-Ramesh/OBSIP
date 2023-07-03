package number;
import javax.swing.*;
public class guessnumber {
public static void main(String[] args) {
	int computernumber=(int)(Math.random()*100+1);  //to generate random number
	int userno=0;
	System.out.println("The Correct Guess Would be:"+computernumber);
	int count=10;
	int score=100;
		while(count-->0) { //TO ATTEMPT
		String response=JOptionPane.showInputDialog(null,"Enter a Guess Between 1 and 100","Guessing Game",3);
	    userno=Integer.parseInt(response); //CONVERT STRING TO INTEGER
	    JOptionPane.showMessageDialog(null," "+determineGuess(userno,computernumber,count,score));
	    score-=10;
	    if(userno==computernumber) {
	    	JOptionPane.showMessageDialog(null," "+determineGuess(userno,computernumber,count,score)+"\n Your Score :"+score);
	    	break;
	    }
	    if(count==0) {JOptionPane.showMessageDialog(null," "+determineGuess(userno,computernumber,count,score)+"\n Your Score :"+score+"\nThe correct number :"+computernumber);
	    break;}
	    }
}
public static String determineGuess(int userno,int computernumber,int count,int score){
	if(userno<=0 || userno>100)
		return "Your guess is invalid";
	else if(userno==computernumber) {
		return "correct! You Won The Game \n Total Guesses :"+(10-count);
		}
	else if(userno>computernumber) {
		score-=10;
		return "Your guess is too high,try again, \n TryAnotherNumber :"+count;}
	else if(userno<computernumber) {
		score-=10;
		return "Your guess is too Loo,try again, \n TryAnotherNumber :"+count;}
	else {
		return "Your guess is incorrect \n TryAnothernumber :"+count;}
}
}
