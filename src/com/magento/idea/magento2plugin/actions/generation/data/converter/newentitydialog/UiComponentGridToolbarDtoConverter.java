/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.actions.generation.data.converter.newentitydialog;

import com.magento.idea.magento2plugin.actions.generation.data.UiComponentGridToolbarData;
import com.magento.idea.magento2plugin.actions.generation.data.converter.DataObjectConverter;
import com.magento.idea.magento2plugin.actions.generation.data.dialog.EntityManagerContextData;
import com.magento.idea.magento2plugin.actions.generation.data.dialog.NewEntityDialogData;
import org.jetbrains.annotations.NotNull;

public class UiComponentGridToolbarDtoConverter extends UiComponentGridToolbarData
        implements DataObjectConverter {

    /**
     * Ui component grid toolbar DTO converter.
     *
     * @param generationContextData EntityManagerContextData
     * @param newEntityDialogData NewEntityDialogData
     */
    @SuppressWarnings("PMD.UnusedFormalParameter")
    public UiComponentGridToolbarDtoConverter(
            final @NotNull EntityManagerContextData generationContextData,
            final @NotNull NewEntityDialogData newEntityDialogData
    ) {
        super(
                newEntityDialogData.hasToolbar(),
                newEntityDialogData.hasToolbarBookmarks(),
                newEntityDialogData.hasToolbarColumnsControl(),
                newEntityDialogData.hasToolbarFullTextSearch(),
                newEntityDialogData.hasToolbarListingFilters(),
                newEntityDialogData.hasToolbarListingPaging()


        );
    }
}
