package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-24
 */

public class PersonServiceBean  implements PersonService{
    private PersonDao personDao;

    public void save(Person person) {

    }

    public IDCard getIdCard(Integer personId){
        return new IDCard();
    }

    public Dept getDept() {
        Dept dept = new Dept();
        return dept;
    }
}
