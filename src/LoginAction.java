
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static int failedcount = 0;
    private UserInfo userInfo;
    private IUserInfo iuinfo ;
    public UserInfo getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String execute() throws Exception {
        //boolean flag = userLogin.checkUsername(userInfo.getUsername());
        // 根据username获得userpwd
        //System.out.println("flag=" + flag);
        //UserInfo uinfo =null;
        
        
        iuinfo = new IUserInfoImpl();
        UserInfo uinfo = iuinfo.findByName(userInfo.getUsername());
 
        System.out.println("userInfo.userpwd=" + userInfo.getUserpwd() + ",userInfo.username=" +userInfo.getUsername());
    
        System.out.println("uinfo.userpwd=" + uinfo.getUserpwd() + ",uinfo.username=" +uinfo.getUsername());
    
        if (uinfo.getUsername().equals(userInfo.getUsername())) {
            
            if (!uinfo.getUserpwd().equals(userInfo.getUserpwd())) {
                
                if (failedcount == 3) {
                    // 记录failedcount+1，并记录当前时间errortime和修改ISORNOTLOCK锁定状态
                            uinfo.getUsername();
                    this.addActionMessage("sorry! 密码不正确！登录错误次数已经3次，请于10分钟后再尝试登录。");
                }else {
                    failedcount++;
                    this.addActionMessage("sorry! 密码不正确！");
                }
                return "error";
            } else {
                //修改为：userStatus，0：正常，1：注销
                // 如果密码匹配
                if (uinfo.getUserStatus() == 0) {
                    // 判断是否是激活的，如果未激活 ##1：激活 ，0：未激活
                    this.addActionMessage("用户正常");
                    return "success";
                } else if (uinfo.getUserStatus() == 1) {
                    this.addActionMessage("用户已注销！");
                    return "error";
                }
            }
        } else {
            this.addActionMessage("不存在的用户！");
            return "error";
        }
    return null;
    
    }
}