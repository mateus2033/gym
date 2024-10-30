package com.dev.gerenciadorfichas.utils.uuid;

import com.dev.gerenciadorfichas.exception.ResourceIllegalArgumentException;
import java.util.UUID;

public class UuidUtil {

    public static UUID convertStringToUUID(String IdString) {
        try {
            return UUID.fromString(IdString);
        } catch (IllegalArgumentException e) {
            throw new ResourceIllegalArgumentException("Error converting string: " + IdString);
        }
    }
}
