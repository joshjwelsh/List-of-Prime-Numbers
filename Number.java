public class Number {
	private int prime = -1;
	private int value;
	// -1; prime or not prime
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
