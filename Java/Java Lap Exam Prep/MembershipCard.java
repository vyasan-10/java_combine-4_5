public class MembershipCard {
    String memberName;
    int memberId;
    int validityYears;

    MembershipCard() {
        memberName = "Guest";
        memberId = 0;
        validityYears = 1;
    }

    MembershipCard(String memberName, int memberId, int validityYears) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.validityYears = validityYears;
    }
    void display() {
        System.out.println("Member Name:" + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Validity Years: " + validityYears);
        System.out.println();
    }
    public static void main(String[] args) {
        MembershipCard card1 = new MembershipCard();
        MembershipCard card2 = new MembershipCard("Santhosh", 101, 2);

        card1.display();
        card2.display();
    }
}
