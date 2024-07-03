import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        //创建map
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(4,"ddd");
        map.put(5,"eee");

        //迭代器遍历 entrySet()
        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        System.out.println("迭代器遍历entryset");
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        //迭代器遍历 keySet
        System.out.println("迭代器遍历keySet");
        Iterator<Integer> iterator1=map.keySet().iterator();
        while (iterator1.hasNext()){
            Integer key=iterator1.next();
            System.out.println(key+":"+map.get(key));
        }

        //foreach
        System.out.println("foreach");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //foreach keyset
        System.out.println("keyset");
        for (Integer key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }


    }

}
