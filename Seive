import java.util.*;

public class Seive {

	public static void main(String[] args) {
	
		System.out.println("*******Welcome to the Seive of Erathoronthenes*******");
		System.out.println("Please enter your limit: ");
		
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int [] prime = Prime.findPrime(limit);
		for(int i = 0; i < prime.length; i++) {
			System.out.print(prime[i] + " ");
		}
		
	}
	public static void display(LinkedList<Number> list) {
		
		List<Number> prime = new ArrayList<Number>();
		List<Number> composite = new ArrayList<Number>();
		
		for(int i = 0; i < list.size(); i++) {
			Number num = (Number)list.get(i);
			if(num.getPrime() == 1) {
				prime.add(num);
			}else {
				composite.add(num);
			}
		}
		System.out.println("Prime Numbers are: ");
		for(int i = 0; i < prime.size(); i++) {
			Number primeNum = (Number)prime.get(i);
			System.out.print(primeNum.getValue());
			System.out.print(" ");
			if(i == prime.size()/2) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Composite Numbers are: ");
		for(int i = 0; i < composite.size(); i++) {
			Number compositeNum = (Number)composite.get(i);
			System.out.print(compositeNum.getValue());
			System.out.print(" ");
			if(i == composite.size()/2) {
				System.out.println();
			}
		}
	}
}
