package ApiConcepts.ApiConcepts;

import com.example.types.Appointment;
import com.example.types.Session;
import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.util.List;

/**
 * Created by jrohi on 2/7/2023.
 */
public class Service extends BaseClass {


    public Response getAppointments(String districtId, String date) {

        try {
            setup();
        } catch (IOException e) {
            e.printStackTrace();
        }
        RequestSpecification spec = RestAssured.given();
        System.out.print(prop.get("host").toString());
        Response response = spec.baseUri(prop.get("host").toString()).basePath(prop.get("path").toString())
                .queryParam("district_id", districtId)
                .queryParam("date", date)
                .header("Accept-Language", "hi_IN")
                .get();

        return response;


    }





    public static void main(String[] args) {


        Service services = new Service();
        Response response = services.getAppointments("265", "23-07-2022");

        Gson gson = new Gson();

        Appointment appointment= gson.fromJson(response.asString(), Appointment.class);

        System.out.println(response.asString());
        List<Session> sessions = appointment.getSessions();
        int numberOfHospitals = 0;
        int numberOfSlotsTotal = 0;
        System.out.println("total size is " + sessions.size());
        for (Session session : sessions) {
            if (session.getFeeType() != null && session.getVaccine() != null)
                if (session.getFeeType().equals("Free") && session.getVaccine().equals("COVISHIELD")) {
                    numberOfHospitals++;
                    numberOfSlotsTotal += session.getSlots().size();
                    System.out.println("hospital name is   " + session.getName() + "  and number of slots are  " + session.getSlots().size());
                }
        }
        System.out.println("Total hospitals are " + numberOfHospitals);
        System.out.println("number of slots are " + numberOfSlotsTotal);

    }


}