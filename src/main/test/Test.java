import com.jxny.dao.impl.GoodManageImpl;
import com.jxny.service.impl.UserServiceImpl;
import com.jxny.userForm.Goods;
import com.jxny.userForm.User;

    public class Test {
        User user= new User("hh","13","12");
        User user1= new User("hh","12","11");
        UserServiceImpl impl = new UserServiceImpl();
        @org.junit.Test
        public void test(){
//        use.add(user);
//        use.delete("13");
//        use.updata(user1);
//        System.out.println(use.queryAll());
//        System.out.println(use.isExist("12"));
//        System.out.println(use.queryOne("12"));
            System.out.println(impl.islogin(user));
        }
        GoodManageImpl impl1=new GoodManageImpl();
        Goods goods = new Goods("hh",12,3,1001);
        Goods goods1 = new Goods("sb",12,3,1001);
        @org.junit.Test
        public void test1(){
            impl1.add(goods);
            System.out.println(impl1.queryOne(1003));
            impl1.delete(1003);
            System.out.println(impl1.queryAll());
            System.out.println(impl1.queryOne(1003));
            impl1.updata(goods1);
        }

    }

