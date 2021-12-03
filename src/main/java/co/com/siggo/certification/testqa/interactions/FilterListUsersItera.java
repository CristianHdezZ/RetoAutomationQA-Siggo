package co.com.siggo.certification.testqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Level;
import java.util.stream.Collectors;
import static co.com.siggo.certification.testqa.util.Constant.*;
import static co.com.siggo.certification.testqa.util.MetodosComunes.*;

public class FilterListUsersItera implements Interaction {
    private String strId;

    public FilterListUsersItera(String strId) {
        this.strId = strId;
    }

    public static FilterListUsersItera withId(String strId) {
        return Tasks.instrumented(FilterListUsersItera.class,strId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

         USERS_FILTERES = USERS_RESPONSE.getData()
                .stream()
                .filter(user -> user.getId() <= Integer.parseInt(strId))
                .collect(Collectors.toList());

         adicionarLog(Level.INFO,String.format("Consulta de Usuarios con id menor a: %s ",strId));

        USERS_FILTERES.forEach(user -> adicionarLog(Level.INFO,String.format("Id: %s  - First name: %s - LastName: %s - Email: %s - Avatar: %s",
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAvatar())));
    }
}
