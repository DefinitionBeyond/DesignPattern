package ProxyPattern.dymProxy;

/**
 * @author liutao
 * @date 2017/12/27  16:18
 */
public class userServiceImpl implements userService {
    @Override
    public String getName(int id) {
        return "tom";
    }

    @Override
    public int getAge(int id) {
        return 10;
    }
}
