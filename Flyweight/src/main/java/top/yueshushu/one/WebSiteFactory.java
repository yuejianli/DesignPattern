package top.yueshushu.one;

import java.util.HashMap;
import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class WebSiteFactory {

    private Map<String, WebSite> webSiteMap = new HashMap<>();


    public WebSite getType (String type) {
        if (!webSiteMap.containsKey(type)) {
            webSiteMap.put(type,new ConcreteWebSite(type));
        }
        return webSiteMap.get(type);
    }

    public int count () {
        return webSiteMap.size();
    }
}
