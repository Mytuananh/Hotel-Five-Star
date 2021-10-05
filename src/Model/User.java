package Model;

public class User {
    private String fullName;
    private String dateOfBirth;
    private String code;

    public User() {
    }

    public User(String fullName, String dateOfBirth, String code) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
