
import java.util.HashMap;
import java.util.Map;



import com.opensymphony.xwork2.ActionSupport;

public class ModifyPwdAction extends ActionSupport{
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
        UserInfo uinfo = iuserinfo.findByName(userInfo.getUsername());
        
            if(uinfo.getUsername().equals(userInfo.getUsername())){
                //修改密码
                Map map=new HashMap();
                map.put("username",userInfo.getUsername());
                map.put("userpwd", userInfo.getUserpwd());
                iuserinfo.updateToPwd(map);
                this.addActionMessage("密码修改成功，请重新登陆");
                return "userlogin";
            }else{
                this.addActionMessage("用户名、密码错误，请重新输入");
                return "ReLogin";
            }    
    }
}