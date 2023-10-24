package data_access;

import common.Library;
import java.util.Locale;
import model.Users;

public class UsersDao {
    private static UsersDao instance = null;
    Library library = new Library();
    Users users = new Users();
    
    public static UsersDao Instance() {
        if (instance == null){
            synchronized (UsersDao.class) {
                if (instance == null){
                    instance = new UsersDao();
                }
            }
        }
        return instance;
    }
    
    public void login(Locale language) {
        library.getWordLanguage(language, "enterAccountNumber");
        int accountNumber = library.checkInputAccount(language);
        library.getWordLanguage(language, "enterPassword");
        String passString = library.checkInputPassword(language);
        System.out.println("Capcha: ");
        String captchaGenerated = library.generateCaptchaText();
        while (true) {
            if (library.checkInputCaptcha(captchaGenerated, language)) {
                library.getWordLanguage(language, "loginSuccess");
                System.out.println();
                return;
            } else {
                library.getWordLanguage(language, "errCaptchaIncorrect");
                System.out.println();
            }
        }
    }
    
}
