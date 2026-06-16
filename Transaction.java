public class Transaction {
    private String transactionId;
    private String bookId;
    private String memberId;
    private String issueDate;
    private String returnDate;
    private int fine;

// constructor
Transaction(String transactionId , String bookId , String memberId , String issueDate ){
        this.transactionId= transactionId;
        this.bookId=bookId;
        this.memberId=memberId;
        this.issueDate=issueDate;
        this.fine=0;
        this.returnDate=null;
     }
public String getTransactionId(){
    return transactionId;
}
public String getMemberId(){
    return memberId;
}
public String getBookId(){
    return bookId;
}
public String getIssueDate(){
    return issueDate;
}
public String getReturnDate(){
    return returnDate;
}
public int getFine(){
    return fine;
}
// setters
public void setReturnDate(String returnDate){
    this.returnDate=returnDate;
}
public void setFine(int fine){
    this.fine=fine;
}
@Override
public String toString(){
    return transactionId+ "|" + memberId + "|" + bookId + "|" + issueDate + "|" + returnDate+ "|" + fine;
}

}
