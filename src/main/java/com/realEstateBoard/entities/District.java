package com.realEstateBoard.entities;

public enum District {

    NONE("-"),
    KVARTAL103("103 квартал"),
    KVARTAL16(""),
    KVARTAL17(""),
    MKRN202AND203(""),
    SHKOLA2(""),
    SHKOLA31(""),
    AVIAGRUPPA(""),
    AVIAPORT(""),
    AVTOVOKSAL(""),
    AVTODOROJNAYA(""),
    APELSIN(""),
    beloeOsero(""),
    BORISOVKA2(""),
    VAVILON(""),
    viluiskiiTract(""),
    GIMEIN(""),
    glaznayaBolnica(""),
    GRES(""),
    DARKYLAH(""),
    DOMBYTA(""),
    drugiePrigorody(""),
    drugieRaiony(""),
    DSK(""),
    DSR(""),
    JATAI(""),
    ZALOG(""),
    KANGALASSY(""),
    KYRZAVOD(""),
    krestyanskiiRynok(""),
    krytyiRynok(""),
    MAGAN(""),
    maganskiiTrakt(""),
    MANCHAARY(""),
    MARHA(""),
    namskiiTrakt(""),
    namcyrskiiTrakt(""),
    oblastnayaBolnica(""),
    ploshadPobedy(""),
    pokrovskiiTrakt(""),
    poselokGazovikov(""),
    poselokGeologov(""),
    PRIGORODYI(""),
    PTICEFABRICA(""),
    rabochiiGorodokVodokanal(""),
    RadioCentr(""),
    rynokStolichnyi(""),
    SAISARY(""),
    SAHACIRK(""),
    sergelyahskoeShosse(""),
    staryiGorod(""),
    studGorodok(""),
    TABAGA(""),
    tulaginoKildyamci(""),
    ULUS(""),
    HATASSY(""),
    hatynUryahskoeShosse(""),
    centrPlDrujby(""),
    centrPlComsomolskaya(""),
    centrPlLenina(""),
    centrPlOrdjonikidze(""),
    YAGITI(""),
    YAGSHA(""),
    YAKSMK("");

    private String value;
    District (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
