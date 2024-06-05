package candidate_management;

import java.util.Date;

public class Intern  extends Candidate{
	private String majors;
    private int semester;
    private String universityName;

    public Intern(String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, int candidateType, String majors, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Majors: " + majors + ", Semester: " + semester + ", University Name: " + universityName);
    }

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
    
    
	
}
