/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */
package com.magento.idea.magento2plugin.magento.files;

import com.intellij.lang.Language;
import com.intellij.lang.xml.XMLLanguage;

public class CrontabXmlTemplate implements ModuleFileInterface {
    public static String FILE_NAME = "crontab.xml";
    public static String TEMPLATE = "Magento Cron Tab XML";

    // code templates
    public static String TEMPLATE_CRONJOB_REGISTRATION = "Magento Crontab Cronjob Registration";

    // XML definitions
    public static String CRON_GROUP_TAG = "group";
    public static String CRON_GROUP_NAME_ATTRIBUTE = "id";
    public static String CRON_JOB_TAG = "job";
    public static String CRON_JOB_NAME_ATTRIBUTE = "name";

    @Override
    public String getFileName() {
        return FILE_NAME;
    }

    @Override
    public String getTemplate() {
        return TEMPLATE;
    }

    @Override
    public Language getLanguage() {
        return XMLLanguage.INSTANCE;
    }
}
