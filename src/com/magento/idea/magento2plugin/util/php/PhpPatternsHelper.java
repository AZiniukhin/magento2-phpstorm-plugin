/**
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.util.php;

import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.jetbrains.php.lang.PhpLanguage;
import com.jetbrains.php.lang.lexer.PhpTokenTypes;
import com.jetbrains.php.lang.patterns.PhpPatterns;
import com.jetbrains.php.lang.psi.elements.ArrayHashElement;
import com.jetbrains.php.lang.psi.elements.ParameterList;
import com.jetbrains.php.lang.psi.elements.PhpPsiElement;
import com.jetbrains.php.lang.psi.elements.StringLiteralExpression;

import static com.intellij.patterns.StandardPatterns.string;

public class PhpPatternsHelper {
    public static final ElementPattern<? extends PsiElement> STRING_METHOD_ARGUMENT =
        PhpPatterns
            .phpLiteralExpression()
            .withParent(
                PlatformPatterns
                    .psiElement(ParameterList.class)
                    .withParent(
                        PhpPatterns
                            .phpFunctionReference()
                    )
            ).withLanguage(PhpLanguage.INSTANCE);

    public static final ElementPattern<? extends PsiElement> CONFIGPHP_MODULENAME =
        PlatformPatterns.psiElement(StringLiteralExpression.class)
            .withSuperParent(5,PlatformPatterns.psiElement(ArrayHashElement.class)
                .withChild(PlatformPatterns.psiElement(PhpPsiElement.class)
                    .withChild(PlatformPatterns.psiElement(StringLiteralExpression.class)
                        .withText(string().contains("modules").withLength(9))
                    )
                )
            );

    public static final ElementPattern<? extends PsiElement> CONFIGPHP_COMPLETION =
        PlatformPatterns.psiElement(PhpTokenTypes.STRING_LITERAL_SINGLE_QUOTE)
            .withSuperParent(6, PlatformPatterns.psiElement(ArrayHashElement.class)
                .withChild(PlatformPatterns.psiElement(PhpPsiElement.class)
                    .withChild(PlatformPatterns.psiElement(StringLiteralExpression.class)
                        .withText(string().contains("modules").withLength(9))
                    )
                )
            );
}
