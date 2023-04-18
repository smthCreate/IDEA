package sem_5;

import java.util.List;
import java.util.Scanner;

public class View {
    public String view(List<?> peopleList) {
        return peopleList.toString();
    }

    public String run() {
        System.out.println("Menu:\n1. To show all Teachers\nTo show all Students\n3. To add new Student\n4. To add new Teacher");
        String answer = prompt("Hello! What do you want to do?");
        return answer;
    }
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    public void outList(List ls){
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));

        }
    }
}
