package fileproccess;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void createFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);                  //���������� �������
            writer.close();                         //��������� ������
        } catch (IOException e) {                   //��������� ������, � ������ ���������� �����
            System.out.println("������� ����������� " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
