/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

public class BookArray {
    Books[] bookTable;
    int indexArray;
    
    public BookArray(){
        bookTable = new Books[100];
        this.indexArray = 0;
    }
    
    public void saveBooks(Books book){
        this.bookTable[this.indexArray] = book;
        this.indexArray = this.indexArray + 1;
    }
    
    public Books[] getBooks(){
        return bookTable;
    }
}
