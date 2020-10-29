/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.linemarker.php;

import com.magento.idea.magento2plugin.linemarker.LinemarkerFixtureTestCase;

public class ConfigurationTypeClassLinemarkerRegistrarTest extends LinemarkerFixtureTestCase {

    public void testTypeNameClassShouldHaveLinemarker() {
        myFixture.configureByFile(this.getFixturePath("Topmenu.php", "php"));

        assertHasLinemarkerWithTooltipAndIcon("Navigate to configuration", "/fileTypes/xml.svg");
    }

    public void testRegularPhpClassShouldNotHaveLinemarker() {
        myFixture.configureByFile(this.getFixturePath("ClassNotConfiguredInDiXml.php", "php"));

        assertHasNoLinemarkerWithTooltipAndIcon("Navigate to configuration", "/fileTypes/xml.svg");
    }
}
