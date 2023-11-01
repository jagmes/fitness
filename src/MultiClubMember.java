public class MultiClubMember extends Member{
    private int membershipPoints;

            public MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints) {
        super(pMemberType, pMemberID, pName, pFees);
    }

    public int getMembershipPoints() {
        return membershipPoints;
    }

    public void setMembershipPoints(int pMembershipPoints) {
        this.membershipPoints = pMembershipPoints;
    }

    @Override
    public String toString() {
        return "MultiClubMember{" +
                "membershipPoints=" + membershipPoints +
                '}';
    }
}
