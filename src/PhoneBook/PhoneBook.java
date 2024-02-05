package PhoneBook;

public class PhoneBook {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public PhoneBook(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBook() {

    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                first Name: %s
                last Name; %s
                Phone Number: + 234 %s
                """,firstName,lastName,phoneNumber);
    }

    public Object searchPhoneNumber(String firstName) {
        return firstName;
    }
    public void savePhoneNumber(String firstName, String lastName, String phoneNumber) {
    }


}

