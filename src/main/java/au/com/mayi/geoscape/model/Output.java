package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Output {
    private String file;
    private String username;
    private String password;
    private Format[] format;
}
