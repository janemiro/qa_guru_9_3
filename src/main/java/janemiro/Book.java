package janemiro;

public class Book {
    String name;
    String author;
    int amountOfPages;
    boolean hardCover;
    double paperDensity;

    public void libraryCatalog() {
        System.out.println(author + ". " + name + ". Страниц: " + amountOfPages + ". Плотность бумаги: " + paperDensity);
    }

    public static void main(String[] args) {
        Book javaTextbook = new Book();

        javaTextbook.author = "Кэти Сьерра";
        javaTextbook.name = "изучаем java";
        javaTextbook.hardCover = true;
        javaTextbook.amountOfPages = 256;
        javaTextbook.paperDensity = 1.47;

        Book idiot = new Book();
        idiot.author = "Ф. М. Достоевский";
        idiot.name = "идиот";
        idiot.hardCover = false;
        idiot.amountOfPages = 500;
        idiot.paperDensity = 2.23;

        javaTextbook.libraryCatalog();
        idiot.libraryCatalog();

    }
}
