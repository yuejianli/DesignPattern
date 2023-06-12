package top.yueshushu.one;

import java.util.HashMap;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class ConcreteMediator implements Mediator{
    private HashMap <String,Colleague> colleagueHashMap = new HashMap<>();

    @Override
    public void register(String name, Colleague colleague) {
        colleagueHashMap.put(name,colleague);
    }

    @Override
    public void getCmdMessage(String name, String cmd) {
        // 根据名称，获取信息.
        Colleague colleague = colleagueHashMap.get(name);
        if (colleague == null) {
            return ;
        }
        if (colleague instanceof TVColleague) {
            // 是电视相应的
            TVColleague tvColleague = (TVColleague) colleague;
            if ("on".equals(cmd)){
                tvColleague.on();
            }else if ("off".equals(cmd)){
                tvColleague.off();
            }
        }else if (colleague instanceof PhoneColleague) {
            // 是电视相应的
            PhoneColleague phoneColleague = (PhoneColleague) colleague;
            if ("call".equals(cmd)){
                phoneColleague.call();
            }else if ("wx".equals(cmd)){
                phoneColleague.wx();
            }
        }

    }
}
