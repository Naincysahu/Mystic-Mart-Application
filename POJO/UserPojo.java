package eMart.pojo;
public class UserPojo {
    private String userId;
    private String empId;
    private String password;
    private String userType;
    private String userName;

    @Override
    public String toString() {
        return "UserPojo{" + "userId=" + userId + ", empId=" + empId + ", password=" + password + ", userType=" + userType + ", userName=" + userName + '}';
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
