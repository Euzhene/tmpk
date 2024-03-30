package com.makuku.tmpk.repos;

import com.makuku.tmpk.models.client.PersonModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepo extends BaseRepo {

    public List<PersonModel> getPersonModelList() {

        String query = "select distinct client.client_id, email, address, phone, birthday_date, person_name, person_surname, person_daddyname\n" +
                "  from client, email, address, phone, birthday, person, physical_client\n" +
                "  where physical_client.client_id=client.client_id and physical_client.email_id=email.email_id and\n" +
                "  physical_client.address_id=address.address_id and physical_client.phone_id=phone.phone_id and\n" +
                "  physical_client.person_id=person.person_id and physical_client.birthday_id=birthday.birthday_id";

        return getObjects(query, PersonModel.class);
    }

}
