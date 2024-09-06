import java.util.*;
import java.util.Random;
public class NumberGuessingGame{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Random ran = new Random();
int max = 100;
int ans = ran.nextInt(max)+1;
boolean right = false;
while(!right){
System.out.println("GUESS A NUMBER BETWEEN 1 TO 100: ");
int guess = sc.nextInt();
if(guess>ans){
System.out.println("TOO HIGH, TRY AGAIN...");
}
else if(guess < ans){
System.out.println("TOO LOW, TRY AGAIN...");
}
else{
System.out.println("YES,YOU GUESSED IT***");
right=true;
}
}








}}