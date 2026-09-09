class Book{
   static int totalNoOfBooks;
   String title,author,isbn;
   boolean isBorrowed;

   Book(String title,String author,String isbn){
       this.title = title;
       this.isbn = isbn;
       this.author = author;
   }

   Book(String isbn){
      this("unknown","unknown",isbn);
   }

   static{
    totalNoOfBooks = 0;
   }
   {// onject init
      totalNoOfBooks++;
   }

   static int getTotalNoOfBooks(){
      return totalNoOfBooks;
   }
   void borrowBook(){
      if(isBorrowed){
         System.out.println("Book is already Borrowed");
      }
      else{
         this.isBorrowed = true;
         System.out.println("Enjoy "+ this.title);
      }
      
   }
   void returnBook(){
      if(isBorrowed){
         this.isBorrowed = false;
         System.out.println("Hope You enjoyed , please leave a review");
      }
      else{
         System.out.println("This book is already in the Library");
      }
   }
   public static void main(String[] args) {
      Book designOfThings = new Book("Design","author","1");
      Book myBook = new Book("2");
      System.out.println(Book.getTotalNoOfBooks());
      designOfThings.borrowBook();
      myBook.borrowBook();
      designOfThings.borrowBook();
      designOfThings.returnBook();
      designOfThings.returnBook();

   }
}
