package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;


	public  enum Gender {
		laki_laki,
		perempuan,
	}
	private Gender gender;//true = Laki-laki, false = Perempuan

	private List<String> childNames;
	private List<String> childIdNumbers;
	
	public Employee(
			String employeeId,
			String firstName,
			String lastName,
			String idNumber,
			String address,
			boolean isForeigner,
			Gender gender
		) {
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = idNumber;
			this.address = address;
			this.isForeigner = isForeigner;
			this.gender = gender;

			childNames = new LinkedList<String>();
			childIdNumbers = new LinkedList<String>();
		}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getAddress() {
		return address;
	}

	public boolean isForeigner() {
		return isForeigner;
	}

	public Gender getGender() {
		return gender;
	}

	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	

}
