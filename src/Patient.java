
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Patient {
	
	String id;
	String name;
	String phone;
	String address;
	String history;
	String prescription;
	String firstApp;
	String secondApp;
	String thirdApp;
	String fourthApp;
	String fifthApp;
	int mobileBanking;
	int cash;
	String physicianName;

	
	Patient() {
		
		
	
		
	}

	public Patient(String id, String name, String phone, String address, String history, String prescription,
			String firstApp, String secondApp, String thirdApp, String fourthApp, String fifthApp,
			int mobileBanking, int cash, String physicianName) {
			
			this.id=id;
			this.name=name;
			this.phone=phone;
			this.address=address;
			this.history=history;
			this.prescription=prescription;
			this.firstApp=firstApp;
			this.secondApp=secondApp;
			this.thirdApp=thirdApp;
			this.fourthApp=fourthApp;
			this.fifthApp=fifthApp;
			this.mobileBanking=mobileBanking;
			this.cash=cash;
			this.physicianName=physicianName;
	
	
			recordNewPatientsInfo();
	}

	public  void recordNewPatientsInfo()  {
		
		try {
			
			FileWriter write= new FileWriter("File.txt",true);
			write.write(id+","+name+","+phone+","+address+","+history+","+prescription+","+firstApp+","+
			secondApp+","+thirdApp+","+fourthApp+","+fifthApp+","+mobileBanking+","+cash+","+physicianName+",");
			write.close();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	
}
