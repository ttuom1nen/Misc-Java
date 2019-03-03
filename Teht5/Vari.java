/*
 * Viikkoharjoitus 5, teht‰v‰ 6.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2014, Jorma Laurikkala.
 *
 * Abstrakti luokka v‰rille.
 *
 */

public abstract class Vari {

   /*
    * Abstraktit metodit.
    *
    */

   /* Sekoittaa t‰m‰n ja parametrina annetun v‰rin uudeksi v‰riksi ja palauttaa
    * viitteen sekoitetun v‰riseen olioon. Heitt‰‰ poikkeuksen, jos parametri on
    * virheellinen.
    */
   public abstract Vari sekoita(Vari v) throws IllegalArgumentException;

   /* Palauttaa viitteen vastav‰riseen olioon.
    */
   public abstract Vari vastavarita();
}
