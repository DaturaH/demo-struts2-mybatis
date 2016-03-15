
import java.util.Map;

public interface IUserInfo {
    public UserInfo findByName(String username);
    //public UserInfo findById(String userid);
    public void insertUser(UserInfo user);
    //public void updateToLock(Map map);
    //public void updateToFailedCount(Map map);
    //public void updateToIsOrNotActive(Map map);
    public void updateToPwd(Map map);
    //public void updateToPwdChangeTime(Map map);
    //public void updateToIsOrNotFirst(Map map);
    
    public void deleteUser(UserInfo user);
}