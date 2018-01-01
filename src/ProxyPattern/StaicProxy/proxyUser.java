package ProxyPattern.StaicProxy;

/**
 * @author liutao
 * @date 2017/12/27  15:31
 */
public class proxyUser implements Subject {
    private realUser user;

    public proxyUser(realUser user) {
        this.user = user;
    }

    @Override
    public void addUser(String userId, String userName) {
        user.addUser(userId, userName);
    }

    @Override
    public void modifyUser(String userId, String userName) {
        user.modifyUser(userId, userName);
    }

    @Override
    public void delUser(String userId) {
        user.delUser(userId);
    }

    @Override
    public String findUser(String userId) {
        return user.findUser(userId);
    }
}
