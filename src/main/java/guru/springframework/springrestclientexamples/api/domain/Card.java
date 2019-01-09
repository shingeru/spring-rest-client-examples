package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Card implements Serializable {

    private String type;
    private Long number;
    private ExpirationDate expirationDate;


}
