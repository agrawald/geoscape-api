package au.com.mayi.geoscape.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Source {
    ACT("ACT"),
    NSW("NSW"),
    NT("NT"),
    OT("OT"),
    QLD("QLD"),
    SA("SA"),
    TAS("TAS"),
    VIC("VIC"),
    WA("WA"),
    Geoscape_Australia("Geoscape Australia");

    @Getter
    private final String key;
}
