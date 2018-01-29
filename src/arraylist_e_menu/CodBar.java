/*
 * The MIT License
 *
 * Copyright 2018 Alexandro / xKrasto.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package arraylist_e_menu;

import PersonalLib.Input;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class CodBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coda codaOrdinazioni = new Coda();
        Ordine ord;
//        ord = new Ordine(5, "4 caffe'");
//        codaOrdinazioni.aggiungi(ord);
//        System.out.println("––Aggiunto ordine");
//        ord = new Ordine(3, "2 bibite");
//        codaOrdinazioni.aggiungi(ord);
//        System.out.println("––Aggiunto ordine");
//        ord = new Ordine(11, "1 caffe' e 2 bibite");
//        codaOrdinazioni.aggiungi(ord);
//        System.out.println("––Aggiunto ordine");
//        ord = (Ordine) codaOrdinazioni.togli();
//        System.out.println("Soddisfatto ordine:");
//        System.out.println(ord);
//        ord = new Ordine(15, "1 cappuccino");
//        codaOrdinazioni.aggiungi(ord);
//        System.out.println("––Aggiunto ordine");
//        ord = (Ordine) codaOrdinazioni.togli();
//        System.out.println("Soddisfatto ordine:");
//        System.out.println(ord);
////        ord.stampa();
//        ord = (Ordine) codaOrdinazioni.togli();
//        System.out.println("Soddisfatto ordine:");
////        ord.stampa();
//        System.out.println(ord);
//        ord = (Ordine) codaOrdinazioni.togli();
//        System.out.println("Soddisfatto ordine:");
////        ord.stampa();
//        System.out.println(ord);
        boolean done = false;
        int risposta, tav;
        String ordine;
        do {
            do {
                risposta = Input.reqInt("\n1. Aggiungi ordine\n"
                        + "2. Esegui ordine\n"
                        + "3. Mostra ordini in attesa\n"
                        + "4. Esci\n");
            } while (risposta <= 0 || risposta > 4);
            switch (risposta) {
                case 4:
                    done = true;
                    break;
                case 1: {
                    tav = Input.reqInt("Inserisci il tavolo: ");
                    ordine = Input.reqString("Inserisci l'ordine: ");
                    ord = new Ordine(tav, ordine);
                    codaOrdinazioni.aggiungi(ord);
                    break;
                }
                case 2: {
                    if (!codaOrdinazioni.vuota()) {
                    ord = (Ordine) codaOrdinazioni.togli();
                    System.out.println(ord);
                    }
                    else System.out.println("Non c'è nessun ordine!");
                    break;
                }
                case 3: {
                    if (!codaOrdinazioni.vuota()) {
                        Iterator it = codaOrdinazioni.iterator();
                        while (it.hasNext()) {
                            Ordine next = (Ordine) it.next();
                            System.out.println("\n" + next);
                        }
                    } else System.out.println("Non c'è nessun ordine!");
                    break;
                }
                default:
                    break;
            }
        } while (!done);

    }
}
