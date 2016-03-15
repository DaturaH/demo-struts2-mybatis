

import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport{
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
        iuserinfo.deleteUser(userInfo);
       // userInfo.printUserInfo();
        this.addActionMessage("delete success!");
        return "success";
    }
}
