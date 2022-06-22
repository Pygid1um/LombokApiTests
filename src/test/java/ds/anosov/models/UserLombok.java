package ds.anosov.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLombok {
    @JsonProperty("data")
    private User user;

    // берется ответ, который прислал GET запрос, описывается внешний ключ data, если таких ключей во вложенности
    //несколько, описываются таким образом все
    /*
    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
     */
}
