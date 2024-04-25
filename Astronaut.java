public class Astronaut {
    private String name;
    private String dateOfBirth;
    private String IDNumber;
    private String address;
    private String email;
    private String phoneNumber;
    private String nextOfKin;
    private String status;
    private double payRate;
    private double weight;

    // Constructor
    public Astronaut(String name, String dateOfBirth, String IDNumber, String address, String email, String phoneNumber, String nextOfKin, String status, double payRate, double weight) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.IDNumber = IDNumber;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nextOfKin = nextOfKin;
        this.status = status;
        this.payRate = payRate;
        this.weight = weight;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
