package candidate_management;

import java.util.Date;

public class Candidate {
	   private String candidateId;
	    private String firstName;
	    private String lastName;
	    private Date birthDate;
	    private String address;
	    private String phone;
	    private String email;
	    private int candidateType; // 0: Experience, 1: Fresher, 2: Intern

	    public Candidate(String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, int candidateType) {
	        this.candidateId = candidateId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.birthDate = birthDate;
	        this.address = address;
	        this.phone = phone;
	        this.email = email;
	        this.candidateType = candidateType;
	    }

	    public void display() {
	        System.out.println("ID: " + candidateId + ", Name: " + firstName + " " + lastName + ", Birth Date: " + birthDate + 
	                           ", Address: " + address + ", Phone: " + phone + ", Email: " + email + ", Type: " + candidateType);
	    }

		public String getCandidateId() {
			return candidateId;
		}

		public void setCandidateId(String candidateId) {
			this.candidateId = candidateId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getCandidateType() {
			return candidateType;
		}

		public void setCandidateType(int candidateType) {
			this.candidateType = candidateType;
		}
	    
	    
    
}
