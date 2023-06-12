package top.yueshushu.dimite.one;

import lombok.Builder;
import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-24
 */
@Data
@Builder
public class User {
    private Integer id;
    private String name;
}
