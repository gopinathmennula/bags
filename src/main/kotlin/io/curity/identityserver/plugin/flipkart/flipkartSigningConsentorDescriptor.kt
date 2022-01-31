package io.curity.identityserver.plugin.flipkart

import se.curity.identityserver.sdk.plugin.descriptor.SigningConsentorPluginDescriptor

class flipkartSigningConsentorDescriptor: SigningConsentorPluginDescriptor<flipkartConsentorConfig>
{
    override fun getConsentorType() = flipkartSigningConsentor::class.java

    override fun getPluginImplementationType() = "flipkart"

    override fun getConfigurationType() = flipkartConsentorConfig::class.java
}
