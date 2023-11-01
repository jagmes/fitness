public class SingleClubMember extends Member{

    private int club;

    public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);
    }


    public int getClub() {
        return club;
    }

    public void setClub(int pClub) {
        this.club = pClub;
    }

    @Override
    public String toString() {
        return "SingleClubMember{" +
                "club=" + club +
                '}';
    }
}