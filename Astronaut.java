public class Astronaut {
    private String name;
    private String dateOfBirth;
    private String IDnumb;
    private String address;
    private String email;
    private String phoneNumb;
    private String nextOfKin;
    private String status;
    private double salary;
    private double weight;

    public Astronaut(String name, String dateOfBirth, String IDnumb, String address, String email, String phoneNumb, String nextOfKin, String status, double salary, double weight) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.IDnumb = IDnumb;
        this.address = address;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.nextOfKin = nextOfKin;
        this.status = status;
        this.salary = salary;
        this.weight = weight;
    }

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

    public String getIDnumb() {
        return IDnumb;
    }

    public void setIDnumb(String IDnumb) {
        this.IDnumb = IDnumb;
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

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void updateAstronautInfo(String name, String dateOfBirth, String IDnumb, String address, String email, String phoneNumb, String nextOfKin, String status, double salary, double weight) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.IDnumb = IDnumb;
        this.address = address;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.nextOfKin = nextOfKin;
        this.status = status;
        this.salary = salary;
        this.weight = weight;
    }
}
