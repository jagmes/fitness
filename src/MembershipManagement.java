import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement   {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private  final Scanner reader;

    public MembershipManagement() {
        this.reader = new Scanner(System.in);
    }

    public int getIntInput(){ // вызывается каждый раз , при вызове sout() методами.
        int value = 0;
        boolean validInput = false;

        while (!validInput){
            try {
                    String input = reader.nextLine();
                    value = Integer.parseInt(input);
                    validInput = true;
                }catch (NumberFormatException exception){
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


    public int getChoice(){
        int choice;
        System.out.println("WELCOME TO OZONE F!TNESS CLUB");
        System.out.println("==============================");
        System.out.println("1) Add member.");
        System.out.println("2) Remove member.");
        System.out.println("3) Display member information .");
        System.out.println("Please enter on option or enter " +ANSI_RED+ "-1" +ANSI_RESET +"to quit.");
        choice = getIntInput();
        return choice;
    }


    public String addMembers(LinkedList <Member> members){
        String name = "";
        int club=0;
        int clubID = 0;
        double fees = 1;
        int memberID = 0;
        Calculator <Integer> cal;
        System.out.println("Введите имя: ");
        name = reader.nextLine();
        printClubOptions();
        System.out.println("Введите  номер ID  клуба: ");
        clubID=reader.nextInt();
        club = getIntInput();

        Member mbr= new Member(memberID, name, fees, club, clubID);
        members.add(mbr);
        //double additVal = cal.calculateFees(club);
        mbr.setFees(fees + club);
        String mem = "Добавлен посетитель: "  +mbr.getName()+ ",ID: "+mbr.getMemberID()+ ",цена: " +mbr.getFees();
        //заморочка  /*  Починил? */ // Жесть. // нет не починил.
        return mem;
    }

    public void removeMember(LinkedList<Member> m){
        m.remove();
    }

    public String printMemberInfo(Member m){
        // System.out.println( "Имя: " +m.getName() +"ID: " +m.getMemberID()+ "Тип: " +m.getMemberType());
        return  "Имя: " +m.getName() +"ID: " +m.getMemberID()+ "Тип: " +m.getMemberType();
    }



}
