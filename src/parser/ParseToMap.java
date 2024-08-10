package parser;

import java.util.HashMap;
import java.util.Map;

public class ParseToMap {
    public Map<Integer, String> parseStringToMap(String mapContent) {
        Map<Integer, String> resultMap = new HashMap<>();
        String[] splits = mapContent.split(" , ");      //����� - ��� �����������, � ������� ������� ����� ��� ���������
        for (String split : splits) {
            String[] keyValue = split.split(";");      //������ ������ � ��������
            if (keyValue.length == 2) {                     //����� ���?
                int key = Integer.parseInt(keyValue[0]);        //������������ �������� � ���
                String value = keyValue[1];
                resultMap.put(key, value);                  //��������� ��� � ��� ����� ����� ���
            }
        }
        return resultMap;
    }
}
