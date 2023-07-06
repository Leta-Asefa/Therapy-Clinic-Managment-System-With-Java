import java.util.List;

public class income {
	
	
	static int salary=0;
	static int totalIncome=0;
	static int commision=300;
	
	
	
	
	public static void fromMobileBanking(List<Patient> patientsList) {
	int mobIncome=0;
		for(Patient p : patientsList) {
			
			mobIncome+=p.mobileBanking;
			
		}
		
		System.out.println("\t\tPAYMENT THROUGH MOBILE BANKING = " + mobIncome);
	}

	
	public static void fromCash(List<Patient> patientsList) {
		int cashIncome=0;
		for(Patient p:patientsList) {
			cashIncome+=p.cash;
			
		}
		System.out.println("\t\tPAYMENT THROUGH CASH = " + cashIncome);
	}
	
	public static void total(List<Patient> patientsList) {
		
		int cashIncome=0;
		for(Patient p:patientsList) {
			cashIncome+=p.cash;
			
		}
		
		
		int mobIncome=0;
		for(Patient p : patientsList) {
			
			mobIncome+=p.mobileBanking;
			
		}
		
		 totalIncome=cashIncome + mobIncome;
		System.out.println("\t\tTotal Income = " + totalIncome);
		
		
	}
	
	public static void salary(List<Patient > patientsList) {
		int abebeCommision=0;
		int kebedeCommision=0;
		int mikiyasCommision=0;
		
		for(Patient p :patientsList) {
			if(p.physicianName.equals("abebe")) {
				
				abebeCommision+=commision;
			}
			
			else		if(p.physicianName.equals("kebede")) {
				
				kebedeCommision+=commision;
			}
			
			else	if(p.physicianName.equals("mikiyas")) {
					
					mikiyasCommision+=commision;
				}
			
		}
		
		
		System.out.println("\t\tPHYSICIAN ABEBE'S TOTAL COMMISION = " + abebeCommision);
		System.out.println("\t\tPHYSICIAN KEBEDE'S TOTAL COMMISION = " + kebedeCommision);
		System.out.println("\t\tPHYSICIAN MIKIYAS' TOTAL COMMISION = " + mikiyasCommision);
		
		salary=abebeCommision + kebedeCommision + mikiyasCommision;
		System.out.println("\t\tSUM OF ALL EMPLOYESS SALARY = " + salary);
	}

	public static void netIncome(List<Patient > patientsList) {
		
		
		income.total(patientsList);
		income.salary(patientsList);
		
		System.out.println("\t\tNET INCOME = " + (totalIncome-salary));
	}
	
}
