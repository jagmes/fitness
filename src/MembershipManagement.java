import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private final Scanner reader;

    public MembershipManagement() {
        this.reader = new Scanner(System.in);
    }

    public int getIntInput() { // вызывается каждый раз , при вызове sout() методами.
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                String input = reader.nextLine();
                value = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException exception) {
                System.out.println("Некорректные данные, ведите целое число!");
            }
        }
        return value;
    }


    public void printClubOptions() {
        System.out.println("1. Club Mercury");
        System.out.println("2. Club Neptune");
        System.out.println("3. Club Jupiter");
        System.out.println("4. Multi clubs");
    }


    public int getChoice() {
        int choice;
        System.out.println("WELCOME TO OZONE F!TNESS CLUB");
        System.out.println("==============================");
        System.out.println("1) Add member.");
        System.out.println("2) Remove member.");
        System.out.println("3) Display member information .");
        System.out.println("Please enter on option or enter " + ANSI_RED + "-1" + ANSI_RESET + "to quit.");
        choice = getIntInput();
        return choice;
    }


    public String addMembers(LinkedList<Member> m) {
        String name = "";
        int club = 0;
        int clubID = 0;
        double fees = 1;
        int memberID = 0;
        String mem = "";

        Member mbr;
        Calculator<Integer> cal;
        System.out.println("Введите имя: ");
        name = reader.nextLine();
        printClubOptions();
        System.out.println("Введите  номер ID  клуба: ");
        clubID = reader.nextInt();    // назначаем ID Клуба
        club = reader.nextInt();
        if (m.size() > 0) {
            memberID = m.getLast().getMemberID() + 1; // проверяем последний ИД пользователя и не = ли он нулю.
        } else memberID = 1;
        if (club != 4) { // 1  клуб
            cal = (n) -> {
                switch (n) {
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            fees = cal.calculateFees(club);
            mbr = new SingleClubMember('S', memberID, name, fees,
                    club);
            m.add(mbr);
            mem = "Добавлен посетитель: " + mbr.getName() + " ID: " + mbr.getMemberID() + " цена: " + mbr.getFees();
            return mem;
        } else if (club == 4) { // нескольких клубов
            cal = (n) -> {
                return 1200;
            };
            fees = cal.calculateFees(club);
            int pMembershipPoints = 0;
            mbr = new MultiClubMember('M', memberID, name, fees, pMembershipPoints);
            m.add(mbr);
            mem = "Добавлен посетитель: " + mbr.getName() + " ID: " + mbr.getMemberID() + " цена: " + mbr.getFees();
            return mem;
        }
        //  Member mbr= new Member(memberID, name, fees, club, clubID);
        return mem;
    }

    public void removeMember(LinkedList<Member> m) {
        int memID;
        System.out.println("Введите чмслловой ID  пользователя, которого хотите удалить.");
        memID = reader.nextInt();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memID) {
                m.remove(i);
                System.out.println("Посетитель удалён.");
                return;
            }
        }

    }

    public void printMemberInfo(Member m) {
        int memID;
        System.out.println("Пользователя с каким ID  вывести?");
        memID = reader.nextInt();
        for (int i = 0; i <m.size() ; i++) {
            if (m.get(i).getMemberID() == memID){
                m.toString();}
            String[] memberInfo = m.get(i).toString().split(", ");
            System.out.println(memberInfo);

        }
    }
}



