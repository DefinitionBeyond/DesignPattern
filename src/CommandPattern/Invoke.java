package CommandPattern;

/**
 * @author liutao
 * @date 2018/1/17  17:12
 */

/**
 * 请求者角色
 * 调用命令对象，执行客户请求
 */
public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
