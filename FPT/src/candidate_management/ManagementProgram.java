package candidate_management;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagementProgram {
	private static ArrayList<Candidate> candidates = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nCandidate Management System");
            System.out.println("1. Enter candidate information");
            System.out.println("1.1 Candidate experience");
            System.out.println("1.2 Fresher candidates");
            System.out.println("1.3 Intern candidates");
            System.out.println("2. Display candidate information");
            System.out.println("3. Search and display candidate information");
            System.out.println("4. Update candidate information (not update ID)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter candidate type (0: Experience, 1: Fresher, 2: Intern): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    enterCandidateInformation(type);
                    break;
                case 2:
                    displayAllCandidates();
                    break;
                case 3:
                    searchAndDisplayCandidate();
                    break;
                case 4:
                    updateCandidateInformation();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void enterCandidateInformation(int type) {
        System.out.print("Enter Candidate ID: ");
        String candidateId = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Birth Date (yyyy-MM-dd): ");
        Date birthDate = new Date(scanner.nextLine());
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        switch (type) {
            case 0:
                System.out.print("Enter Years of Experience: ");
                int expInYear = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter Professional Skill: ");
                String proSkill = scanner.nextLine();
                candidates.add(new Experience(candidateId, firstName, lastName, birthDate, address, phone, email, type, expInYear, proSkill));
                break;
            case 1:
                System.out.print("Enter Graduation Date (yyyy-MM-dd): ");
                Date graduationDate = new Date(scanner.nextLine());
                System.out.print("Enter Graduation Rank: ");
                String graduationRank = scanner.nextLine();
                System.out.print("Enter Education: ");
                String education = scanner.nextLine();
                candidates.add(new Fresher(candidateId, firstName, lastName, birthDate, address, phone, email, type, graduationDate, graduationRank, education));
                break;
            case 2:
                System.out.print("Enter Majors: ");
                String majors = scanner.nextLine();
                System.out.print("Enter Semester: ");
                int semester = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter University Name: ");
                String universityName = scanner.nextLine();
                candidates.add(new Intern(candidateId, firstName, lastName, birthDate, address, phone, email, type, majors, semester, universityName));
                break;
            default:
                System.out.println("Invalid candidate type.");
        }
    }

    private static void displayAllCandidates() {
        for (Candidate candidate : candidates) {
            candidate.display();
        }
    }

    private static void searchAndDisplayCandidate() {
        System.out.print("Enter Candidate ID to search: ");
        String candidateId = scanner.nextLine();
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId().equals(candidateId)) {
                candidate.display();
                return;
            }
        }
        System.out.println("Candidate not found.");
    }

    private static void updateCandidateInformation() {
        System.out.print("Enter Candidate ID to update: ");
        String candidateId = scanner.nextLine();
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId().equals(candidateId)) {
                System.out.print("Enter First Name: ");
                candidate.setFirstName(scanner.nextLine());
                System.out.print("Enter Last Name: ");
                candidate.setLastName(scanner.nextLine());
                System.out.print("Enter Birth Date (yyyy-MM-dd): ");
                candidate.setBirthDate(new Date(scanner.nextLine()));
                System.out.print("Enter Address: ");
                candidate.setAddress(scanner.nextLine());
                System.out.print("Enter Phone: ");
                candidate.setPhone(scanner.nextLine());
                System.out.print("Enter Email: ");
                candidate.setEmail(scanner.nextLine());
                System.out.println("Candidate information updated.");
                return;
            }
        }
        System.out.println("Candidate not found.");
    }
}

