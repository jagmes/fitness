import java.util.LinkedList;
import java.util.Scanner;

public class JavaProject {

    public static void main(String[] args) {

        LinkedList<Member> members = new LinkedList<>();
        Scanner select = new Scanner(System.in);
        String mem;

        MembershipManagement mm = new MembershipManagement();   // Создаём экземпляр класса
        FileHandler fh = new FileHandler();
        int choice;

        do {
            choice = mm.getChoice();
            switch (choice) {
                case 1-> {mem = mm.addMembers(members); fh.appendFile(mem);}
                case 2 -> {mm.removeMember(members);fh.overWriteFile(members);}

                case 3-> {//fh.readFile(); //  Это считывает из файла.
                                        mm.printMemberInfo((Member) members);}

            }

        }while (choice != -1) ;
    }

}
