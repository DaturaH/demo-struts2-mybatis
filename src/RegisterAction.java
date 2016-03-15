
import java.util.Date;


import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private UserInfo userInfo;
    private IUserInfo iuserinfo;
    
    public UserInfo getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    @Override
    public String execute() throws Exception {
        iuserinfo = new IUserInfoImpl();
        
        userInfo.setUserTime(new Date());
        
        iuserinfo.insertUser(userInfo);
        
      //  userInfo.printUserInfo();
        this.addActionMessage("register success!");
        return "success";
    }
}
