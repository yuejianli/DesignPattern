package top.yueshushu.one;

import cn.hutool.core.collection.CollectionUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class XueYuan extends OrgComponent{

    private List<OrgComponent> children = new ArrayList<>();

    public XueYuan(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void add(OrgComponent orgComponent) {
        children.add(orgComponent);
    }

    @Override
    public void remove(OrgComponent orgComponent) {
        Iterator<OrgComponent> iterator = children.iterator();
        while(iterator.hasNext()) {
            OrgComponent next = iterator.next();
            if (next.getName().equals(orgComponent.getName())) {
                iterator.remove();
            }
        }
    }
    @Override
    public OrgComponent getChild(int i) {
        if (children.size() > i) {
            return children.get(i);
        }else {
            return null;
        }
    }
    @Override
    public void print() {
       if (!CollectionUtil.isEmpty(children)){
           log.info(">>>>>>>>>>>{}",getName());
           for (OrgComponent orgComponent : children) {
               orgComponent.print();
           }
       }
    }
}
