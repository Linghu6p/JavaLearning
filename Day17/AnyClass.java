package Day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnyClass {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        for (int i = 0; i < a.size(); ++i) {
            System.out.println("获取ArrayList容器的值：" + a.get(i));
        }
        Map<Integer,String> m =new HashMap<Integer, String>();
        for(int i=0;i<5;++i){
            m.put(i,"傻逼王文尧"+(i+1)+"号");
        }
        for(int i=0;i<m.size();++i) {
            System.out.println(m.get(i)+"报道");
        }

    }
}
