import java.util.List;
import java.util.Scanner;

public class showPatientsInfo {

	public static void displayPatientsInfo(List<Patient > patientsList){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id : ");
		String id=scanner.nextLine();
		int count=0;
		
		for(Patient p :patientsList) {
			if(p.id.equals(id)) {
				System.out.println("\n********************"+p.name+"'s Information****************");
				System.out.println("ID = " + p.id);
				System.out.println("NAME = " + p.name);
				System.out.println("PHONE = " + p.phone);
				System.out.println("ADDRESS = " + p.address);
				System.out.println("HISTORY = " + p.history);
				System.out.println("PRESCRIPTION = " + p.prescription);
				System.out.println("FIRST APPOINTMENT = " + p.firstApp);
				System.out.println("SECOND APPOINTMENT = " + p.secondApp);
				System.out.println("THIRD APPOINTMENT = " + p.thirdApp);
				System.out.println("FOURTH APPOINTMENT = " + p.fourthApp);
				System.out.println("FIFTH APPOINTMENT = " + p.fifthApp);
				System.out.println("MOBILE BANKING PAYMENT = " + p.mobileBanking);
				System.out.println("CASH PAYMENT = " + p.cash);
				System.out.println("PHYSICIAN NAME = " + p.physicianName);
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
				count ++;
				break;
			}
			
			
		
			
			
		}
		if(count==0)
		{		System.out.println(" No customer is assigned in this ID number ");
		}
		
	}
}
