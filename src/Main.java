import dto.User;
import service.FileToDtoService;

public class Main {
    public static void main(String[] args) {
        FileToDtoService service = new FileToDtoService();
        service.parsingProcess();
    }
}
