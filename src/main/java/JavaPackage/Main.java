package JavaPackage;
import java.util.ArrayList;

public class Main {
	public static void main(String... args) {
		Credit credit = new Credit(12, 200000, 0.05, 0.075, InstalmentsType.EQUAL);
		ArrayList<Installment> installments = credit.decreasingInstallments();
		double sum = 0;
		for(Installment i : installments ) {
			System.out.println("procenty: " + i.getInterest());
			System.out.println("kapital: " + i.getPrincipal());
			sum += i.getTotal();
			
		}
		double q = 1 + 0.075/12;
		System.out.println("ELO:: " + Math.pow(q, 12));
		System.out.println("calkowita kwota kredytu: " + credit.getTotalCreditSum());
		System.out.println("ilosc lat: " + credit.getYears());
		System.out.println("oprocentowanie  " + credit.getPercentage());
		System.out.println("prowizja " + credit.getCommision());
		System.out.println("kwota kredytu" + credit.getAmount());
		System.out.println("suma: " + sum);
		
	}

}
