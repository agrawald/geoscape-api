package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchInfo
{
    private String batchId;
    private String downloadPath;
    private int estimatedCreditCost;
    private String estimatedRunTime;
    private int totalRows;
    private String progress;
    private String createdAt;
    private String modifiedAt;
    private String completedAt;
    private int executionRate;
}
