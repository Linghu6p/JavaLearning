package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List>{//限制泛型的类型
    public static void main(String[] args) {
        LimitClass<ArrayList> L1 = new LimitClass<ArrayList>();
        LimitClass<LinkedList> L2  = new LimitClass<LinkedList>();
    }
}
