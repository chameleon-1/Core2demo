package dto;

public class User {
    private String name;
    private String message;
    private String personalNumber;
    private Integer password;

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public Integer getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", password=" + password +
                '}';
    }
}
