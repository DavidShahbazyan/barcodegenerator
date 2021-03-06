package am.davsoft.barcodegenerator.builder.barcodedata;

import am.davsoft.barcodegenerator.api.WiFiEncryptionType;
import am.davsoft.barcodegenerator.api.barcodedata.WiFiNetworkBarcodeData;
import am.davsoft.barcodegenerator.builder.SimpleDataBuilder;
import am.davsoft.barcodegenerator.impl.barcodedata.WiFiNetworkBarcodeDataImpl;

/**
 * @author David Shahbazyan
 * @since Mar 04, 2017
 */
public class WiFiNetworkBarcodeDataBuilder implements SimpleDataBuilder<WiFiNetworkBarcodeData> {
    private String ssid;
    private String pass;
    private WiFiEncryptionType encryptionType;
    private boolean hidden;

    @Override
    public WiFiNetworkBarcodeData buildData() {
        WiFiNetworkBarcodeData data = new WiFiNetworkBarcodeDataImpl();
        data.setSsid(this.ssid);
        data.setPass(this.pass);
        data.setEncryptionType(this.encryptionType);
        data.setHidden(this.hidden);
        return data;
    }

    @Override
    public void reset() {
        this.ssid = null;
        this.pass = null;
        this.encryptionType = null;
        this.hidden = false;
    }

    public WiFiNetworkBarcodeDataBuilder withSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }

    public WiFiNetworkBarcodeDataBuilder withPass(String pass) {
        this.pass = pass;
        return this;
    }

    /**
     * @param encryptionType The security type [WPA|WEP|NONE]
     * @return
     */
    public WiFiNetworkBarcodeDataBuilder withEncryptionType(WiFiEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public WiFiNetworkBarcodeDataBuilder withHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }
}
