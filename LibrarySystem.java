// Интерфейс Borrowable
interface Borrowable {
    void borrow();
    void returnItem();
}

// Абстрактный класс LibraryItem
abstract class LibraryItem {
    protected String title;
    protected String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры для title и author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Абстрактный метод для отображения информации
    public abstract void displayInfo();
}

// Класс Book
class Book extends LibraryItem implements Borrowable {
    private String isbn;
    private int publicationYear;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn, int publicationYear) {
        super(title, author);
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    @Override
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Книга \"" + title + "\" взята в аренду.");
        } else {
            System.out.println("Книга \"" + title + "\" уже арендована.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Книга \"" + title + "\" возвращена.");
        } else {
            System.out.println("Книга \"" + title + "\" не была арендована.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Год публикации: " + publicationYear);
        System.out.println("Статус: " + (isBorrowed ? "Арендована" : "Доступна"));
    }
}

// Класс Magazine
class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;
    private boolean isBorrowed;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
        this.isBorrowed = false;
    }

    @Override
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Журнал \"" + title + "\" (номер " + issueNumber + ") взят в аренду.");
        } else {
            System.out.println("Журнал \"" + title + "\" (номер " + issueNumber + ") уже арендован.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Журнал \"" + title + "\" (номер " + issueNumber + ") возвращен.");
        } else {
            System.out.println("Журнал \"" + title + "\" (номер " + issueNumber + ") не был арендован.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Журнал: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Номер выпуска: " + issueNumber);
        System.out.println("Статус: " + (isBorrowed ? "Арендован" : "Доступен"));
    }
}

// Демонстрация работы системы
public class LibrarySystem {
    public static void main(String[] args) {
        // Создаем объекты книг и журналов
        Book book1 = new Book("1984", "Джордж Оруэлл", "978-0451524935", 1949);
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", 256);

        // Отображаем информацию о книгах и журналах
        book1.displayInfo();
        magazine1.displayInfo();

        // Арендуем книгу и журнал
        book1.borrow();
        magazine1.borrow();

        // Пытаемся арендовать уже арендованную книгу
        book1.borrow();

        // Возвращаем книгу и журнал
        book1.returnItem();
        magazine1.returnItem();

        // Пытаемся вернуть уже возвращенный журнал
        magazine1.returnItem();
    }
}