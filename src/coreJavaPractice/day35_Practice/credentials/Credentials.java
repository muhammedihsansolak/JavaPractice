package coreJavaPractice.day35_Practice.credentials;

public class Credentials {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)) {
            return;
        }
        this.password = password;
    }

    public boolean isHaveLetter(String password) {
        boolean result = false;
        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isHaveDigit(String password) {
        boolean result = false;
        for (char each : password.toCharArray()) {
            if (Character.isDigit(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isHaveSpecial(String password) {
        boolean result = false;
        for (char each : password.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isStrongPassword(String password) {
        return password.length() >= 8 && !password.contains(" ") && isHaveLetter(password) && isHaveLetter(password) && isHaveSpecial(password);
    }


    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
