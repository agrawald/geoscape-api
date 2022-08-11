package au.com.mayi.geoscape.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TitleStatus {
    Titled("Titled"),
    Not_Titled("Not Titled");

    @Getter
    private final String key;
}
