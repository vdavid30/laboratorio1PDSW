/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.LinkedHashMap;

/**
 *
 * @author hp
 */
public class StaticCorr implements CorrMethod {
    private final LinkedHashMap<String, String> engEquivalencesMap = new LinkedHashMap<>();

    public String check(String word){
        engEquivalencesMap.put("absolutly", "absolutely");
        engEquivalencesMap.put("absorbsion", "absorption");
        engEquivalencesMap.put("absorbtion", "absorption");
        engEquivalencesMap.put("abudance", "abundance");
        engEquivalencesMap.put("abundacies", "abundances");
        engEquivalencesMap.put("abundancies", "abundances");
        engEquivalencesMap.put("abundunt", "abundant");
        engEquivalencesMap.put("abutts", "abuts");
        engEquivalencesMap.put("acadamy", "academy");
        engEquivalencesMap.put("acadmic", "academic");
        engEquivalencesMap.put("accademic", "academic");
        String res = engEquivalencesMap.get(word);
        if (res == null) {
            return null;
        } else {
            return res;
        }
    }
}
