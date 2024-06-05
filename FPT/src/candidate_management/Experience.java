package candidate_management;

import java.util.Date;

public class Experience extends Candidate{
	 private int expInYear;
	    private String proSkill;

	    public Experience(String candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, int candidateType, int expInYear, String proSkill) {
	        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
	        this.expInYear = expInYear;
	        this.proSkill = proSkill;
	    }

	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Experience in Years: " + expInYear + ", Professional Skill: " + proSkill);
	    }

		public int getExpInYear() {
			return expInYear;
		}

		public void setExpInYear(int expInYear) {
			this.expInYear = expInYear;
		}

		public String getProSkill() {
			return proSkill;
		}

		public void setProSkill(String proSkill) {
			this.proSkill = proSkill;
		}
	    
	    
}
