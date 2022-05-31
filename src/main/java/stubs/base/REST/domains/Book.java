package stubs.base.REST.domains;

public class Book {
    private String name;
    private String author;
    private String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        StringBuilder string_representation = new StringBuilder();
        string_representation.append("{");
        string_representation.append(this.name);
        string_representation.append(", ");
        string_representation.append(this.author);
        string_representation.append(", ");
        string_representation.append(this.year);
        string_representation.append("} ");
        return string_representation.toString();
    }
}
