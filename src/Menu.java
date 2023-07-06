import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu  {

	static List<Patient> patientsList=new ArrayList<Patient>();
	static Scanner input=new Scanner(System.in);
	
	
	
	
	
	public static void main(String[] args) throws IOException,NullPointerException {
		
		int option =0;
		readFromFile();
		
		do {
		System.out.println("############## WELCOME ##########################");
		System.out.println("#\t\t\t\t\t\t#\n#\t\t\t\t\t\t#\n#\t 1. NEW PATIENT\t\t\t\t#");	
		System.out.println("#\t\t\t\t\t\t#\n#\t\t\t\t\t\t#\n#\t 2. SEARCH CUSTOMERS USING ID\t\t#");		
		System.out.println("#\t\t\t\t\t\t#\n#\t\t\t\t\t\t#\n#\t 3. Finance Related Informations \t#");	
		System.out.println("#\t\t\t\t\t\t#\n#\t\t\t\t\t\t#\n#\t 4. EXIT \t\t\t\t#");	
		System.out.println("#################################################");
	
		
			 if (input.hasNextInt()) {
				
				 option=input.nextInt();
				 
			 }
			 System.out.println(option);
		
			switch(option) {
			case 1:
				newPatient();
				break;
			case 2:
				showPatientsInfo.displayPatientsInfo(patientsList);
				break;
			case 3:
				financeRelatedInfos();
				break;
				
			
			case 4:
				System.out.println("================YOU HAVE EXITED SUCCESSFULLY !===================");
				break;
				
			}
					
		}while(option!=4);
	}
	
	
	

	private static void readFromFile() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("File.txt"));
			Scanner read= new Scanner(in);
			read.useDelimiter(",");
			while(read.hasNext()) {
				Patient patient= new Patient();
				patient.id=read.next();
				patient.name=read.next();
				patient.phone=read.next();
				patient.address=read.next();
				patient.history=read.next();
				patient.prescription=read.next();
				patient.fifthApp=read.next();
				patient.secondApp=read.next();
				patient.thirdApp=read.next();
				patient.fourthApp=read.next();
				patient.fifthApp=read.next();
				patient.mobileBanking=Integer.parseInt(read.next());
				patient.cash=Integer.parseInt(read.next());;
				patient.physicianName=read.next();
				
				patientsList.add(patient);
			}
		
		read.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	private static void financeRelatedInfos() {
		int incomeOption;
		do {
		System.out.println("\t 1. Payment Through Mobile Banking ");
		System.out.println("\t 2. Payment Through Cash");
		System.out.println("\t 3. Employee's Commision and Total Salary");
		System.out.println("\t 4. Total Income");
		System.out.println("\t 5. Net Income");
		
		incomeOption=input.nextInt();
		
		if(incomeOption==1) {
		income.fromMobileBanking(patientsList);
		}
		
		else if(incomeOption==2) {
		income.fromCash(patientsList);
		}
		else if(incomeOption==3) {
		income.salary(patientsList);
		}
		else if(incomeOption==4) {
			income.total(patientsList);
		}
		else if(incomeOption==5) {
			income.netIncome(patientsList);
		}
		else if (incomeOption!=1 && incomeOption !=2 && incomeOption!=3 && incomeOption != 4 && incomeOption != 5) {
			
		System.out.println("Please , enter only in the range of [1-5]");	
			
		}
		
		
		}while(incomeOption!=1 && incomeOption !=2 && incomeOption!=3 && incomeOption != 4 && incomeOption != 5);
		
	}




	private static void newPatient() throws IOException {
		
		//String s=input.nextLine();
		//System.out.println("s"+s+"s");
		 Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Patient's ID : ");
		String id = input.nextLine();
		System.out.println("Enter Patient's Name :");
		String name = input.nextLine();
		System.out.println("Enter Patient's Phone Num :");
		String phone = input.nextLine();
		System.out.println("Enter Patient's Address :");
		String address = input.nextLine();
		System.out.println("Enter Patient's History :");
		String history = input.nextLine();
		System.out.println("Enter Patient's Prescription :");
		String prescription = input.nextLine();
		System.out.println("First Appointment :");
		String firstApp = input.nextLine();
		System.out.println("Second Appointment :");
		String secondApp = input.nextLine();
		System.out.println("Third Appointment :");
		String thirdApp = input.nextLine();
		System.out.println("Fourth Appointment :");
		String fourthApp = input.nextLine();
		System.out.println("Fifth Appointment :");
		String fifthApp = input.nextLine();
		System.out.println("Physician Name : ");
		String physicianName = input.nextLine().strip().toLowerCase();//accepts the name->avoid extra spaces from the beginning and ending ->changes to lower case
		
		
		int paymentMethod;
		int amount;
		int mobileBanking = 0;
		int cash = 0;
		do{
			System.out.println("Choose Payment Method");
		
		System.out.println("1. Mobile Banking :");
		System.out.println("2. Cash :");
		System.out.println("Payment Method : ");
		
		
		paymentMethod=input.nextInt();
		
		if(paymentMethod==1) {
			System.out.println("Enter the amount");
			amount=input.nextInt();
			 mobileBanking = amount;
			}
		
		else if(paymentMethod==2) {
			System.out.println("Enter the cash amount");
			amount=input.nextInt();
			
			cash = amount;
		    }
		else {
			
			
			System.out.println("Please enter the correct number ");
			
		}
		
		
		}while(paymentMethod!=1 && paymentMethod!=2 );
		
		
		Patient newPatient=new Patient(id,name,phone,address,history,prescription,firstApp,secondApp,thirdApp,fourthApp,
				fifthApp,mobileBanking,cash,physicianName);
		patientsList.add(newPatient);
		
	}

}
