package ProxyPattern.StaicProxy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author liutao
 * @date 2017/12/27  15:30
 */
public class realUser implements Subject {
    private static Map<String, String> map = new HashMap<>();

    @Override
    public void addUser(String userId, String userName) {
        map.put(userId, userName);
        System.out.println("正在添加用户,用户为：" + userId + userName + "……");
        scanMap();
    }

    @Override
    public void modifyUser(String userId, String userName) {
//        map.get(userId);
        Iterator iterator = map.keySet().iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (key.equals(userId)) {
                map.put(userId, userName);
                flag = true;
            }
        }
        if (!flag) {
            map.put(userId, userName);
        }
        System.out.println("修改modifyUser,userId=" + userId);
        scanMap();
    }

    @Override
    public void delUser(String userId) {
        System.out.println();
        scanMap();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (key.equals(userId)) {
                iterator.remove();
                /**
                 * iterator.remove();
                 * Iterator 工作在一个独立的线程中，并拥有一个mutex锁。
                 * Iterator被创建后会建立一个指向原来对象的单链索引表，
                 * 当原来的对象数量发生变化时，这个索引表的内容不会同步改变，
                 * 所以当索引指针往后移动的时候就找不到要迭代的对象，
                 * Iterator会抛出java.util.ConcurrentModificationException异常。
                 *
                 *　所以Iterator在工作的时候是不允许被迭代的对象被改变的。
                 * 但可使用Iterator本身的remove()来删除对象，
                 * Iterator.remove()方法会在删除当前迭代对象的同时保持索引的一致性。
                 */
                map.remove(key);
            }
        }

        System.out.println("删除delUser,userId=" + userId);
        scanMap();
    }

    @Override
    public String findUser(String userId) {
        System.out.println("findUser,userId=" + userId);
        return userId;
    }

    public void scanMap() {
        map.forEach((k, v) -> {
            System.out.println("userID:" + k + '\n' + "username:" + v);
        });
    }
}
