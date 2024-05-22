package academy.atl.customers.entities;

import lombok.*;

import java.util.Objects;

//@Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode
//@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
}
