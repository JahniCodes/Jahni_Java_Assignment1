public class HealthProfile {
    /*HealthProfile class for a person.
    The class attributes should include the person’s first name, last name, gender,
    date of birth (consisting of separate attributes for the month, day and year of birth),
    height (in inches) and weight (in pounds).
    Your class should have a constructor that receives this data.
    For each attribute, provide set and get methods.
    The class also should include methods that calculate and return the user’s age in years,
    maximum heart rate and target-heart-rate range (see Exercise 3.16),
    and body mass index (BMI; see Exercise 2.33).
    Write a Java app that prompts for the person’s information, instantiates an object of class HealthProfile
    for that person and prints the information from that object—including the person’s
    first name, last name, gender, date of birth, height and weight—then calculates
    and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range.
    It should also display the BMI values chart from Exercise 2.33. <---- THIS WAS NOT IN THE BOOK ANYWHERE I COULD FIND */
    private String firstName;
    private String lastName;
    private String gender;
    private DateOfBirth DateOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, DateOfBirth DateOfBirth,
            double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DateOfBirth = DateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    //GETTERS
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public DateOfBirth getDateOfBirth() {
        return this.DateOfBirth;
    }

    public double getHeight() {
        return this.height;
    }

    public double getweight() {
        return this.weight;
    }

    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(DateOfBirth DoB) {
        this.DateOfBirth = DoB;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //METHODS
    public String getHeartRate() {
        int age = 2024 - this.DateOfBirth.getYear();
        double maximumHR = (double) 220 - age;
        double targetHR1 = maximumHR / 2;
        double targetHR2 = (maximumHR * 85) / 100;

        return String.format("Their age: %d.\n Their Maximun Heart Rate: %.2f.\n Their target HR: between %.2f and %.2f", age, maximumHR,
                targetHR1,targetHR2);
    }

    public String getBMI() {
        double BMI = (this.weight * 703.0) / (this.height * this.height);
        return String.format("Their Body Mass Index(BMI) is: %.2f.\n", BMI);
    }
}
