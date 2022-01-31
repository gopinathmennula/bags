package io.curity.identityserver.plugin.flipkart

import se.curity.identityserver.sdk.oauth.consent.SigningConsentorResult
import se.curity.identityserver.sdk.oauth.consent.signing.SigningConsentor

class flipkartSigningConsentor(private val _configuration: flipkartConsentorConfig): SigningConsentor
{
    override fun start(textToDisplay: String, objectToSign: String): SigningConsentorResult
    {
        TODO()
    }

    override fun poll(): SigningConsentorResult
    {
        TODO()
    }

    override fun cancel()
    {
        TODO()
    }
}
