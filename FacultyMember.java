class FacultyMember extends Members {
    private int fineperday;
    private int freeDays;
FacultyMember(String name , String date , String phone , String memberId, int fineperday, int freeDays){
    super(memberId, name, phone, date);
    this.fineperday=fineperday;
    this.freeDays=freeDays;
}

public int getFinePerDay(){
    return fineperday;
}
public int getFreeDays(){
    return freeDays;
}
// setters
public void setFinePerDay(int fineperday){
    this.fineperday=fineperday;
}
public void setFreeDays(int freeDays){
    this.freeDays=freeDays;
}
@Override
public double calculateFine(int days){
    if(days>freeDays){
        return fineperday*(days-freeDays);
    }else{
        return 0;
    }
}
@Override
public String toString(){
    return super.toString() + "|" + fineperday + "|" + freeDays;
}

}
