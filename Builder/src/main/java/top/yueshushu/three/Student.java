package top.yueshushu.three;

import lombok.Builder;
import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Data
@Builder
public class Student {
    private Integer id;
    private String name;
    private String sex;
}

//public class Student {
//    private Integer id;
//    private String name;
//    private String sex;
//
//    Student(Integer id, String name, String sex) {
//        this.id = id;
//        this.name = name;
//        this.sex = sex;
//    }
//
//    public static Student.StudentBuilder builder() {
//        return new Student.StudentBuilder();
//    }
//
//    public static class StudentBuilder {
//        private Integer id;
//        private String name;
//        private String sex;
//
//        StudentBuilder() {
//        }
//
//        public Student.StudentBuilder id(Integer id) {
//            this.id = id;
//            return this;
//        }
//
//        public Student.StudentBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Student.StudentBuilder sex(String sex) {
//            this.sex = sex;
//            return this;
//        }
//
//        public Student build() {
//            return new Student(this.id, this.name, this.sex);
//        }
//
//        public String toString() {
//            return "Student.StudentBuilder(id=" + this.id + ", name=" + this.name + ", sex=" + this.sex + ")";
//        }
//    }
//}
