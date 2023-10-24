package model;

public class Users{
    private String accountNumberString, password, capcha;

    public Users() {
    }

    public Users(String accountNumberString, String password, String capcha) {
        this.accountNumberString = accountNumberString;
        this.password = password;
        this.capcha = capcha;
    }

    public String getAccountNumberString() {
        return accountNumberString;
    }

    public void setAccountNumberString(String accountNumberString) {
        this.accountNumberString = accountNumberString;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCapcha() {
        return capcha;
    }

    public void setCapcha(String capcha) {
        this.capcha = capcha;
    }
    
    @Override
    public String toString() {
        return "Users{" + "accountNumberString=" + accountNumberString + ", password=" + password + '}';
    }

    
    

}
