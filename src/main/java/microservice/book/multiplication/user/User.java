package microservice.book.multiplication.user;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Store information to identify the user.
 */
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private Long id;
    private String alias;
}
