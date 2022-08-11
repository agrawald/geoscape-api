package au.com.mayi.geoscape.model;

import au.com.mayi.geoscape.enums.ApiParameter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Format {
    private String name;
    private String source;
    private ApiParameter apiParameter;
}
