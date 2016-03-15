
import java.util.Date;

public class UserInfo {
	private String userid;
    private String username;
    private String userpwd;
    private int userStatus;//默认为0，正常。1为注销
    private Date userTime;
    
    
    
    public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public Date getUserTime() {
		return userTime;
	}
	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}
}
