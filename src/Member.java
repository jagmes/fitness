import java.util.LinkedList;

public class Member extends LinkedList<Member> implements Calculator{
    // поля
    private char memberType;
    private int memberID;
    private String name;
    private double fees;
    private int club;
    private  int membershipPoints;

    //Конструктор.
    public Member(char pMemberType, int pMemberID, String pName, double pFees /*int pMembershipPoints*/) {
         this.memberType = pMemberType;
        this.memberID = pMemberID;
        this.name = pName;
        this.fees = pFees;
     //   this.membershipPoints = pMembershipPoints;
    }

    public Member(int memberID, String name, double fees, int club, Object object) {
    }
    // IDE
   /* public Member(char pMemberType, int pMemberID, String pName, double pFees, int club, Calculator cal) {
    }
    //IDE
    public Member(int memberID, String name, double fees, int club, Calculator<Integer> cal) {
    }*/


    // геттеры
    public char getMemberType() {
        return memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }

    // сеттеры




    public void setMemberType(char pMemberType) {
        this.memberType = pMemberType;
    }

    public void setMemberID(int pMemberID) {
        this.memberID = pMemberID;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public void setFees(double pFees) {
        this.fees = pFees;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberType=" + memberType +
                ", memberID=" + memberID +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }


    @Override
    public double calculateFees(Object ClubID) {
        return 0;
    }
}

