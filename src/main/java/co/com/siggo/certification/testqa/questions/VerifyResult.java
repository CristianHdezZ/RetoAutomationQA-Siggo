package co.com.siggo.certification.testqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;

import static co.com.siggo.certification.testqa.util.Constant.*;

public class VerifyResult implements Question<Boolean> {
    private List<Map<String,String>> mapsResultUsers;

    public VerifyResult(List<Map<String, String>> mapsResultUsers) {
        this.mapsResultUsers = mapsResultUsers;
    }

    public static VerifyResult ofUsers(List<Map<String, String>> mapsResultUsers) {
        return new VerifyResult(mapsResultUsers);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return USER_DATA.getId().equalsIgnoreCase(mapsResultUsers.get(0).get("id"))&&
                USER_DATA.getFirstName().equalsIgnoreCase(mapsResultUsers.get(0).get("firstName")) &&
                USER_DATA.getLastName().equalsIgnoreCase(mapsResultUsers.get(0).get("lastName"))&&
                USER_DATA.getEmail().equalsIgnoreCase(mapsResultUsers.get(0).get("email"));
    }
}
