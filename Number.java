/*
Numbers is an integer based object used to keep 
track of which numbers inside of the Seive.
*/

public class Number {
	private int prime = -1;
	private int value;
	// -1; relation to prime or composite undefined (not checked yet)
	// 0; composite (not prime)
	// 1; prime 
	
	public Number(int value){
		this.value = value;
	}
	
	public void setPrime(int prime) {
		this.prime = prime; 
	}
	
	public int getValue() {
		return value;
	}
	
	public int getPrime() {
		return prime;
	}
}
