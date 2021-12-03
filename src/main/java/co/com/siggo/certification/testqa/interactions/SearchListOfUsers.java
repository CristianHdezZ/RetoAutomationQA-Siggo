package co.com.siggo.certification.testqa.interactions;

import co.com.siggo.certification.testqa.model.DataUserResponse;
import co.com.siggo.certification.testqa.model.Users;
import co.com.siggo.certification.testqa.model.UsersResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


import java.util.ArrayList;
import java.util.logging.Level;

import static co.com.siggo.certification.testqa.util.Constant.*;
import static co.com.siggo.certification.testqa.util.MetodosComunes.*;

public class SearchListOfUsers implements Interaction {

    public static SearchListOfUsers inTheAPI() {
        return Tasks.instrumented(SearchListOfUsers.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        USERS_RESPONSE = SerenityRest
                .given()
                .get(URL_API_ALL_LIST_USERS)
                .as(UsersResponse.class);


        adicionarLog(Level.INFO,String.format("%s \n ----- Todos los Usuarios ----: %s \n "
                ,MSG_CONSULTA_SERVICIO_REST,
                URL_API_ALL_LIST_USERS));

        USERS_TRANS_FORMED_MOEDL = new ArrayList<>();

        USERS_RESPONSE.getData()
                .forEach(user -> USERS_TRANS_FORMED_MOEDL
                        .add(new Users(user.getId().toString(),user.getFirstName(),user.getLastName(),user.getEmail(),user.getAvatar())
                        )
                );
        for (DataUserResponse user: USERS_RESPONSE.getData()){
            adicionarLog(Level.INFO,
                    String.format("Id: %s  - First name: %s - LastName: %s - Email: %s - Avatar: %s",
                            user.getId(),
                            user.getFirstName(),
                            user.getLastName(),
                            user.getEmail(),
                            user.getAvatar()
                    ));
        }

    }
}
