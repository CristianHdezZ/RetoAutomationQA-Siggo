package co.com.siggo.certification.testqa.interactions;

import co.com.siggo.certification.testqa.model.DataUserResponse;
import co.com.siggo.certification.testqa.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.function.Predicate;
import java.util.stream.Collectors;

import static co.com.siggo.certification.testqa.util.Constant.*;

public class FilterNameUserInter implements Interaction {
    private String strWord;

    private static Predicate<DataUserResponse> lastNameStartsWith(String letter) {
        return userName -> userName.getLastName().startsWith(letter);
    }

    public FilterNameUserInter(String strWord) {
        this.strWord = strWord;
    }

    public static FilterNameUserInter withFirstWord(String strWord) {
        return Tasks.instrumented(FilterNameUserInter.class,strWord);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        USERS_FILTERES.forEach(userName -> {
            if (userName.getFirstName().startsWith(strWord) == true) {
                USER_DATA = new Users(userName.getId().toString(),userName.getFirstName(),userName.getLastName(),userName.getEmail(),userName.getAvatar());
                System.out.println(USER_DATA.getId()+"  "+USER_DATA.getFirstName()+" "+USER_DATA.getLastName()+" "+USER_DATA.getEmail()+" "+USER_DATA.getAvatar());
            }
        });
    }
}
