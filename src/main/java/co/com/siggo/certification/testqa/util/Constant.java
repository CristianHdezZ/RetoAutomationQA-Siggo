package co.com.siggo.certification.testqa.util;

import co.com.siggo.certification.testqa.model.DataUserResponse;
import co.com.siggo.certification.testqa.model.Product;
import co.com.siggo.certification.testqa.model.Users;
import co.com.siggo.certification.testqa.model.UsersResponse;
import org.codehaus.groovy.util.ListHashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Constant {

    public static UsersResponse USERS_RESPONSE;
    public static Users USER_DATA;
    public static List<Users> USERS_TRANS_FORMED_MOEDL;
    public static List<DataUserResponse> USERS_FILTERES;
    public static final Logger LOG_SIGGO = Logger.getLogger("co.com.siggo");
    public static final String MSG_CONSULTA_SERVICIO_REST = "---------- CONSULTA DE SERVICIO REST ----------";


    /**
     * WEBSERVICES REST
     */
    public static final String URL_API_ALL_LIST_USERS = "https://reqres.in/api/users?page=2";

}
