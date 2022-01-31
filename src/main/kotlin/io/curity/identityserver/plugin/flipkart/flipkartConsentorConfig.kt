package io.curity.identityserver.plugin.flipkart

import se.curity.identityserver.sdk.config.Configuration
import se.curity.identityserver.sdk.config.annotation.Description

interface flipkartConsentorConfig: Configuration
{
    @Description("A parameter used for demo purposes")
    fun getDemoParameter(): Int
}
