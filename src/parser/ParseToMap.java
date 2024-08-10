package parser;

import java.util.HashMap;
import java.util.Map;

public class ParseToMap {
    public Map<Integer, String> parseStringToMap(String mapContent) {
        Map<Integer, String> resultMap = new HashMap<>();
        String[] splits = mapContent.split(" , ");      //сплит - это разделитель, в скобках указано через что разделяем
        for (String split : splits) {
            String[] keyValue = split.split(";");      //массив ключей и значений
            if (keyValue.length == 2) {                     //зачем это?
                int key = Integer.parseInt(keyValue[0]);        //переделываем интеджер в инт
                String value = keyValue[1];
                resultMap.put(key, value);                  //добавляем все в мап через метод пут
            }
        }
        return resultMap;
    }
}
