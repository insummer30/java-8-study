package ind.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2020/03/09
 *
 * @author tom.j
 */
public class FilterExMain {
    public static void main(String[] args) {
        List<Item> exList = new ArrayList<>();

        // 샘플 데이터 넣기
        for (int i = 1; i <= 10; i++) {
            exList.add(new Item(i, "data" + i));
        }

        // 5를 제외한 리스트 만들기
        List<Item> resultList = exList.stream().filter(oneItem -> oneItem.id != 5).collect(Collectors.toList());

        for (int i = 0 ; i < resultList.size() ; i++) {
            System.out.println(resultList.get(i).id);
        }
    }

    static class Item {
        public int id;
        public String data;

        public Item(int id, String data) {
            this.id = id;
            this.data = data;
        }
    }
}
