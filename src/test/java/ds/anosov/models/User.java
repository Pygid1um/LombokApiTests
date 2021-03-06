package ds.anosov.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("email")
    private String email;
    //так как нужно записывать в перменные точное значение из JSON файла, а записать переменную в виде "first_name" нельзя,
    //для этого используют аннотацию @JsonProperty, в которой указывают точное название точное значение
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;

    /* ниже берется ответ, который прислал GET запрос

    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
    //создаем поля JSON документа, которые требуются для использования в тестах. Типы данных должны быть ссылочными
    //т.к. может вернуться null, а в примитивных типах null не запишется.
    */

}
