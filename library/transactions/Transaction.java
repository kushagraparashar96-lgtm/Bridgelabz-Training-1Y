package library.transactions;


import library.books.Book;
import library.members.Member;

  public class Transaction {
    public void issueBook(Book book, Member member) {
        System.out.println("TRANSACTION SUCCESS:");
        System.out.println("Book: " + book.getBookInfo());
        System.out.println("Issued to: " + member.getMemberName());
    }
}