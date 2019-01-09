package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserData {

    List<User> data;
}
