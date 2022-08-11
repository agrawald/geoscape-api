package au.com.mayi.geoscape.address.search.mailpoint;

import au.com.mayi.geoscape.enums.Dataset;
import au.com.mayi.geoscape.enums.MatchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MailPointReq {
    private String address;
    private Dataset dataset;
    private MatchType matchType;
}
