package fileproccess;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void createFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);                  //записываем контент
            writer.close();                         //закрываем запись
        } catch (IOException e) {                   //обработка ошибки, в случае отсутствия файла
            System.out.println("Процесс логирования " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
