package com.kanda.labs.design.tokens

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

@Stable
public data class AppColorTokens(
    public val backgroundPrimary: Color,
    public val backgroundInversePrimary: Color,
    public val contentPrimary: Color,
    public val contentInversePrimary: Color,
    public val contentSecondary: Color,
    public val border: Color,
    val isLight: Boolean,
)

public val darkTokens: AppColorTokens = AppColorTokens(
    backgroundPrimary = AppColor.m800,
    backgroundInversePrimary = AppColor.n50,
    contentPrimary = AppColor.n50,
    contentInversePrimary = AppColor.m800,
    border = AppColor.n200,
    contentSecondary = AppColor.n50,
    isLight = false
)
public val lightTokens: AppColorTokens = AppColorTokens(
    backgroundPrimary = AppColor.n50,
    backgroundInversePrimary = AppColor.m600,
    contentPrimary = AppColor.m600,
    contentInversePrimary = AppColor.n50,
    border = AppColor.n200,
    contentSecondary = AppColor.m900,
    isLight = true
)