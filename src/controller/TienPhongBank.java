package controller;

import common.Library;
import java.util.ArrayList;
import java.util.Locale;
import model.Users;
import repository.UserRepository;
import view.Menu;
import repository.IUserRepository;

public class TienPhongBank extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    
    private Library library;
    private IUserRepository userRepository;
    Locale vietnamese = new Locale("vi");
    Locale english = Locale.ENGLISH;
    
    ArrayList<Users> students = new ArrayList<>();
    
    public TienPhongBank() {
        super("============================== Login Program ==============================", mc);
        library = new Library();
        userRepository = new UserRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                userRepository.login(vietnamese);
                break;
            case 2:
                userRepository.login(english);
                break;
            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    
    
}