
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class IUserInfoImpl implements IUserInfo {

    public void deleteUser(UserInfo user) {
        SqlSession session = MybatisUtils.currentSession();
        IUserInfo iUserInfoDao = session.getMapper(IUserInfo.class);
        iUserInfoDao.deleteUser(user);
        session.commit();
        MybatisUtils.closeSession(session);

    }

    public UserInfo findByName(String username) {
        SqlSession session = MybatisUtils.currentSession();
        IUserInfo iUserInfoDao = session.getMapper(IUserInfo.class);       
        return iUserInfoDao.findByName(username);
    }

    public void insertUser(UserInfo user) {
        SqlSession session = MybatisUtils.currentSession();
        IUserInfo iUserInfoDao = session.getMapper(IUserInfo.class);
        iUserInfoDao.insertUser(user);
        session.commit();
        MybatisUtils.closeSession(session);
    }

    public void updateToPwd(Map map) {
        SqlSession session = MybatisUtils.currentSession();
        IUserInfo iUserInfoDao = session.getMapper(IUserInfo.class);
        iUserInfoDao.updateToPwd(map);
        session.commit();
        MybatisUtils.closeSession(session);
    }
}

