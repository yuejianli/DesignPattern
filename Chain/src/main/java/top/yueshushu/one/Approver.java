package top.yueshushu.one;

import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Data
public abstract class Approver {
    private Approver next;
    private String name;

    public Approver (String name) {
        this.name = name;
    }

    public abstract void processRequest (BuyAudit buyAudit) ;

}
