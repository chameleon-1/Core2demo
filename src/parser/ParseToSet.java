package parser;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ParseToSet {
    public Set<String> parseToSet(String setContent) {
        Set<String> resultSet = new HashSet<>();
        String[] splits = setContent.split(" , ");
        Collections.addAll(resultSet, splits);
        return resultSet;
    }
}
