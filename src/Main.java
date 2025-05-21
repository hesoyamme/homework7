public class Main {
    public static void main(String[] args) {
        Бухгалтер бухгалтер = new Бухгалтер();
        Рабочий рабочий = new Рабочий();
        Директор директор = new Директор();

        бухгалтер.getPost();
        рабочий.getPost();
        директор.getPost();
    }
}