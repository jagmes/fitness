import java.util.LinkedList;
import java.util.Scanner;

public class JavaProject {

    public static void main(String[] args) {
        Calculator calc = (x) -> 10 + 29; // пример лямбды
        LinkedList<Member> members = new LinkedList<>();
        Scanner select = new Scanner(System.in);
        String mem;

        MembershipManagement mm = new MembershipManagement();   // Создаём экземпляр класса
        FileHandler fh = new FileHandler();
        int choice;

        do {
            choice = mm.getChoice();
            switch (choice) {
                case 1:
                    mm.printClubOptions();
                    choice= mm.getChoice();
                    if (choice == 1){
                        
                    } else if (choice == 2) {
                        
                    } else if (choice == 3) {

                    } else if (choice ==4){

                    }
                    fh.overWriteFile(members);
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                    break;

                case 2:

                    mm.removeMember(members);
                    break;

                case 3:
                    fh.readFile();//  Это считывает из файла.
                    mem= mm.printMemberInfo((Member) members);
                    break;
            }

        }while (choice != -1) ;
    }

}
