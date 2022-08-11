package au.com.mayi.geoscape.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ContributorStatus {
    Registered("Registered"),
    Approved("Approved"),
    Proposed("Proposed"),
    Gazetted("Gazetted"),
    Opening_Notified("Opening Notified"),
    Created("Created"),
    Undefined("Undefined"),
    ITS_Title("ITS Title"),
    Manual_Volume_Folia("Manual Volume/Folia"),
    Old_System("Old System"),
    Untitled("Untitled"),
    Acquired_Land("Acquired Land"),
    ITS_Title_Pending("ITS Title Pending"),
    Cancelled("Cancelled"),
    Cancelled_Residue_Remains("Cancelled Residue Remains"),
    Dummy("Dummy"),
    Consolidated_Title_of_Multiple_Lot("Consolidated Title of Multiple Lot");

    @Getter
    private final String key;
}
