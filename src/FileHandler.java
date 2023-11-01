import java.io.*;
import java.util.LinkedList;

public class FileHandler {

    public void readFile(){
        LinkedList<Member>members = new LinkedList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line= reader.readLine())!= null){
                String [] data = line.split(",");
                if (data.length>=1);{
                char pMemberType = data[0].charAt(0);
                int pMemberID = Integer.parseInt(data[1]);
                String pName = data[2];
                double pFees = Double.parseDouble(data[3]);
                int pMShip = Integer.parseInt(data[4]);

                Member member = new Member(pMemberType, pMemberID, pName, pFees);   /*'a', 11, "string", 11.3, 22*/
                members.add(member);
            }}
        } catch (IOException e) {e.printStackTrace();}
        System.out.println(members);;
    }

    public void appendFile(String mem){
        try(BufferedWriter writer =  new BufferedWriter(new FileWriter("data.csv", true))) {
            writer.write(mem);
            writer.newLine();
        }catch (IOException e) {
        }

    }

    public void overWriteFile(LinkedList<Member> m){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("data.csv"))) {
                for (Member member: m){
                    char pMType = member.getMemberType();
                    int pMID = member.getMemberID();
                    String pName = member.getName();
                    double pF = member.getFees();
                                                   //int pMShip = member.
                    String line = pMType + "," + pMID + "," + pName +"," +pF;
                    writer.write(line);
                    writer.newLine();
                }
        } catch (IOException e) {}

    }


}
