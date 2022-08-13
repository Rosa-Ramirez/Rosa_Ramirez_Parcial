/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ramir
 */
public class Books {
    private String code;
    private String bookName;
    private String bookTape;
    private String bookEditorial;
    private String bookDate;
    
    public Books(String code, String bookName, String bookTape, String bookEditorial, String bookDate){
        this.code = code;
        this.bookName = bookName;
        this.bookTape = bookTape;
        this.bookEditorial = bookEditorial;
        this.bookDate = bookDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookTape() {
        return bookTape;
    }

    public void setBookTape(String bookTape) {
        this.bookTape = bookTape;
    }

    public String getBookEditorial() {
        return bookEditorial;
    }

    public void setBookEditorial(String bookEditorial) {
        this.bookEditorial = bookEditorial;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
    
    
}
