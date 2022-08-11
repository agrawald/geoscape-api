package au.com.mayi.geoscape.address.verification;

import au.com.mayi.geoscape.model.Geometry;
import au.com.mayi.geoscape.model.Properties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerificationRes{
    private String type;
    private Properties properties;
    private Geometry geometry;
    private String[] messages;
    private String attribution;
}
