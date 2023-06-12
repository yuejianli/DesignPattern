package top.yueshushu.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
    private String name;
    private String author;
}
