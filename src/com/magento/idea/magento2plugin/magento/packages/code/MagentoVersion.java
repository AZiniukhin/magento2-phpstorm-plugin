/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.magento.packages.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum MagentoVersion {

    ENTERPRISE_EDITION("magento/product-enterprise-edition", 1),
    COMMUNITY_EDITION("magento/product-community-edition", 2);

    private final String name;
    private final int priority;

    /**
     * Magento version Enum constructor.
     *
     * @param name String
     * @param priority int
     */
    MagentoVersion(final String name, final int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    /**
     * Get Magento Versions List.
     *
     * @return List[MagentoVersion]
     */
    public static List<MagentoVersion> getVersions() {
        final List<MagentoVersion> versions = new ArrayList<>(
                Arrays.asList(MagentoVersion.values())
        );
        versions.sort(
                (version1, version2) -> version1.getPriority() > version2.getPriority() ? 1 : 0
        );

        return versions;
    }

    /**
     * Get Magento Packages names.
     *
     * @return List[String]
     */
    public static List<String> getVersionsNames() {
        final List<String> names = new ArrayList<>();

        for (final MagentoVersion version : MagentoVersion.values()) {
            names.add(version.getName());
        }

        return names;
    }
}
