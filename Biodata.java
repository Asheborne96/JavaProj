import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Position desired: ");
        String position = input.nextLine();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter address: ");
        String address = input.nextLine();

        System.out.print("Enter birthplace: ");
        String birthplace = input.nextLine();

        System.out.print("Enter contact number: ");
        String contactNumber = input.nextLine();

        System.out.print("Enter age: ");
        String age = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter nationality: ");
        String nationality = input.nextLine();

        System.out.print("Enter email address: ");
        String email = input.nextLine();

        System.out.print("Enter highest education: ");
        String education = input.nextLine();

        System.out.print("Enter date of birth: ");
        String dateOfBirth = input.nextLine();

        System.out.print("Enter marital status: ");
        String maritalStatus = input.nextLine();

        System.out.print("Enter religion: ");
        String religion = input.nextLine();

        System.out.print("Enter blood type: ");
        String bloodType = input.nextLine();

        System.out.print("Enter height: ");
        String height = input.nextLine();

        System.out.print("Enter weight: ");
        String weight = input.nextLine();

        System.out.print("Enter father's name: ");
        String fathersName = input.nextLine();

        System.out.print("Enter mother's name: ");
        String mothersName = input.nextLine();

        System.out.print("Enter guardian name: ");
        String guardianName = input.nextLine();

        System.out.print("Enter citizenship: ");
        String citizenship = input.nextLine();

        System.out.print("Enter languages spoken: ");
        String languages = input.nextLine();

        System.out.print("Enter skills: ");
        String skills = input.nextLine();

        System.out.print("Enter hobbies: ");
        String hobbies = input.nextLine();

        System.out.print("Enter work experience: ");
        String workExperience = input.nextLine();

        System.out.print("Enter years of experience: ");
        String yearsExperience = input.nextLine();

        System.out.print("Enter desired salary: ");
        String desiredSalary = input.nextLine();

        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = input.nextLine();

        System.out.print("Enter emergency contact relation: ");
        String emergencyContactRelation = input.nextLine();

        System.out.print("Enter emergency contact phone: ");
        String emergencyContactPhone = input.nextLine();

        System.out.print("Enter LinkedIn profile: ");
        String linkedIn = input.nextLine();

        System.out.println();
        System.out.println("----- Biodata -----");
        System.out.println("Position Desired: " + position);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Nationality: " + nationality);
        System.out.println("Email Address: " + email);
        System.out.println("Highest Education: " + education);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Religion: " + religion);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Father's Name: " + fathersName);
        System.out.println("Mother's Name: " + mothersName);
        System.out.println("Guardian Name: " + guardianName);
        System.out.println("Citizenship: " + citizenship);
        System.out.println("Languages Spoken: " + languages);
        System.out.println("Skills: " + skills);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Work Experience: " + workExperience);
        System.out.println("Years of Experience: " + yearsExperience);
        System.out.println("Desired Salary: " + desiredSalary);
        System.out.println("Emergency Contact Name: " + emergencyContactName);
        System.out.println("Emergency Contact Relation: " + emergencyContactRelation);
        System.out.println("Emergency Contact Phone: " + emergencyContactPhone);
        System.out.println("LinkedIn Profile: " + linkedIn);

        input.close();
    }
}
