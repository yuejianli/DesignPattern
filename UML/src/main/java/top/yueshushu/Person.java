package top.yueshushu;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-24
 */
@Data
public class Person {
   private IDCard idCard;

   // 不可以分割，在成员变量时，直接构造。
   private Head head = new Head();
}
