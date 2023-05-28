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
    public val warning: Color,
    val isLight: Boolean,
)

public val darkTokens: AppColorTokens = AppColorTokens(
    backgroundPrimary = AppColor.n900,
    backgroundInversePrimary = AppColor.n50,
    contentPrimary = AppColor.n50,
    contentInversePrimary = AppColor.n850,
    border = AppColor.n200,
    contentSecondary = AppColor.n50,
    warning = AppColor.y500,
    isLight = false
)
public val lightTokens: AppColorTokens = AppColorTokens(
    backgroundPrimary = AppColor.n50,
    backgroundInversePrimary = AppColor.m600,
    contentPrimary = AppColor.m600,
    contentInversePrimary = AppColor.n50,
    border = AppColor.n200,
    contentSecondary = AppColor.m900,
    warning = AppColor.y500,
    isLight = true
)