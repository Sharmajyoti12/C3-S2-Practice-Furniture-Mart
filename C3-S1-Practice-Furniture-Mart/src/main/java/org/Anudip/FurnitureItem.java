/*Author name: Jyoti Sharma
 * DATE:12/23/2022
 *Created With:Intellij IDEA Community Edition
 */

package org.Anudip;

public class FurnitureItem {
    String furnitureCode;
   // String indoor;
    int grades;
    String color;
    String furnitureUsage;
    double price;
    //
    public void ValuesOfFields(){
        System.out.println("grade = " + grades);
        System.out.println("color = " + color);
        System.out.println("furnitureCode = " + furnitureCode);
        System.out.println("price = " + price);
        System.out.println("furnitureUsage = " + furnitureUsage);


    }


    /**created a method  name calculation  item
     * initializing variables inside it.
     */
        public double calculationDiscount() {

                return price = price - price * 5 / 100;

            }

    /**creating  a  null constructor
     *this keyword is using for reference of current object inside main;
     */
           FurnitureItem()
                {
                    furnitureUsage="plastic";
                    furnitureCode="S3452";
                    grades=1;
                    color= "blue";
                    price=500.00;


            }




}
