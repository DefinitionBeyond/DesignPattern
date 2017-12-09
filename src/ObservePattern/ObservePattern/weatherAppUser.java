package ObservePattern.ObservePattern;

import javax.security.auth.Subject;

/**
 * @author liutao
 * @date 2017/12/9  13:55
 */

/**
 * 实现Observe代表是观察者
 */
public class weatherAppUser implements Observe, DisplayMassage {

    private String name;

    private float temp; //订阅的消息内容

    private subject weatherData;

    public weatherAppUser(subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this); //把该观察者加入注册表
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(getName() + "用户，，刚刚更新气温是:" + temp); // 显示更新信息内容
    }

    @Override
    public void update(float temp) {
        this.temp = temp;
        display();
    }
}
