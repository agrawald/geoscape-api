package au.com.mayi.geoscape.batches;

import au.com.mayi.geoscape.enums.RequestType;
import au.com.mayi.geoscape.enums.Status;
import au.com.mayi.geoscape.model.*;
import au.com.mayi.geoscape.model.BatchInfo;
import au.com.mayi.geoscape.model.Input;
import au.com.mayi.geoscape.model.Output;
import au.com.mayi.geoscape.model.Parameters;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchRes {
    private RequestType type;
    private BatchInfo batchInfo;
    private Parameters parameters;
    private Input input;
    private Output output;
    private Status status;
    private String displayName;
}
