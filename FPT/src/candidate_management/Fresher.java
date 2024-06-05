package candidate_management;

import java.util.Date;

public class Fresher extends Candidate {
	private Date graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, int candidateType, Date graduationDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Graduation Date: " + graduationDate + ", Graduation Rank: " + graduationRank + ", Education: " + education);
    }

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
    
    
	
	
    
    
}
