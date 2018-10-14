package com.software.architecture.homework2.models;

import java.util.Arrays;
import java.util.List;

public enum ResourceType {
        SU,
        OWNER,
        ADMIN,
        CLEANER,
        NEWCOMER;

        private static List<ResourceType> RESOURCETYPE_ORDER = Arrays.asList(SU, OWNER, ADMIN, CLEANER, NEWCOMER);

        public static ResourceType valueOfStr(String str) {
            return ResourceType.valueOf(str.toUpperCase());
        }

        public boolean isSuperiorTo(ResourceType resourceType) {
            System.out.println(RESOURCETYPE_ORDER.indexOf(this)+"  "+RESOURCETYPE_ORDER.indexOf(resourceType));
            if (RESOURCETYPE_ORDER.indexOf(this) < RESOURCETYPE_ORDER.indexOf(resourceType)) {
                return true;
            }
            return false;
        }
}
