package au.com.mayi.geoscape.address.search.mailpoint;

import au.com.mayi.geoscape.model.Geometry;
import au.com.mayi.geoscape.model.ParsedQuery;
import au.com.mayi.geoscape.model.Properties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class MailPointRes{
    private Properties properties;
    private String type;
    private Geometry geometry;
    private String[] messages;
    private double pafVersion;
    private String pafExpiry;
    private double matchScore;
    private String query;
    private String attribution;
    private ParsedQuery parsedQuery;
    private String matchDiagnostic;
    private String matchDiagnosticMessage;
    private String matchType;
    private String detail;
}
