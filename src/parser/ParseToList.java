package parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseToList {
    public List<String> parseToList (String listContent){
        String [] splits = listContent.split(" , ");
                return new ArrayList<>(Arrays.asList(splits));       //Arrays.asList метод формирует список на основе массива
    }
}
