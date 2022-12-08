/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee_shop.Utilities;

/**
 *
 * @author kiwog
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

interface PriceFormatParsingBehaviours {
    
    String PriceNumberToPriceStringFormat (int PriceNumber) throws Exception;
    int PriceStringToPriceNumber (String PriceString) throws Exception;
}



public class PriceFormatParsing implements PriceFormatParsingBehaviours {
    
    @Override
    public String PriceNumberToPriceStringFormat (int PriceNumber) {
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        return kursIndonesia.format(PriceNumber);
        
    }
    
    @Override
    public int PriceStringToPriceNumber (String PriceString) throws Exception {
        
        return 0;
    }
    
}
