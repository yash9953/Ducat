package DucatOOps;

class Book {
          String title;
          int pages;

          Book() {
          }

          Book(String title, int pages) {
                    this.title = title;
                    this.pages = pages;
          }

          void settitle(String title) {
                    this.title = title;
          }

          String gettitle() {
                    return title;
          }

          void setpages(int i) {
                    pages = i;
          }

          int getpages() {
                    return pages;
          }
}

class Textbook extends Book {
          int gradelevel;

          void setgradelevel(int i) {
                    gradelevel = i;
          }

          int getgradelevel() {
                    return gradelevel;
          }
}

class DemoBook {
          public static void main(String[] args) {
                    Book b = new Book("Let Us Java", 340);
                    Textbook t = new Textbook();
                    t.settitle("The TextBook title");
                    t.setgradelevel(10);

                    System.out.println("Book Title: " + b.gettitle());
                    System.out.println("Textbook Title: " + t.gettitle());
                    System.out.println("Textbook Grade Level: " + t.getgradelevel());
          }
}