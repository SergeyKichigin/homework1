package java2.homework3;

import java.util.ArrayList;
import java.util.List;

public class Words {

    public Words() {
    }

    public void words() {
        List<String> arrayList = new ArrayList<>();
        List<String> arrList = new ArrayList<>();
        arrayList.add("Word");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Lime");
        arrayList.add("Lime");
        arrayList.add("Sun");
        arrayList.add("Orange");
        arrayList.add("Lime");
        arrayList.add("Main");
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) { arrList.add(arrayList.get(i));}
        setwords(arrList);
    }

    public void setwords(List<String> arrList) {
        String e = null;
        int n = 0;
        for (int i = 0; i < arrList.size() ; i++) {
            if (arrList.get(i) != null) e = arrList.get(i);
            for (int j = 0; j < arrList.size() ; j++) {
                if (e == arrList.get(j)) {
                    arrList.set(j, null);
                    n++;
                }
            }
            if (n !=0) System.out.println(e + " " + n);
            n = 0;
        }
    }
}
