package ProxyPattern.StaicProxy;

/**
 * @author liutao
 * @date 2017/12/27  15:29
 */
public interface Subject {
    public void addUser(String userId, String userName);

    public void modifyUser(String userId, String userName);

    public void delUser(String userId);

    public String findUser(String userId);
}
